/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import dao.TesteJDBC;
import bean.Cliente;
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
public class Cliente_DAO extends DAO_Abstract {

   
    @Override
    public void insert(Object object) {
        Cliente cliente = (Cliente) object;
   String url, user, password;
        url ="jdbc:mysql://10.7.0.51:33062/db_guilherme_osterberg";
        user ="guilherme_osterberg";
        password ="guilherme_osterberg";
       
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection cnt;
            cnt = DriverManager.getConnection(url, user, password);
            String sql = "insert into usuarios values (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?);";
            PreparedStatement pstm = cnt.prepareStatement(sql);
            
            pstm.setInt(1, cliente.getIdCliente());
            pstm.setString(2,cliente.getNome());
            pstm.setString(3, cliente.getSobreNome());
            pstm.setString(4, cliente.getCpf());
            pstm.setString(5, cliente.getGenero());
            pstm.setDate(6, new Date(2001,1,1) );
            pstm.setString(7, cliente.getEndereco());
            pstm.setString(8, cliente.getPais());
            pstm.setString(9, cliente.getBairro());
            pstm.setString(10, cliente.getCidade());
            pstm.setString(11, cliente.getTelefone());
            pstm.setString(12, cliente.getCelular());
            pstm.setString(13, cliente.getEmail());
            pstm.setDate(14, new Date(2011, 1, 1));
            pstm.setString(15, cliente.getDesconto());
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
        
             Cliente cliente = (Cliente) object;
   String url, user, password;
        url ="jdbc:mysql://10.7.0.51:33062/db_guilherme_osterberg";
        user ="guilherme_osterberg";
        password ="guilherme_osterberg";
       
        try {
           Class.forName("com.mysql.jdbc.Driver");
            Connection cnt;
            cnt = DriverManager.getConnection(url, user, password);
            Statement stm;
            stm = cnt.createStatement();
            String sql = "insert into usuarios values (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?);";
            stm.executeLargeUpdate(sql);
            PreparedStatement pstm = cnt.prepareStatement(sql);
            
            pstm.setInt(1, cliente.getIdCliente());
            pstm.setString(2,cliente.getNome());
            pstm.setString(3, cliente.getSobreNome());
            pstm.setString(4, cliente.getCpf());
            pstm.setString(5, cliente.getGenero());
            pstm.setDate(6, new Date(2001,1,1) );
            pstm.setString(7, cliente.getEndereco());
            pstm.setString(8, cliente.getPais());
            pstm.setString(9, cliente.getBairro());
            pstm.setString(10, cliente.getCidade());
            pstm.setString(11, cliente.getTelefone());
            pstm.setString(12, cliente.getCelular());
            pstm.setString(13, cliente.getEmail());
            pstm.setDate(14, new Date(2011, 1, 1));
            pstm.setString(15, cliente.getDesconto());
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
              Cliente cliente = (Cliente) object;
   String url, user, password;
        url ="jdbc:mysql://10.7.0.51:33062/db_guilherme_osterberg";
        user ="guilherme_osterberg";
        password ="guilherme_osterberg";
       
        try {
           Class.forName("com.mysql.jdbc.Driver");
           
            Class.forName("com.mysql.jdbc.Driver");
            Connection cnt;
            cnt = DriverManager.getConnection(url, user, password);
            Statement stm;
            stm = cnt.createStatement();
            String sql = "delete from usuario where idCliente=?";
            stm.executeLargeUpdate(sql);
            PreparedStatement pstm = cnt.prepareStatement(sql);
            
            
            pstm.setInt(1, cliente.getIdCliente());
            pstm.setString(2,cliente.getNome());
            pstm.setString(3, cliente.getSobreNome());
            pstm.setString(4, cliente.getCpf());
            pstm.setString(5, cliente.getGenero());
            pstm.setDate(6, new Date(2001,1,1) );
            pstm.setString(7, cliente.getEndereco());
            pstm.setString(8, cliente.getPais());
            pstm.setString(9, cliente.getBairro());
            pstm.setString(10, cliente.getCidade());
            pstm.setString(11, cliente.getTelefone());
            pstm.setString(12, cliente.getCelular());
            pstm.setString(13, cliente.getEmail());
            pstm.setDate(14, new Date(2011, 1, 1));
            pstm.setString(15, cliente.getDesconto());
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
         Cliente cliente = new Cliente();
   String url, user, password;
        url ="jdbc:mysql://10.7.0.51:33062/db_guilherme_osterberg";
        user ="guilherme_osterberg";
        password ="guilherme_osterberg";
       
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection cnt;
            cnt = DriverManager.getConnection(url, user, password);
            String sql = "SELECT * FROM usuarios where idusuarios= ?";
            PreparedStatement pstm = cnt.prepareStatement(sql);
            pstm.setInt(1, id);
            ResultSet rs = pstm.executeQuery();
            
            if (rs.next()==true)
                
            {
            cliente.setIdCliente(rs.getInt("idCliente"));
            cliente.setNome(rs.getString("nome"));
            cliente.setSobreNome(rs.getString("sobreNome"));
            cliente.setCpf(rs.getString("cpf"));
            cliente.setGenero(rs.getString("genero"));
            cliente.setDataNasc(rs.getDate("datanascimento"));          
            cliente.setEndereco(rs.getString("endereco"));
            cliente.setPais(rs.getString("pais"));
            cliente.setBairro(rs.getString("bairro"));
            cliente.setCidade(rs.getString("cidade"));
            cliente.setTelefone(rs.getString("telefone"));
            cliente.setCelular(rs.getString("celular"));
            cliente.setEmail(rs.getString("email"));
            }
            pstm.executeUpdate();
            
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(TesteJDBC.class.getName()).log(Level.SEVERE, null, ex);
         System.out.println("Erro na conexão");
         System.exit(0);
        
        } catch (SQLException ex) {
            Logger.getLogger(TesteJDBC.class.getName()).log(Level.SEVERE, null, ex);
        };return cliente;

    }

    @Override
    public List listAll() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
     public static void main(String[] args) {
        Cliente cliente = new Cliente();
        cliente.setIdCliente(2);
        cliente.setNome("Raul");
        cliente.setSobreNome("Torres");
        cliente.setCpf("05074221129");
        cliente.setGenero("masc");
       // cliente.setDataNasc("");
       cliente.setEndereco("rua abluble");
       cliente.setPais("Brasil");
       cliente.setBairro("jardin");
       cliente.setCidade("PP");
       cliente.setTelefone("80042069");
       cliente.setCelular("40028922");
       cliente.setEmail("cleitingameplays@gmail.com");
     
        
        Cliente_DAO cliente_DAO = new Cliente_DAO();
        cliente_DAO.insert(cliente);
        
        
        
        
        
        
        System.out.println("teste");
    }
    
}
