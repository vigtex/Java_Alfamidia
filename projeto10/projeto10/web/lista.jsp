<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/sql" prefix="sql"%>
<%@include file="_conex.jsp"%>
<%@include file="_top.jsp"%>

<div id="content">
    <h1> Lista dos Cursos Disponíveis</h1>
    <%--usar JSTL para exibir uma lista de cursos--%>
    <c:catch var = "er">



        <%--TAG que executa uma instrução sql e obtem o resultado--%>					   
        <sql:query var="res" dataSource="${con}">
            select * from curso
        </sql:query>

        <%--TAGs para listar o resultado obtido na consulta--%>	
        <c:forEach items="${res.rows}" var="linha">
            <div id="curso">
                <b><center>${linha.nome} - R$ ${linha.valor}</center></b>
                <br/>
                <i>${linha.descricao}</i>
            </div>
            <br/><br/>
        </c:forEach>
    </c:catch>
    <c:if test="${er != null}">
        Houve um bug ${er}
    </c:if>

</div>

<%@include file="_bottom.jsp"%>
