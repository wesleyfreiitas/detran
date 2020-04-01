package ModeloConection;

import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class ConexaoBD {
    
    public Statement stm; // pesquisa no BD
    public ResultSet rs; //armazena resultado da pesquisa
    private String driver = ("com.mysql.jdbc.Driver"); //identifica o serviço do BD
    private String caminho = "jdbc:mysql://localhost:3306/trabbd"; //onde ele está alocado
    private String usuario = "root"; //user da instalação
    private String senha = ""; // senha da instalação
    public Connection con; // conexão com o banco de dados
    
    public void executaSql(String sql){
        
        try {
        stm = con.createStatement(rs.TYPE_SCROLL_INSENSITIVE, rs.CONCUR_READ_ONLY );// distinção de maiúsculo para minúsculo
        rs = stm.executeQuery(sql);
        } catch (SQLException ex) {
         JOptionPane.showMessageDialog(null, "Erro executa SQL:\n"+ex.getMessage());
        }
    }
    
    
    public void conexao(){
        System.setProperty("jdbc.Drivers", driver);
        try {
            JOptionPane.showMessageDialog(null, "Conectado ao banco de dados");
            con = DriverManager.getConnection(caminho, usuario, senha);
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro de conexão:\n"+ex.getMessage());
        }
    }
    
    public void desconecta(){
        try {
            con.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao desligar conexão com banco de dados: \n"+ex.getMessage());
        }
    }
}
