/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Telas;

import Classes.Financeiro;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Fofao
 */
public class Contas extends javax.swing.JInternalFrame {
    public void Consultar() throws SQLException {
        DefaultTableModel grid0 = (DefaultTableModel) Tabela_Conta.getModel();
        grid0.setNumRows(0);
        Connection conn = null;
        Conec.Conexao bd = new Conec.Conexao();
        conn = bd.getConnection();
        Statement stm = null;
        ResultSet rs = null;
        String SQLConsulta = "SELECT Codigo, Parceiro, Produto, ValorUnit, Quantidade, Total, DataCompra, Vencimento,Tipo, Status FROM Contas";
        try {
            stm = conn.createStatement();
        } catch (SQLException ex) {
            Logger.getLogger(CadastroClientes.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            rs = stm.executeQuery(SQLConsulta);
        } catch (SQLException ex) {
            Logger.getLogger(CadastroClientes.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            while (rs.next()) {
                String recebe_id = rs.getString("Codigo");
                String recebe_parceiro = rs.getString("Parceiro");
                String recebe_produto = rs.getString("Produto");
                String recebe_valorunit = rs.getString("ValorUnit");
                String recebe_quantidade = rs.getString("Quantidade");
                String recebe_total = rs.getString("Total");
                String recebe_datacompra = rs.getString("DataCompra");
                String recebe_vencimento = rs.getString("Vencimento");
                String recebe_tipo = rs.getString("Tipo");
                String recebe_status = rs.getString("Status");

                DefaultTableModel grid = (DefaultTableModel) Tabela_Conta.getModel();
                grid0.addRow(new String[]{recebe_id, recebe_parceiro, recebe_produto, recebe_valorunit, recebe_quantidade, recebe_total, recebe_datacompra, recebe_vencimento, recebe_tipo, recebe_status});
            }
        } catch (SQLException ex) {
            Logger.getLogger(CadastroClientes.class.getName()).log(Level.SEVERE, null, ex);
        }

        try {
            rs.close();
        } catch (SQLException ex) {
            Logger.getLogger(CadastroClientes.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            stm.close();
        } catch (SQLException ex) {
            Logger.getLogger(CadastroClientes.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    String nome;
    public void Consultar_nome() throws SQLException {
        DefaultTableModel grid0 = (DefaultTableModel) Tabela_Conta.getModel();
        grid0.setNumRows(0);
        Connection conn = null;
        Conec.Conexao bd = new Conec.Conexao();
        conn = bd.getConnection();
        Statement stm = null;
        ResultSet rs = null;
        String SQLConsulta = "SELECT Codigo, Parceiro, Produto, ValorUnit, Quantidade, Total, DataCompra, Vencimento,Tipo, Status FROM Contas WHERE Parceiro LIKE '%"+nome+"%'";
        try {
            stm = conn.createStatement();
        } catch (SQLException ex) {
            Logger.getLogger(CadastroClientes.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            rs = stm.executeQuery(SQLConsulta);
        } catch (SQLException ex) {
            Logger.getLogger(CadastroClientes.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            while (rs.next()) {
                String recebe_id = rs.getString("Codigo");
                String recebe_parceiro = rs.getString("Parceiro");
                String recebe_produto = rs.getString("Produto");
                String recebe_valorunit = rs.getString("ValorUnit");
                String recebe_quantidade = rs.getString("Quantidade");
                String recebe_total = rs.getString("Total");
                String recebe_datacompra = rs.getString("DataCompra");
                String recebe_vencimento = rs.getString("Vencimento");
                String recebe_tipo = rs.getString("Tipo");
                String recebe_status = rs.getString("Status");

                DefaultTableModel grid = (DefaultTableModel) Tabela_Conta.getModel();
                grid0.addRow(new String[]{recebe_id, recebe_parceiro, recebe_produto, recebe_valorunit, recebe_quantidade, recebe_total, recebe_datacompra, recebe_vencimento, recebe_tipo, recebe_status});
            }
        } catch (SQLException ex) {
            Logger.getLogger(CadastroClientes.class.getName()).log(Level.SEVERE, null, ex);
        }

        try {
            rs.close();
        } catch (SQLException ex) {
            Logger.getLogger(CadastroClientes.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            stm.close();
        } catch (SQLException ex) {
            Logger.getLogger(CadastroClientes.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    /**
     * Creates new form Contas
     */
    public Contas() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Botao_Sair = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        Tabela_Conta = new javax.swing.JTable();
        Pesquisa = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        Botao_Buscar = new javax.swing.JButton();
        Botao_Quitar = new javax.swing.JButton();

        addInternalFrameListener(new javax.swing.event.InternalFrameListener() {
            public void internalFrameActivated(javax.swing.event.InternalFrameEvent evt) {
                formInternalFrameActivated(evt);
            }
            public void internalFrameClosed(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameClosing(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameDeactivated(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameDeiconified(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameIconified(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameOpened(javax.swing.event.InternalFrameEvent evt) {
            }
        });

        Botao_Sair.setText("Sair");
        Botao_Sair.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Botao_SairMouseClicked(evt);
            }
        });

        Tabela_Conta.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Código", "Parceiro", "Produto", "Valor Unit.", "Quantidade", "Total", "Data Compra", "Vencimento", "Tipo", "Status"
            }
        ));
        jScrollPane1.setViewportView(Tabela_Conta);

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel1.setText("Pesquisar Parceiro:");

        Botao_Buscar.setText("Buscar");
        Botao_Buscar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Botao_BuscarMouseClicked(evt);
            }
        });

        Botao_Quitar.setText("Quitar");
        Botao_Quitar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Botao_QuitarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(Botao_Quitar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(Botao_Sair))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 804, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Pesquisa, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Botao_Buscar)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(29, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Pesquisa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1)
                    .addComponent(Botao_Buscar))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 268, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(Botao_Sair)
                    .addComponent(Botao_Quitar, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Botao_SairMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Botao_SairMouseClicked
        dispose();
    }//GEN-LAST:event_Botao_SairMouseClicked

    private void Botao_BuscarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Botao_BuscarMouseClicked
        nome=Pesquisa.getText();
        try {
            Consultar_nome();
        } catch (SQLException ex) {
            Logger.getLogger(CadastroClientes.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_Botao_BuscarMouseClicked

    private void Botao_QuitarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Botao_QuitarActionPerformed
        try {
            int resp;
            resp = JOptionPane.showConfirmDialog(null, "Deseja quitar esta conta?");
        
        if (resp == JOptionPane.YES_OPTION){
            Connection conn = new Conec.Conexao().getConnection();

            DefaultTableModel grid0 = (DefaultTableModel) Tabela_Conta.getModel();

            String Codigo = ((String) Tabela_Conta.getValueAt(Tabela_Conta.getSelectedRow(), 0));
            String Status = ((String) Tabela_Conta.getValueAt(Tabela_Conta.getSelectedRow(), 9));
            
            Financeiro p = new Financeiro();
            p.setStatus("Quitado");
            p.setId(Integer.parseInt(Codigo));
            
            JOptionPane.showMessageDialog(null, "Conta Quitada.");
            
            try {
                p.Altera_Status(conn);
            } catch (SQLException ex) {
                Logger.getLogger(Vendas.class.getName()).log(Level.SEVERE, null, ex);
            }
            try {
                Consultar();
            } catch (SQLException ex) {
                Logger.getLogger(Vendas.class.getName()).log(Level.SEVERE, null, ex);
            } catch (java.lang.NullPointerException ex) {
                Logger.getLogger(Vendas.class.getName()).log(Level.SEVERE, null, ex);
            }
        }else{
            JOptionPane.showMessageDialog(null, "Nenhuma informação foi alterada.");
        }
        } catch (java.lang.ArrayIndexOutOfBoundsException ex) {
            JOptionPane.showMessageDialog(null, "Selecione uma linha da tabela", "Problema", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_Botao_QuitarActionPerformed

    private void formInternalFrameActivated(javax.swing.event.InternalFrameEvent evt) {//GEN-FIRST:event_formInternalFrameActivated
        try {
            Consultar();
        } catch (SQLException ex) {
            Logger.getLogger(CadastroClientes.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_formInternalFrameActivated


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Botao_Buscar;
    private javax.swing.JButton Botao_Quitar;
    private javax.swing.JButton Botao_Sair;
    private javax.swing.JTextField Pesquisa;
    private javax.swing.JTable Tabela_Conta;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
