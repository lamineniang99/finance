package com.domaine.finance.controller;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.domaine.finance.dto.UserDto;
import com.domaine.finance.service.IUserService;
import com.domaine.finance.service.UserService;


@WebServlet( name = "admin", value = "/admin")
public class AdminServlet extends HttpServlet{

	private IUserService userService = new UserService() ;
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
	    req.setAttribute("userList", userService.getAll());
	    req.getRequestDispatcher("WEB-INF/jsp/employes/employes.jsp").forward(req, resp);
	}

	
}
