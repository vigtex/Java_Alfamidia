package model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;




public class CursoDAO 
{   
    Connection conn;
    /*
    *construtor da classe
    *ao criar novo objeto, metodo sempre será chamado
    */
    public CursoDAO() throws Exception 
    {
        try
        {
        //conectar com o banco de dados
        Class.forName("com.mysql.jdbc.Driver");
        String host = "jdbc:mysql://localhost/alfajava";
        String user = "root";
        String pass = "";
        this.conn = DriverManager.getConnection(host, user, pass);
        }
        catch (Exception e)
        {
        this.conn = (null);    
        }
    }   
    
    public Curso buscar(String filtro)
    {
        //List<Curso> lista = new ArrayList<Curso>();
        Curso obj = new Curso();
        try
        {
            Statement stmt = this.conn.createStatement();
            String sql = "select * from curso where " + filtro;
            ResultSet rset = stmt.executeQuery(sql);
            while(rset.next())
            {
                //Curso obj = new Curso();
                obj.setCodigo(rset.getLong("codigo"));
                obj.setNome(rset.getString("nome"));
                obj.setDescricao(rset.getString("descricao"));
                obj.setValor(rset.getDouble("valor"));
                //adiciono o obj em uma lista
                //lista.add(obj);
            }
        rset.close();
        stmt.close();
        this.conn.close();
        }
        catch(Exception e)
        {
            obj = null;
        }    
        return obj;
    }
    
    
    /*
    *@return List<Curso>
    */
    public List<Curso> listar()
    {
        List<Curso> lista = new ArrayList<Curso>();
        
        try
        {
            Statement stmt = this.conn.createStatement();
            String sql = "select * from curso";
            ResultSet rset = stmt.executeQuery(sql);
            while(rset.next())
            {
                Curso obj = new Curso();
                obj.setCodigo(rset.getLong("codigo"));
                obj.setNome(rset.getString("nome"));
                obj.setDescricao(rset.getString("descricao"));
                obj.setValor(rset.getDouble("valor"));
                //adiciono o obj em uma lista
                lista.add(obj);
            }
        rset.close();
        stmt.close();
        this.conn.close();
        }
        catch(Exception e)
        {
            lista = null;
        }    
        return lista;
    }
    
    /*
    *método para ser usado com JavaBean getCurso()
    */
    public List<Curso> getCursos()
    {
        return listar();
    }
    
    /*
    *metodo para cadastrar um novo curso
    *@param obj
    */
    public int inserir(Curso obj)
    {
            int res = 0;
            String nom = obj.getNome();
            String des = obj.getDescricao();
            Double val = obj.getValor();
            String sql = "insert into curso (nome, descricao, valor)" 
                          + " values "
                          + "(?, ?, ?)";
            try
            {
            PreparedStatement stmt = this.conn.prepareStatement(sql);
            stmt.setString(1, nom);
            stmt.setString(2, des);
            stmt.setDouble(3, val);
            res = stmt.executeUpdate();
            stmt.close();
            this.conn.close();
            }
            catch(Exception e)
            {
            res = 0;    
            }
            return res;
    }
    
    /*
    *metodo para atuallizar um curso existente
    *@param obj
    */
    public int atualizar(Curso obj)
    {
        int res = 0;
            Long cod = obj.getCodigo();
            String nom = obj.getNome();
            String des = obj.getDescricao();
            Double val = obj.getValor();
            String sql = "update curso set nome=?, descricao=?, valor=? where codigo=?";
            try
            {
            PreparedStatement stmt = this.conn.prepareStatement(sql);
            stmt.setString(1, nom);
            stmt.setString(2, des);
            stmt.setDouble(3, val);
            stmt.setLong(4, cod);
            res = stmt.executeUpdate();
            stmt.close();
            this.conn.close();
            }
            catch(Exception e)
            {
            res = 0;    
            }
            return res;
    }
    
    /*
    *metodo para excluir um curso existente
    *@param obj
    */
    public int excluir(Curso obj)
    {
        int res = 0;
            Long cod = obj.getCodigo();
            String sql = "delete from curso where codigo=?";
            try
            {
            PreparedStatement stmt = this.conn.prepareStatement(sql);
            stmt.setLong(1, cod);
            res = stmt.executeUpdate();
            stmt.close();
            this.conn.close();
            }
            catch(Exception e)
            {
            res = 0;    
            }
            return res;
    }
}
