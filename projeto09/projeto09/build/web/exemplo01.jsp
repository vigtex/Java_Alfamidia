<%-- 
    Document   : exemplo01
    Created on : 22 de nov. de 2021, 11:06:17
    Author     : Usuario
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Projeto 09 - Exemplo 01 - JSTL</title>
        <link rel="stylesheet" type="text/css" href="projeto09.css">
    </head>
    <body>
        <h1>Projeto 09 - Exemplo 01 - Conexão ao SGBD usando JSTL</h1>
        
        <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
	<%@ taglib uri="http://java.sun.com/jsp/jstl/sql" prefix="sql"%>
	É menos comum usar as tags de acesso a dado com JSTL.<br/>
        Normalmente usamos classes DAO ou frameworks para isso e não diretamente pelo JSP.<br/>
        De qualquer maneira, nada impede de fazer <b>TODO</b> um projeto usando somente JSTL.
	<br/><br/>
	<c:catch var = "er">

	<%--TAG para fazer a conexão com BD e deixar uma variável com a referência--%>
	<sql:setDataSource driver = "com.mysql.jdbc.Driver"
					   user = "root"
					   password=""
					   url="jdbc:mysql://localhost/alfajava"
					   var="con"/>
	<%--TAG que executa uma instrução sql e obtem o resultado--%>					   
	<sql:query var="res" dataSource="${con}">
		select * from curso
	</sql:query>
	
	<%--TAGs para listar o resultado obtido na consulta--%>	
	<c:forEach items="${res.rows}" var="linha">
        <div id='curso'>
            <b><center>${linha.nome} - ${linha.valor}</center></b>
	<br/>
	<i>${linha.descricao}</i>
        </div>
	<br/><br/>
	</c:forEach>
	</c:catch>
	<c:if test="${er != null}">
	Houve um bug ${er}
	</c:if>
        <br/>
        <a href="index.html">Voltar</a> 
    </body>
</html>
