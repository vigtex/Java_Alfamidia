<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%--
<%@page import="java.util.List" %>
<%@page import="model.CursoDAO" %>
<%@page import="model.Curso" %>
--%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<jsp:useBean class="model.CursoDAO" id="lista"/>
<%--
    CursoDAO dao = new CursoDAO();
    List<Curso> lst = dao.listar();
--%>
<%--<c:set var="lista" value="<%=lst%>"/>--%>



<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Módulo 03 - Projeto 01 - INDEX</title>
    </head>
    <body>
        <%
        // obter uma lista dos cursos do Banco de Dados
        //criar um objeto cursoDAO
        //obter a lista de cursos => obj.listar();
        //foreach();
        //para gravar um novo curso no banco de dados
        //criar um objeto curso
        //ajustar os valores => obj.setNome(), obj.setValor(), etc
        //depois, criar um objeto curso DAO
        //ai sim, usar um metodo para gravar => dao.inserir(obj)
        %>
        <div align="center">
        <h1>Módulo 03 - Projeto 01 - INDEX</h1>
        <h3>Mapeamento de Objeto Relacional - ORM</h3>
        <h3>Classes de Manipulação de Dados - DAO</h3>
        
        
        <a href="cadastrar.jsp">Tela de cadastro do novo curso</a>
        <br/><br/>
         <a href="atualizar.jsp">Tela de atualização do curso</a>
        <br/><br/>
        <h1><i>LISTA DE CURSOS</i></h1>
        </div>
        <br/><br/>
        <c:forEach items="${lista.cursos}" var="objcur">
            <strong>${objcur.nome} - ${objcur.valor}</strong>
            <br/>
            ${objcur.descricao}
            <br/>
            <a href="atualizar.jsp?cod=${objcur.codigo}">[ Atualizar ]</a> ::
            <a href="exec?tip=delete&cod=${objcur.codigo}">[ Excluir ]</a>
            <br/><br/>
        </c:forEach>    
    </body>
</html>
