<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Cadastro</title>
</head>
<body>

	<div class="jumbotron text-center">
		<h1>Cadastro</h1>
	</div>

	<div class="container">
		<form action="/cadastrar" method="post">

			<div class="form-group">
				<label>C�digo:</label> <input type="number" class="form-control"
					name="codigoProduto" " id="codigoProduto" required="">
			</div>


			<div class="form-group">
				<label>Nome:</label> <input type="text" class="form-control"
					name="nomePrdouto" id="nomeProduto" required="">
			</div>

			<div class="form-group">
				<label>Classifica��o:</label> <input type="text"
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