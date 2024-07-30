<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<jsp:include page="../navbar.jsp"></jsp:include>

		<h1>Liste des employes</h1>
		<div class="container">
			<table class="table table-bordered table-striped table-hover">
			  <thead>
			    <tr>
			      <th scope="col">ID</th>
			      <th scope="col">First Name</th>
			      <th scope="col">Last Name</th>
			       <th scope="col">Email</th>
			    </tr>
			  </thead>
			  <tbody>
			   <c:forEach items="${userList}" var="user">
			    <tr>
			      <td>${ user.id}</td>
			      <td>${user.firstName}</td>
			      <td>${user.lastName}</td>
			      <td>${user.email}</td>
			    </tr>
			   </c:forEach>
			  </tbody>
			</table>
		</div>
	</body>
</html>