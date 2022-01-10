<%-- 
    Document   : exemplo02
    Created on : 22 de nov. de 2021, 11:24:20
    Author     : Usuario
--%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/sql" prefix="sql"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Projeto 09 - Exemplo 02 - JSTL</title>
    </head>
    <body>
        <h1>Projeto 09 - Exemplo 02 - Conexão ao SGBD usando JSTL - Inclusão</h1>
        
        Teste de cadastro (INSERT) usando SQL
        <form action = "exemplo02.jsp" method="post">
            Nome do Curso: <br/>
            <input type="text" name="nom"/>
            <br/><br/>
           
            Descrição do Curso: <br/>
            <textarea name="des"></textarea>
            <br/><br/>
            
            Valor do Curso: <br/>
            <input type="text" name="val"/>
            <br/><br/>
            
            <input type="submit" name="sub" value="Cadastrar"/>
        </form>
        <br/><hr/><br/>
        <%@page import ="java.sql.*"%>
        
    <c:if test="${param.sub != null}">    
        <c:catch var = "er">

	<%--TAG para fazer a conexão com BD e deixar uma variável com a referência--%>
	<sql:setDataSource driver = "com.mysql.jdbc.Driver"
					   user = "root"
					   password=""
					   url="jdbc:mysql://localhost/alfajava"
					   var="con"/>
	<%--TAG que executa a inclusão no BD--%>					   
	<sql:update var="res" dataSource="${con}">
		insert into curso(nome, descricao, valor) 
                values('${param.nom}', '${param.des}', ${param.val})
	</sql:update>
	
	<c:if test="${res > 0}">
            Curso Cadastrado
	</c:if>
            
	</c:catch>
            
	<c:if test="${er != null}">
            Houve um bug ${er}
	</c:if>
        
    </c:if>        
        <br/>
        <a href="index.html">Voltar</a>
        
    </body>
</html>
