<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css">
        <link href="<c:url value='recursos/style.css'/>" rel="stylesheet"/>
<title>Cadastro</title>
</head>
<body>

	<div class="jumbotron text-center">
		<h1>Cadastro</h1>
	</div>

	<div class="container">
		<form action="/registraCotacao" method="post">

			<div class="form-group">
				<label>Produto:</label> <select name="produto.idProduto"
					class="form-control">
					<c:forEach var="p" items="${produtos}">
						<option value="${p.idProduto}">${p.nomeProduto}</option>
					</c:forEach>
				</select>
			</div>

			<div class="form-group">
				<label>Preço:</label> <input type="number" step="0.01"
					class="form-control" name="preco" id="preco" required="">
			</div>

			<div class="form-group">
				<input type="submit" id="submit" class="btn-primary"
					value="Cadastrar">
			</div>

		</form>
	</div>

</body>
</html>