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
		<br>
		<br>
		<div class="container">
			<form method="post" action="admin">
			<div class="row mb-3">
			    <label for="inputEmail3" class="col-sm-2 col-form-label">Fist name</label>
			    <div class="col-sm-10">
			      <input type="text" name="firstName" class="form-control" id="inputEmail3">
			    </div>
			  </div>
			<div class="row mb-3">
			    <label for="inputEmail3" class="col-sm-2 col-form-label">Last Name</label>
			    <div class="col-sm-10">
			      <input type="texte" name="lastName" class="form-control" id="inputEmail3">
			    </div>
			  </div>
			  <div class="row mb-3">
			    <label for="inputEmail3" class="col-sm-2 col-form-label">Email</label>
			    <div class="col-sm-10">
			      <input type="email" name="email" class="form-control" id="inputEmail3">
			    </div>
			  </div>
			  <div class="row mb-3">
			    <label for="inputPassword3" class="col-sm-2 col-form-label">Password</label>
			    <div class="col-sm-10">
			      <input type="password" name="password" class="form-control" id="inputPassword3">
			    </div>
			  </div>
			  <button type="submit" class="btn btn-primary">Sign in</button>
			</form>
		</div>
	</body>
</html>