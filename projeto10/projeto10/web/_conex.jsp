<%@ taglib uri="http://java.sun.com/jsp/jstl/sql" prefix="sql"%>
<%--TAG para fazer a conexão com BD e deixar uma variável com a referência--%>
        <sql:setDataSource driver = "com.mysql.jdbc.Driver"
                           user = "root"
                           password=""
                           url="jdbc:mysql://localhost/alfajava"
                           var="con"/>