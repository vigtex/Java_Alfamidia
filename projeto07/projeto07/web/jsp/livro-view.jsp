<!DOCTYPE html>
<html>
<head>
	<title>Livro de Visitas</title>
	<link rel="stylesheet" type="text/css" href="../css/default.css">
</head>
<body>
	<div id = "geral">
		
		<div id = "header">
			
		</div>

		<div id = "menu">
			<a href="livro-view.jsp" title="Ver Recados">Ver Recados</a>
			<a href="livro-form.jsp" title="Gravar Recado">Gravar Recado</a>

		</div>

		<div id = "content">
			<h1>Lista dos Recados Gravados</h1>
			
                        <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
                        <%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>
                        <jsp:useBean class= "serv.FileData" id="arq"/>
                        <c:forEach items="${arq.texto}" var= "linha">
                            <c:set var="vet" value="${fn:split(linha,'#')}"/>
                            <div id='teste'>
                            ${vet[2]}<br/>
                            <strong>${vet[0]} | ${vet[1]}</strong>
                            </div>
                        </c:forEach>
                        
		</div>

		<div id = "footer">
			by Virgilio
		</div>
	</div>

</body>
</html>