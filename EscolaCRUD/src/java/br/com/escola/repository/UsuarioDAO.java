
package br.com.escola.repository;

import br.com.escola.conex.Conex;
import br.com.escola.model.Usuario;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;



public class UsuarioDAO 
{
    Connection conn;
    /*
    *construtor da classe
    *ao criar novo objeto, metodo sempre será chamado
    */
    public UsuarioDAO() throws Exception 
    {
        this.conn = Conex.getConnection();
    }   
    
    public List<Usuario> buscar(String filtro)
    {
        List<Usuario> lista = new ArrayList<Usuario>();
        
        try
        {
            Statement stmt = this.conn.createStatement();
            String sql = "select * from usuariosadm where " + filtro;
            ResultSet rset = stmt.executeQuery(sql);
            while(rset.next())
            {
                Usuario obj = new Usuario();
                obj.setIdusuario(rset.getLong("idusuarioadm"));
                obj.setNome(rset.getString("nome"));
                obj.setEmail(rset.getString("email"));
                obj.setSenha(rset.getString("senha"));
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
    
    public List<Usuario> validar(String email, String senha)
    {
        List<Usuario> lista = new ArrayList<Usuario>();
        try
        {
            
            String sql = "select * from usuariosadm where email=? and senha=?";
            PreparedStatement stmt = this.conn.prepareStatement(sql);
            stmt.setString(1, email);
            stmt.setString(2, senha);
            ResultSet rset = stmt.executeQuery();
            while(rset.next())
            {
                Usuario obj = new Usuario();
                obj.setIdusuario(rset.getLong("idusuarioadm"));
                obj.setNome(rset.getString("nome"));
                obj.setEmail(rset.getString("email"));
                obj.setSenha(rset.getString("senha"));
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
    
    
    public List<Usuario> listar()
    {
        List<Usuario> lista = new ArrayList<Usuario>();
        try
        {
            Statement stmt = this.conn.createStatement();
            String sql = "select * from usuariosadm";
            ResultSet rset = stmt.executeQuery(sql);
            while(rset.next())
            {
                Usuario obj = new Usuario();
                obj.setIdusuario(rset.getLong("idusuarioadm"));
                obj.setNome(rset.getString("nome"));
                obj.setEmail(rset.getString("email"));
                obj.setSenha(rset.getString("senha"));
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
    *método para ser usado com JavaBean getUsuario()
    */
    public List<Usuario> getUsuarios()
    {
        return listar();
    }
    
    /*
    *metodo para cadastrar um novo curso
    *@param obj
    */
    public int inserir(Usuario obj)
    {
            int res = 0;
            String nom = obj.getNome();
            //String des = obj.getDescricao();
           // String ati = obj.getAtivo();
            //(apagar)Double val = obj.getValor();
            String sql = "insert into categorias (nome, descricao, ativo)" 
                          + " values "
                          + "(?, ?, ?)";
            try
            {
            PreparedStatement stmt = this.conn.prepareStatement(sql);
            stmt.setString(1, nom);
            //stmt.setString(2, des);
            //stmt.setString(3, ati);
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
    public int atualizar(Usuario obj)
    {
        int res = 0;
            //Long idcat = obj.getIdcategoria();
            //String nom = obj.getNome();
            //String des = obj.getDescricao();
            //String ati = obj.getAtivo();
            //String sql = "update categorias set nome=?, descricao=?, ativo=? where idcategorias=?";
            try
            {
            //PreparedStatement stmt = this.conn.prepareStatement(sql);
            //stmt.setString(1, nom);
            //stmt.setString(2, des);
            //stmt.setString(3, ati);
            //stmt.setLong(4, idcat);
            //res = stmt.executeUpdate();
            //stmt.close();
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
    public int excluir(Usuario obj)
    {
        int res = 0;
            //Long idcat = obj.getIdcategoria();
            String sql = "delete from categorias where idcategorias=?";
            try
            {
            PreparedStatement stmt = this.conn.prepareStatement(sql);
            //stmt.setLong(1, idcat);
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
