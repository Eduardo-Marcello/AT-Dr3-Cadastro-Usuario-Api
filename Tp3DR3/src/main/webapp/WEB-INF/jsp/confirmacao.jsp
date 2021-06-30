<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css">
<title>Confirmação</title>
</head>
<body>

	<div class="container">
		<h1>Confirmação de Cadastro</h1>
	</div>

	<table class="table">
		<tbody>
			<div class="container">
				<h2>
					<c:out value="${usuario.name}"></c:out>
					<c:out value="${usuario.email}"></c:out>
				</h2>
			</div>
		</tbody>
	</table>

	<a href="login">Login</a>
</body>
</html>