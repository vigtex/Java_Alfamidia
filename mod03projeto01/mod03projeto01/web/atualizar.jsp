<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@page import="model.CursoDAO" %>
<%@page import="model.Curso" %>


<%
    String cod = request.getParameter("cod");
    CursoDAO dao = new CursoDAO();
    Curso obj = dao.buscar("codigo="+cod);
%>
<c:set var="curso" value="<%=obj%>"/>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Módulo 03 - Projeto 01 - Tela de Atualização</title>
    </head>
    <body>
        <h1>Módulo 03 - Projeto 01 - Tela de Atualização</h1>
        <form action = "exec" method="post">
            <input type="number" name="cod" readonly="true" value="${curso.codigo}"/>
            <br/><br/>
            
            Nome do Curso: <br/>
            <input type="text" name="nom" value="${curso.nome}"/>
            <br/><br/>
           
            Descrição do Curso: <br/>
            <textarea name="des">${curso.descricao}</textarea>
            <br/><br/>
            
            Valor do Curso: <br/>
            <input type="text" name="val" value="${curso.valor}"/>
            <br/><br/>
            <input type="hidden" name="tip" value="update">
            <button>Atualizar</button>
        </form>
        <br/><hr/><br/>
        <a href="index.jsp">Voltar</a>
    </body>
</html>
