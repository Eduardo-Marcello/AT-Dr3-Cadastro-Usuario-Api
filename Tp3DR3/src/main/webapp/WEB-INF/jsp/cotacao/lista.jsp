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
<title>Listagem</title>
</head>
<body>
	<div class="container">
		<c:if test="${not empty cotacoes}">
			<table class="table table-striped">
				<thead>
					<tr>
						<th>Id</th>
						<th>Preço</th>
						<th>Id produto</th>
					</tr>
				</thead>
				<tbody>
					<c:forEach var="c" items="${cotacoes}">
						<tr>
							<td>${c.id}</td>
							<td>${c.preco}</td>
							<td>${c.produto.idProduto}</td>
							<td><a href="/cotacao/${c.id}/excluir">excluir</a></td>
						</tr>
					</c:forEach>
				</tbody>
			</table>
		</c:if>
		<c:if test="${empty cotacoes}">
			<h3>Nenhuma cotação foi cadastrado!</h3>
		</c:if>
	</div>

</body>
</html>