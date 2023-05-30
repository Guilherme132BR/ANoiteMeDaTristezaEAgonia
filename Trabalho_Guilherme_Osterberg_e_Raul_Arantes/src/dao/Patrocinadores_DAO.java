/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import dao.TesteJDBC;
import bean.Patrocinadores;
import bean.Usuarios;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Guilh
 */
public class Patrocinadores_DAO extends DAO_Abstract {

   
    @Override
    public void insert(Object object) {
        Patrocinadores patrocinadores = (Patrocinadores) object;
   String url, user, password;
        url ="jdbc:mysql://10.7.0.51:33062/db_guilherme_osterberg";
        user ="guilherme_osterberg";
        password ="guilherme_osterberg";
       
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection cnt;
            cnt = DriverManager.getConnection(url, user, password);
            String sql = "insert into usuarios values (?, ?, ?, ?, ?);";
            PreparedStatement pstm = cnt.prepareStatement(sql);
            pstm.setInt(1, patrocinadores.getIdPatrocinadores());
            pstm.setString(2, patrocinadores.getNomeEmpresa());
            pstm.setString(3, patrocinadores.getCnpj());
            pstm.setString(4, patrocinadores.getCelular());
            pstm.setString(5, patrocinadores.getEmail());
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
        
        Patrocinadores patrocinadores = (Patrocinadores) object;
   String url, user, password;
        url ="jdbc:mysql://10.7.0.51:33062/db_guilherme_osterberg";
        user ="guilherme_osterberg";
        password ="guilherme_osterberg";
       
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection cnt;
            cnt = DriverManager.getConnection(url, user, password);
            String sql = "update usuarios set ";
            PreparedStatement pstm = cnt.prepareStatement(sql);
            
            pstm.setInt(1, patrocinadores.getIdPatrocinadores());
            pstm.setString(2, patrocinadores.getNomeEmpresa());
            pstm.setString(3, patrocinadores.getCnpj());
            pstm.setString(4, patrocinadores.getCelular());
            pstm.setString(5, patrocinadores.getEmail());
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
    public void delete(Object object) {
        
       Patrocinadores patrocinadores = (Patrocinadores) object;
   String url, user, password;
        url ="jdbc:mysql://10.7.0.51:33062/db_guilherme_osterberg";
        user ="guilherme_osterberg";
        password ="guilherme_osterberg";
       
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection cnt;
            cnt = DriverManager.getConnection(url, user, password);
            String sql = "delete from usuarios whre idPatrocinadores= ?;";
            PreparedStatement pstm = cnt.prepareStatement(sql);
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
    public Object list(int id) {
        
        Patrocinadores patrocinadores = new Patrocinadores();
        String url, user, password;
        url ="jdbc:mysql://10.7.0.51:33062/db_guilherme_osterberg";
        user ="guilherme_osterberg";
        password ="guilherme_osterberg";
       
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection cnt;
            cnt = DriverManager.getConnection(url, user, password);
            String sql = "insert into usuarios values (?, ?, ?, ?, ?);";
            PreparedStatement pstm = cnt.prepareStatement(sql);
            pstm.setInt(1, patrocinadores.getIdPatrocinadores());
            pstm.setString(2, patrocinadores.getNomeEmpresa());
            pstm.setString(3, patrocinadores.getCnpj());
            pstm.setString(4, patrocinadores.getCelular());
            pstm.setString(5, patrocinadores.getEmail());
            pstm.executeUpdate();
            
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(TesteJDBC.class.getName()).log(Level.SEVERE, null, ex);
         System.out.println("Erro na conexão");
         System.exit(0);
        
        } catch (SQLException ex) {
            Logger.getLogger(TesteJDBC.class.getName()).log(Level.SEVERE, null, ex);
        };return patrocinadores;

        
    }

    @Override
    public List listAll() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public static void main(String[] args) {
    Patrocinadores patrocinadores= new Patrocinadores();
    patrocinadores.setIdPatrocinadores(1);
    patrocinadores.setNomeEmpresa("empresa mto pika");
    patrocinadores.setCnpj("05074221129");
    patrocinadores.setCelular("40028922");
    patrocinadores.setEmail("empresapika@gmail.com");
    
    
    Patrocinadores_DAO patrocinadores_DAO = new Patrocinadores_DAO(); 
    patrocinadores_DAO.insert(patrocinadores);  
        System.out.println("Deu Certo");
    }

}