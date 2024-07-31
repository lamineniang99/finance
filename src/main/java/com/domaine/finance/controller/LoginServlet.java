package com.domaine.finance.controller;

import java.io.IOException;
import java.util.Optional;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.hibernate.annotations.common.util.impl.LoggerFactory;

import com.domaine.finance.dto.UserDto;
import com.domaine.finance.service.IUserService;
import com.domaine.finance.service.UserService;

import ch.qos.logback.classic.Logger;

@WebServlet( name = "login", value = "/login")
public class LoginServlet extends HttpServlet{
	
	private IUserService userService = new UserService() ;

	private Logger log = (Logger) org.slf4j.LoggerFactory.getLogger(LoginServlet.class) ;
	@Override
	public void init(ServletConfig config) throws ServletException {
	}
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		req.getRequestDispatcher("index.jsp").forward(req, resp);
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String email = req.getParameter("email") ;
		String password = req.getParameter("password") ; 
		log.info("email : {} et password : {}", email, password);
		Optional<UserDto> user = userService.login(email, password);
		if (user.isPresent()) {
			req.getSession().setAttribute("username", email);
			resp.sendRedirect("welcome");
		} else {
			resp.sendRedirect("login");
		}
	}
}
