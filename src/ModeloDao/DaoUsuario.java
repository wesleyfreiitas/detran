package ModeloDao;

import ModeloConection.ConexaoBD;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import modeloBeans.BeansUsuario;


public class DaoUsuario {
    
    ConexaoBD conex = new ConexaoBD();
    BeansUsuario mod = new BeansUsuario();
    
    public void salvar(BeansUsuario mod){
        conex.conexao();
        try {
            PreparedStatement pst = conex.con.prepareStatement("insert into usuarios_empresa(usu_nome, usu_senha) values(?, ?)");
        pst.setString(1, mod.getUsuNome());
        pst.setString(2, mod.getUsuSenha());
        pst.execute();
        JOptionPane.showMessageDialog(null, "Usuário inserido com sucesso!");
        } catch (SQLException ex) {
JOptionPane.showMessageDialog(null, "Erro ao inserir usuáro: \n"+ex.getMessage());
        }
        
        conex.desconecta();
    }
     public void excluir(BeansUsuario mod){
        conex.conexao();
        try {
            PreparedStatement pst = conex.con.prepareStatement("delete from usuarios_empresa where usu_cod = ?");
            pst.setInt(1, mod.getCoduser());
            pst.execute();  
            JOptionPane.showMessageDialog(null, "Usuário excluído com sucesso!");
        } catch (SQLException ex) {
         JOptionPane.showMessageDialog(null, "Erro ao excluir usuário: \n"+ex.getMessage()); 
        }
        
        conex.desconecta();
    }
    
     public void editar(BeansUsuario mod){
        conex.conexao();
        try {
            PreparedStatement pst = conex.con.prepareStatement("update usuarios_empresa set usu_nome = ?, usu_senha = ?, usu_tipo = ? where usu_cod = ?");
       pst.setString(1, mod.getUsuNome());
       pst.setString(2, mod.getUsuSenha());
       pst.setInt(3, mod.getCoduser());
       
       pst.execute();
       
       JOptionPane.showMessageDialog(null, "Usuário alterado com sucesso!");
       
        } catch (SQLException ex) {
      JOptionPane.showMessageDialog(null, "Erro na alteração do usuário: \n"+ex.getMessage());
        }
        
        conex.desconecta();
    }
    
     public BeansUsuario buscaUsuario(BeansUsuario mod){
        conex.conexao();
        conex.executaSql("Select *from usuarios_empresa where usu_nome like'%"+mod.getUsuPesquisa()+"%'");
        try {
            conex.rs.first();
        mod.setCoduser(conex.rs.getInt("usu_cod"));
        mod.setUsuNome(conex.rs.getString("usu_nome"));
        mod.setUsuSenha(conex.rs.getString("usu_senha"));
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Usuário não cadastrado. \n"+ex.getMessage());
        }
         
        conex.desconecta();
        return mod;
    }
     
}
