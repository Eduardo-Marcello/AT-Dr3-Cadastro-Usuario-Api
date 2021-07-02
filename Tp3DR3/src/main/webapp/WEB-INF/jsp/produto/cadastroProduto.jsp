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
		<form action="/registraProduto" method="post">

			<div class="form-group">
				<label>Código:</label> <input type="number" class="form-control"
					name="codigoProduto" id="codigoProduto" required="">
			</div>


			<div class="form-group">
				<label>Nome:</label> <input type="text" class="form-control"
					name="nomeProduto" id="nomeProduto" required="">
			</div>

			<div class="form-group">
				<label>Classificação:</label> <input type="text"
					class="form-control" name="classificacao" id="classificacao"
					required="">
			</div>

			<div class="form-group">
				<input type="submit" id="submit" class="btn-primary"
					value="Cadastrar">
			</div>

		</form>
	</div>

</body>
</html>