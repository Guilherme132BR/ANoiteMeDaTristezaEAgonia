/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import dao.TesteJDBC;
import bean.Usuarios;
import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Guilh
 */
public class Usuarios_DAO extends DAO_Abstract {

   
    @Override
    public void insert(Object object) {
        Usuarios usuarios = (Usuarios) object;
   String url, user, password;
        url ="jdbc:mysql://10.7.0.51:33062/db_raul_torres";
        user ="raul_torres";
        password ="raul_torres";
       
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection cnt;
            cnt = DriverManager.getConnection(url, user, password);
            String sql = "insert into usuarios values (?, ?, ?, ?, ?, ?, ?, ?);";
            PreparedStatement pstm = cnt.prepareStatement(sql);
            pstm.setInt(1, usuarios.getIdUsuario());
            pstm.setString(2, usuarios.getNome());
            pstm.setString(3, usuarios.getApelido());
            pstm.setString(4, usuarios.getCpf());
            pstm.setDate(5, new Date(2001,1,1) );
            pstm.setString(6, usuarios.getSenha());
            pstm.setInt(7, usuarios.getNivel());
            pstm.setString(8, usuarios.getAtivo());
            pstm.executeUpdate();
            
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(TesteJDBC.class.getName()).log(Level.SEVERE, null, ex);
         System.out.println("Erro na conexão");
         System.exit(0);
        
        } catch (SQLException ex) {
            Logger.getLogger(TesteJDBC.class.getName()).log(Level.SEVERE, null, ex);
        };
    
    }

    @Override
    public void update(Object object) {
      
        Usuarios usuario = (Usuarios) object;
           
         String url, user, password;
        url = "jdbc:mysql://10.7.0.51:33062/db_raul_torres";
        user = "raul_torres";
        password = "raul_torres";
       
        
           try {
          
               
            Class.forName("com.mysql.jdbc.Driver");
            Connection cnt;
            cnt = DriverManager.getConnection(url, user, password);
            Statement stm;
            stm = cnt.createStatement();
            String sql = "upadate set nome=?, apelido=?, cpf=?, dataNasimento=?, senha=?, nivel=?, ativo=? where idusuario= ?";
            stm.executeLargeUpdate(sql);
            PreparedStatement pstm = cnt.prepareStatement(sql);
            
            
            pstm.setInt(8, usuario.getIdUsuarios());
            pstm.setString(1, usuario.getNome());
            pstm.setString(2, usuario.getApelido());
            pstm.setString(3, usuario.getCpf());
            pstm.setDate(4, new Date(2001,1,1));
            pstm.setString(5, usuario.getSenha());
            pstm.setInt(6, usuario.getNivel());
            pstm.setString(7, usuario.getAtivo());
            pstm.executeUpdate();
            
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(TesteJDBC.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(TesteJDBC.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public void delete(Object object) {
         Usuarios usuario = (Usuarios) object;
           
         String url, user, password;
        url = "jdbc:mysql://10.7.0.51:33062/evelin_centurion";
        user = "db_evelin_centurion";
        password = "evelin_centurion";
       
        
         try {
           
             
            Class.forName("com.mysql.jdbc.Driver");
            Connection cnt;
            cnt = DriverManager.getConnection(url, user, password);
            Statement stm;
            stm = cnt.createStatement();
            String sql = "delete from usuario where idusuario=?";
            stm.executeLargeUpdate(sql);
            PreparedStatement pstm = cnt.prepareStatement(sql);
            
            
            pstm.setInt(1, usuario.getIdUsuarios());
            pstm.setString(2, usuario.getNome());
            pstm.setString(3, usuario.getApelido());
            pstm.setString(4, usuario.getCpf());
            pstm.setDate(5, new Date(2001,1,1));
            pstm.setString(6, usuario.getSenha());
            pstm.setInt(7, usuario.getNivel());
            pstm.setString(8, usuario.getAtivo());
            pstm.executeUpdate();
            
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(TesteJDBC.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(TesteJDBC.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    @Override
    public Object list(int id) {
       Usuarios usuarios = new Usuarios();
           
         String url, user, password;
        url = "jdbc:mysql://10.7.0.51:33062/evelin_centurion";
        user = "db_evelin_centurion";
        password = "evelin_centurion";
       
        
         try {
           
             
            Class.forName("com.mysql.jdbc.Driver");
            Connection cnt;
            cnt = DriverManager.getConnection(url, user, password);
            Statement stm;
            stm = cnt.createStatement();
            String sql = "select * from usuario where idusuario=?";
            PreparedStatement pstm = cnt.prepareStatement(sql);
            pstm.setInt(1, id);
            stm.executeLargeUpdate(sql);
             ResultSet rs = pstm.executeQuery();
             if (rs.next()== true){
             usuarios.setIdUsuario(rs.getInt("idusuario"));
             usuarios.setNome(rs.getString("nome"));
             usuarios.setApelido(rs.getString("apelido"));
             usuarios.setCpf(rs.getString("cpf"));
             usuarios.setDataNascimento(rs.getDate("dataNascimento"));
             usuarios.setSenha(rs.getString("seha"));
             usuarios.setNivel(rs.getInt("nivel"));
             usuarios.setAtivo(rs.getString("ativo"));
             
             }
            
            
            pstm.setInt(1, usuarios.getIdUsuarios());
            pstm.setString(2, usuarios.getNome());
            pstm.setString(3, usuarios.getApelido());
            pstm.setString(4, usuarios.getCpf());
            pstm.setDate(5, new Date(2001,1,1));
            pstm.setString(6, usuarios.getSenha());
            pstm.setInt(7, usuarios.getNivel());
            pstm.setString(8, usuarios.getAtivo());
            pstm.executeUpdate();
            
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(TesteJDBC.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(TesteJDBC.class.getName()).log(Level.SEVERE, null, ex);
        }
        return usuarios;
    }

    @Override
    public List listAll() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    // QUEBRA DE LINHA PRA N CONFUNDIR
    
   public static void main(String[] args) {
    Usuarios usuarios = new Usuarios();
    usuarios.setIdUsuarios(11);
    usuarios.setNome("Raul");
    usuarios.setApelido("Torres");
    usuarios.setCpf("05074221129");
    //usuarios.setDatanascimento("");
    usuarios.setSenha("1234");
    usuarios.setNivel(1);
    usuarios.setAtivo("S");
    
    Usuarios_DAO usuarios_DAO = new Usuarios_DAO(); 
    usuarios_DAO.insert(usuarios);  
        System.out.println("Deu Certo");
    }
    
}