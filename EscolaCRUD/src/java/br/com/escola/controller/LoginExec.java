package br.com.escola.controller;

import br.com.escola.model.Usuario;
import br.com.escola.repository.UsuarioDAO;
import br.com.escola.util.Util;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.List;
import javax.servlet.http.HttpSession;

public class LoginExec extends HttpServlet 
{
    protected void validarLogin(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException 
    {
        try
        {    
        response.setContentType("text/html;charset=UTF-8");
        HttpSession session = request.getSession();
        //pegar dados do form
        String ema = request.getParameter("ema");
        String sen = request.getParameter("sen");
        sen = Util.sha1(sen);
        //consultar dados usando classe DAO
        UsuarioDAO daousu = new UsuarioDAO();
        List<Usuario> lstusu = daousu.validar(ema, sen);
        //se der certo, vai para a página de adm
        String destino = "";
        String msg = "";
        //se deu certo, vai para a página de adm
        if(lstusu.size() > 0)
        {
            Usuario usu = lstusu.get(0);//pega o primeiro objeto Usuario da lista
            session.setAttribute("usu", usu);//cria uma variavel de sessão com este objeto
            destino = "dashboard.jsp";//categorias.jsp, categorias-insert.jsp
        }
        //se der errado volta para o login por aviso
        else
        {
            msg = "erro";
            destino = "./?msg="+msg;
        }
        response.sendRedirect(destino);
        }
        catch (Exception e)
        {
           
        }    
    }

   
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        //fazer outra ação para dados enviados por get
        HttpSession session = request.getSession();
        session.setAttribute("usu", null);
        session.invalidate();
        response.sendRedirect("index.jsp");
    }

    
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        validarLogin(request, response);
    }

    
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
