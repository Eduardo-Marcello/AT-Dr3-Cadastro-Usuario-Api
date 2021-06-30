<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
    <head>
        <title>Desenvolvimento Web com Java EE - TP3</title>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css">
        <link href="<c:url value='recursos/style.css'/>" rel="stylesheet"/>
    </head>
<body>
	<div class="jumbotron text-center">
            <h1>Cadastro</h1>
	</div>
		
	<div class="container">
            <form action="/cadastrar" method="post">
			
                <div class="form-group">
                    <label>Nome:</label>
                    <input type="text" class="form-control" name="name" id="name" required="">
                </div>
			
                <div class="form-group">
                    <label>Email:</label>
                    <input type="email" class="form-control" name="email" id="email" required="">
                </div>
			
                <div class="form-group">
                    <label>Password:</label>
                    <input type="password" class="form-control" name="password" id="password" required="">
                </div>
			
                 <div class="form-group">
                    <input type="submit" id="submit" class="btn-primary" value="Cadastrar">
                </div>
			
            </form>
	</div>
</body>
</html>