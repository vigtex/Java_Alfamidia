<%@ taglib uri="http://java.sun.com/jsp/jstl/sql" prefix="sql"%>
<%--TAG para fazer a conex�o com BD e deixar uma vari�vel com a refer�ncia--%>
        <sql:setDataSource driver = "com.mysql.jdbc.Driver"
                           user = "root"
                           password=""
                           url="jdbc:mysql://localhost/alfajava"
                           var="con"/>