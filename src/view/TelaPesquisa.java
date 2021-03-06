/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import ModeloConection.ConexaoBD;
import ModeloDao.DaoCarro;
import java.awt.List;
import java.awt.image.BufferedImage;
import java.io.File;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.ListSelectionModel;
import modeloBeans.BeansCarro;
import modeloBeans.BeansUsuario;
import modeloBeans.ModeloTabela;

/**
 *
 * @author User
 */
public class TelaPesquisa extends javax.swing.JFrame {
    BeansCarro mod = new BeansCarro();
    DaoCarro dao = new DaoCarro();
    ConexaoBD conex = new ConexaoBD();
    public TelaPesquisa() {
        initComponents();
        PreencherTabela("select *from carros_empresa order by carplaca");

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        txtpesquisa = new javax.swing.JTextField();
        botaopesquisa = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tablealuno = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        txtstatus = new javax.swing.JComboBox<>();
        txtmodelo = new javax.swing.JTextField();
        txtdono = new javax.swing.JTextField();
        txtplaca = new javax.swing.JTextField();
        botaogerar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(0, 0, 0));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel5.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Tela de Pesquisa");
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 40, -1, -1));

        jLabel2.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Preencha o campo e pesquise sua placa");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 80, -1, -1));

        jLabel4.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setToolTipText("Deslogar");
        jLabel4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel4MouseClicked(evt);
            }
        });
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(315, 35, 50, 48));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/icons8_Shutdown_48px_1.png"))); // NOI18N
        jLabel3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel3MouseClicked(evt);
            }
        });
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(1050, 10, -1, -1));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1170, 120));

        jPanel1.setBackground(new java.awt.Color(255, 204, 0));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel3.add(txtpesquisa, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, 430, -1));

        botaopesquisa.setText("Pesquisar");
        botaopesquisa.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                botaopesquisaMouseClicked(evt);
            }
        });
        botaopesquisa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaopesquisaActionPerformed(evt);
            }
        });
        jPanel3.add(botaopesquisa, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 20, 120, -1));

        tablealuno.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.TOP));
        tablealuno.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        tablealuno.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tablealunoMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tablealuno);

        jPanel3.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 80, 580, 240));

        jLabel1.setText("Tabela Geral de Carros");
        jPanel3.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 60, -1, -1));

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 20, 640, 340));

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel6.setText("Placa do carro:");
        jPanel4.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 80, -1, 20));

        jLabel7.setText("Dono:");
        jPanel4.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 120, -1, 20));

        jLabel8.setText("Modelo:");
        jPanel4.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 160, -1, 20));

        jPanel5.setBackground(new java.awt.Color(204, 102, 0));
        jPanel5.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel5MouseClicked(evt);
            }
        });

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel12.setText("     SALVAR");
        jLabel12.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel12.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel12MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jPanel4.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 280, 100, 30));

        jLabel9.setText("Status:");
        jPanel4.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 200, -1, -1));

        txtstatus.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecionar", "Apreendido", "Liberado" }));
        txtstatus.setEnabled(false);
        jPanel4.add(txtstatus, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 200, 130, -1));

        txtmodelo.setEnabled(false);
        jPanel4.add(txtmodelo, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 160, 190, -1));

        txtdono.setEnabled(false);
        jPanel4.add(txtdono, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 120, 190, -1));

        txtplaca.setEnabled(false);
        jPanel4.add(txtplaca, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 80, 190, -1));

        botaogerar.setText("Novo");
        botaogerar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaogerarActionPerformed(evt);
            }
        });
        jPanel4.add(botaogerar, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 20, 80, -1));

        jPanel1.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, 430, 340));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 120, 1170, 400));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel4MouseClicked
        // TODO add your handling code here:
        TelaLogin chamatela = new TelaLogin();
        chamatela.setVisible(true);
        dispose();
    }//GEN-LAST:event_jLabel4MouseClicked

    public void preencherdescritivo(String sql){
       try { conex.executaSql("select *from carros_empresa where carplaca = '"+txtpesquisa.getText()+"'");
        conex.rs.first();
        if(conex.rs.getString("usu_senha").equals(txtpesquisa.getText())){
            PreencherTabela("select *from carros_empresa order by carplaca");
        }
        
       } catch(SQLException ex){
           
       }
    }
    
    public void PreencherTabela(String sql){

        ArrayList dados = new ArrayList();
        String[] colunas = new String[]{"Placa", "Dono","Modelo", "Status"};
        conex.conexao();
        conex.executaSql(sql);

        try {
            conex.rs.first();
            do {
                dados.add(new Object[]{conex.rs.getString("carplaca"), conex.rs.getString("cardono"),
                    conex.rs.getString("carmodelo"), conex.rs.getString("carstatus")});

            } while (conex.rs.next());
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao preencher ArrayList: \n" + ex.getMessage());

        }

        ModeloTabela modelotab = new ModeloTabela(dados, colunas);

        tablealuno.setModel(modelotab);
        tablealuno.getColumnModel().getColumn(0).setPreferredWidth(150);
        tablealuno.getColumnModel().getColumn(0).setResizable(false);

        tablealuno.getColumnModel().getColumn(1).setPreferredWidth(150);
        tablealuno.getColumnModel().getColumn(1).setResizable(false);

        tablealuno.getColumnModel().getColumn(2).setPreferredWidth(100);
        tablealuno.getColumnModel().getColumn(2).setResizable(false);

        tablealuno.getColumnModel().getColumn(3).setPreferredWidth(120);
        tablealuno.getColumnModel().getColumn(3).setResizable(false);
        
        tablealuno.getTableHeader().setReorderingAllowed(false);
        tablealuno.setAutoResizeMode(tablealuno.AUTO_RESIZE_OFF);
        tablealuno.setSelectionMode(ListSelectionModel.SINGLE_SELECTION); //um dado por vez na tabela para selecionar

        conex.desconecta();
    }
    
    
    private void tablealunoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablealunoMouseClicked
       
    }//GEN-LAST:event_tablealunoMouseClicked

    private void botaopesquisaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botaopesquisaMouseClicked
        try {
            if(conex.rs.getString("carplaca").equals(txtpesquisa.getText())){
                
                
                ArrayList dados = new ArrayList();
                String[] colunas = new String[]{"Placa", "Dono","Modelo", "Status"};
                conex.conexao();
                conex.executaSql("select *from carros_empresa where carplaca = '"+txtpesquisa.getText()+"'");
                
                try {
                    conex.rs.first();
                    do {
                        dados.add(new Object[]{conex.rs.getString("carplaca"), conex.rs.getString("cardono"),
                            conex.rs.getString("carmodelo"), conex.rs.getString("carstatus")});
                        
                    } while (conex.rs.next());
                } catch (SQLException ex) {
                    JOptionPane.showMessageDialog(null, "Erro ao preencher ArrayList: \n" + ex.getMessage());
                    
                }
                
                ModeloTabela modelotab = new ModeloTabela(dados, colunas);
                
                tablealuno.setModel(modelotab);
                tablealuno.getColumnModel().getColumn(0).setPreferredWidth(150);
                tablealuno.getColumnModel().getColumn(0).setResizable(false);
                
                tablealuno.getColumnModel().getColumn(1).setPreferredWidth(150);
                tablealuno.getColumnModel().getColumn(1).setResizable(false);
                
                tablealuno.getColumnModel().getColumn(2).setPreferredWidth(100);
                tablealuno.getColumnModel().getColumn(2).setResizable(false);
                
                tablealuno.getColumnModel().getColumn(3).setPreferredWidth(120);
                tablealuno.getColumnModel().getColumn(3).setResizable(false);
                
                tablealuno.getTableHeader().setReorderingAllowed(false);
                tablealuno.setAutoResizeMode(tablealuno.AUTO_RESIZE_OFF);
                tablealuno.setSelectionMode(ListSelectionModel.SINGLE_SELECTION); //um dado por vez na tabela para selecionar
                
                conex.desconecta();
            }
        } catch (SQLException ex) {
            Logger.getLogger(TelaPesquisa.class.getName()).log(Level.SEVERE, null, ex); 
        }
        
    }//GEN-LAST:event_botaopesquisaMouseClicked

    private void jLabel3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MouseClicked
        dispose();
    }//GEN-LAST:event_jLabel3MouseClicked

    private void jPanel5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel5MouseClicked
        mod.setCarplaca(txtplaca.getText());
        mod.setCardono(txtdono.getText());
        mod.setCarmodelo(txtmodelo.getText());
        mod.setCarstatus((String)txtstatus.getSelectedItem());
        dao.editar(mod);
        
          txtplaca.setText("");
            txtdono.setText("");
            txtmodelo.setText("");
            txtstatus.setSelectedItem(false);
            
            txtplaca.setEnabled(false);
            txtdono.setEnabled(false);
            txtmodelo.setEnabled(false);
            txtstatus.setEnabled(false);
    }//GEN-LAST:event_jPanel5MouseClicked

    private void botaogerarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaogerarActionPerformed
        // TODO add your handling code here:
       txtdono.setEnabled(true);
       txtmodelo.setEnabled(true);
       txtplaca.setEnabled(true);
       txtstatus.setEnabled(true);
    }//GEN-LAST:event_botaogerarActionPerformed

    private void botaopesquisaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaopesquisaActionPerformed
        // TODO add your handling code here:
        mod.setCarbusca(txtpesquisa.getText());
        BeansCarro model = dao.buscaCarro(mod);

        txtplaca.setText(String.valueOf(mod.getCarplaca()));
        txtdono.setText(mod.getCardono());
        txtmodelo.setText(mod.getCarmodelo());
        txtstatus.setSelectedItem(mod.getCarstatus());
    }//GEN-LAST:event_botaopesquisaActionPerformed

    private void jLabel12MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel12MouseClicked
        // TODO add your handling code here:
            mod.setCarplaca(txtplaca.getText());
            mod.setCardono(txtdono.getText());
            mod.setCarmodelo(txtmodelo.getText());
            mod.setCarstatus((String)txtstatus.getSelectedItem());
            dao.editar(mod);
            
            txtplaca.setText("");
            txtdono.setText("");
            txtmodelo.setText("");
            txtstatus.setSelectedItem(false);
            
            txtplaca.setEnabled(false);
            txtdono.setEnabled(false);
            txtmodelo.setEnabled(false);
            txtstatus.setEnabled(false);
    }//GEN-LAST:event_jLabel12MouseClicked

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(TelaPesquisa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaPesquisa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaPesquisa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaPesquisa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaPesquisa().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botaogerar;
    private javax.swing.JButton botaopesquisa;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable tablealuno;
    private javax.swing.JTextField txtdono;
    private javax.swing.JTextField txtmodelo;
    private javax.swing.JTextField txtpesquisa;
    private javax.swing.JTextField txtplaca;
    private javax.swing.JComboBox<String> txtstatus;
    // End of variables declaration//GEN-END:variables
}
