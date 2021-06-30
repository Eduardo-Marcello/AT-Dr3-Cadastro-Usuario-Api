<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css">
<title>Listagem</title>
</head>
<body>
	<div class="container">
		<c:if test="${not empty produtos}">
			<table class="table table-striped">
				<thead>
					<tr>
						<th>Id</th>
						<th>Codigo</th>
						<th>Nome</th>
						<th>Classificação</th>
						<th>Cotação</th>
					</tr>
				</thead>
				<tbody>
					<c:forEach var="p" items="${produtos}">
						<tr>
							<td>${p.idProduto}</td>
							<td>${p.codigoProduto}</td>
							<td>${p.nomeProduto}</td>
							<td>${p.classificacao}</td>
							<td>${p.cotacao}</td>
						</tr>
					</c:forEach>
				</tbody>
			</table>
		</c:if>
		<c:if test="${empty produtos}">
			<h3>Nenhum produto foi cadastrado!</h3>
		</c:if>
	</div>
</body>
</html>