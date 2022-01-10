package serv;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ControleDeCurso extends HttpServlet {

    protected void listarCursos(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        try {
            out.println("Sem implementação ainda");
        } finally {
            out.close();
        }
    }
    //acesso via post
    protected void gravarCursos(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        //PrintWriter out = response.getWriter();
        String msg = "";
        try 
        {
              
            //pegar parametros e fazer verificações
            if (request.getParameter("sub") != null) {
                
                //conectar com banco de dados
                Class.forName("com.mysql.jdbc.Driver");
                String host = "jdbc:mysql://localhost/alfajava";
                String user = "root";
                String pass = "";
                Connection conn;
                conn = DriverManager.getConnection(host, user, pass);
                
                //montar comando SQL para inserção
                //executar o comando SQL
                String nom = request.getParameter("nom");
                String des = request.getParameter("des");
                String val = request.getParameter("val");
                String sql = "insert into curso (nome, descricao, valor)"
                        + " values "
                        + "(?, ?, ?)";
                
                //se deu certo, direciona para a lista        
                PreparedStatement stmt = conn.prepareStatement(sql);
                stmt.setString(1, nom);
                stmt.setString(2, des);
                stmt.setFloat(3, Float.parseFloat(val));
                int res = stmt.executeUpdate();
                if (res > 0) {
                    
                    msg = "Ok";
                } else {
                    msg = "bug";
                }

                stmt.close();
                conn.close();

            }
        } 
        catch(Exception e)
        {
            msg = "bug";
        }
        response.sendRedirect("lista.jsp?msg=" + msg);
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        listarCursos(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        gravarCursos(request, response);
    }

    @Override
    public String getServletInfo() {
        return "Short description";
    }

}
