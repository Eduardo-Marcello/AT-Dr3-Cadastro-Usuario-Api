<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css">
        <link href="<c:url value='recursos/style.css'/>" rel="stylesheet"/>
        <title>Cadastro</title>
    </head>
    <body>
        <div class="container">
            <div class="col-md-6">
                <h1>Alterar dados do Produto</h1>
                <div>
                    <form:form action="salvarproduto" method="post" modelAttribute="produto">
                        <div class="form-group">
                            ID: ${produto.idProduto}
                                <form:hidden path="idProduto"/>
                        </div>
                         <div class="form-group">
                            Código:
                            <form:input path="codigoProduto"/>
                        </div>
                        <div class="form-group">
                            Nome:
                            <form:input path="nomeProduto"/>
                        </div>
                        <div class="form-group">
                            Classificação:
                            <form:input path="classificacao"/>
                        </div>
                        <div class="form-group">
                            <input type="submit" id="submit" class="btn-primary" value="Salvar">
                        </div>
                    </form:form>
                </div>
            </div>
        </div>
    </body>

