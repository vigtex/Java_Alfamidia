package serv;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet(name = "FileController", urlPatterns = {"/exec"})
public class FileController extends HttpServlet {

   protected void gravarDados(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        try 
        {
            if (request.getParameter("sub") != null) 
            {
            //pegar nome, e mail e texto
            String nom = request.getParameter("nom");
            String ema = request.getParameter("ema");
            String txt = request.getParameter("txt");

            String linha = nom + " # " + ema + " # " + txt;

            String dir = request.getRealPath("/");
            String arq = dir + "/txt/dados.txt";
            FileWriter fw = new FileWriter(arq, true);
            BufferedWriter bw = new BufferedWriter(fw);
            PrintWriter pw = new PrintWriter(bw);
            pw.println(linha); // o metodo println jÃ¡ coloca \n no final
            pw.close();
            bw.close();
            fw.close();
            }
        //direcionar para a pagina de visualizaÃ§Ã£o
        response.sendRedirect("jsp/livro-view.jsp")	;
            
        }
        finally
        {
            out.close();
        }    
    }
   protected void fazNada(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        try 
        {
            out.println("metodo sem retorno");
            
        }
        finally
        {
            out.close();
        }    
    }

   
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        fazNada(request, response);
    }

   
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        gravarDados(request, response);
    }

   
    @Override
    public String getServletInfo() {
        return "Short description";
    }

}
