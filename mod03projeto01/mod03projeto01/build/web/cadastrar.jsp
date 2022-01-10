<%-- 
    Document   : cadastrar
    Created on : 27 de nov. de 2021, 18:53:41
    Author     : Usuario
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Módulo 03 - Projeto 01 - Tela de Cadastro</title>
    </head>
    <body>
        <h1>Módulo 03 - Projeto 01 - Tela de Cadastro</h1>
        <form action = "exec" method="post">
            Nome do Curso: <br/>
            <input type="text" name="nom"/>
            <br/><br/>
           
            Descrição do Curso: <br/>
            <textarea name="des"></textarea>
            <br/><br/>
            
            Valor do Curso: <br/>
            <input type="text" name="val"/>
            <br/><br/>
            <input type="hidden" name="tip" value="insert">
            <button>Cadastrar</button>
        </form>
        <br/><hr/><br/>
        <a href="index.jsp">Voltar</a>
    </body>
</html>
