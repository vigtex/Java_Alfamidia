<%@page import="br.com.escola.model.Usuario" %>
<%
    if(session.getAttribute("usu") == null)
    {
        //response.sendRedirect("index.jsp");
        RequestDispatcher despachador = request.getRequestDispatcher("index.jsp");
        despachador.forward(request, response);
    }
    Usuario usu = (Usuario) session.getAttribute("usu");
%>
