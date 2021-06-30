<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<title>Desenvolvimento Web com Java EE - TP3</title>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css">
<link href="<c:url value='recursos/style.css'/>" rel="stylesheet" />
<script>
function validar(){
	
}
</script>
</head>
<body>
	<div class="jumbotron text-center">
		<h1>Login</h1>
	</div>

	<div class="wrapper fadeInDown">
		<div id="formContent">

			<form action="/usuario/validacao" method="post">
				<div class="form-group">
					<label>Login:</label> <input type="text" class="form-control"
						name="email" id="email" required="">
				</div>

				<div class="form-group">
					<label>Senha:</label> <input type="password" class="form-control"
						name="password" id="password" required="">
				</div>

				<div class="form-group">
					<input type="submit" id="submit" class="btn-primary" value="Login">
				</div>
			</form>

			<div id="formFooter">
				<a class="underlineHover" href="">Esqueceu a senha?</a>
			</div>

			<div id="formFooter">
				<a class="underlineHover" href="usuario/cadastro">Não possui
					cadastro?</a>
			</div>
		</div>
	</div>
</body>
</html>