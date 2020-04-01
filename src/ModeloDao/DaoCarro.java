package ModeloDao;

import ModeloConection.ConexaoBD;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import modeloBeans.BeansCarro;


public class DaoCarro {
    
    ConexaoBD conex = new ConexaoBD();
    BeansCarro mod = new BeansCarro();
    
    public void salvar(BeansCarro mod){
        conex.conexao();
        try {
            PreparedStatement pst = conex.con.prepareStatement("insert into carros_empresa(carplaca, cardono, carmodelo, carstatus) values(?, ?, ?, ?)");
        pst.setString(1, mod.getCarplaca());
        pst.setString(2, mod.getCardono());
        pst.setString(3, mod.getCarmodelo());
        pst.setString(4, mod.getCarstatus());
        pst.execute();
        JOptionPane.showMessageDialog(null, "Carro inserido com sucesso!");
        } catch (SQLException ex) {
JOptionPane.showMessageDialog(null, "Erro ao inserir usuáro: \n"+ex.getMessage());
        }
        
        conex.desconecta();
    }
    
     public void editar(BeansCarro mod){
        conex.conexao();
        try {
            PreparedStatement pst = conex.con.prepareStatement("update carros_empresa set cardono = ?, carmodelo = ?, carstatus = ? where carplaca = ?");
       pst.setString(1, mod.getCardono());
       pst.setString(2, mod.getCarmodelo());
       pst.setString(3, mod.getCarstatus());
       pst.setString(4, mod.getCarplaca());
       
       pst.execute();
       
       JOptionPane.showMessageDialog(null, "Carro alterado com sucesso!");
       
        } catch (SQLException ex) {
      JOptionPane.showMessageDialog(null, "Erro na alteração do usuário: \n"+ex.getMessage());
        }
        
        conex.desconecta();
    }
    
     public BeansCarro buscaCarro(BeansCarro mod){
        conex.conexao();
        conex.executaSql("Select *from carros_empresa where carplaca like'%"+mod.getCarbusca()+"%'");
        try {
            conex.rs.first();
        mod.setCarplaca(conex.rs.getString("carplaca"));
        mod.setCardono(conex.rs.getString("cardono"));
        mod.setCarmodelo(conex.rs.getString("carmodelo"));
        mod.setCarstatus(conex.rs.getString("carstatus"));
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Carro não cadastrado. \n"+ex.getMessage());
        }
         
        conex.desconecta();
        return mod;
    }
    
}

