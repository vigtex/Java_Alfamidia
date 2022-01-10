<%-- 
    Document   : exemplo01
    Created on : 21 de nov. de 2021, 19:23:41
    Author     : Usuario
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Projeto 08 - Exemplo 01 - JDBC</title>
    </head>
    <body>
        <h1>Projeto 08 - Exemplo 01 - JDBC - Consulta</h1>
        
        Para usar a API JDBC (JAva DataBase Connectivity) com JSP
        temos os mesmos "quatro" passos utilizados
        no Java SE
        <br/><br/>
        
        1) Identificar a fonte e efetuar a conexão<br/>
        2) Criar o SQL e o objeto que representa esse comando<br/>
        3) Obter o resultado da execução do SQL e manipular<br/>
        4) Fechar a conexão
        <br/><br/>
        
        <%@page import ="java.sql.*"%>
        <%
        //Identificar qual é o SGBD
        Class.forName("com.mysql.jdbc.Driver");
        
        //conectar efetivamente com o SGBD
        String host = "jdbc:mysql://localhost/alfajava";
        String user = "root";
        String pass = "";
        Connection conn;
        conn = DriverManager.getConnection(host, user, pass);
        
        //criar o objeto para manpulação dos SQLs
        Statement stmt = conn.createStatement();
        
        //criar o comando e executar
        String sql = "select * from curso";
        ResultSet rset = stmt.executeQuery(sql);
        
        //manipulação do resultado
        while (rset.next())
        {
            out.print("<div background-color = lighgray>");
            out.print("<strong>" + rset.getString("nome")+ " - ");
            out.print("R$ "+ rset.getFloat("valor")+ "</strong><br/>");
            out.print(rset.getString("descricao")+ "<br/><br/>");
            out.print("</div>");
        }
        
        //fechar os objetos de manipulação do SGBD
        rset.close();
        stmt.close();
        conn.close();
        
        %>
       <a href="index.html">volta</a> 
    </body>
</html>
