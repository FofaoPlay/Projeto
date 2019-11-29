/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Telas;

import Classes.Financeiro;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Fofao
 */
public class Vendas extends javax.swing.JInternalFrame {
    public void Consultar() throws SQLException {
        DefaultTableModel grid0 = (DefaultTableModel) Tabela_Produtos_Consulta.getModel();
        grid0.setNumRows(0);
        Connection conn = null;
        Conec.Conexao bd = new Conec.Conexao();
        conn = bd.getConnection();
        Statement stm = null;
        ResultSet rs = null;
        String SQLConsulta = "SELECT Codigo, Nome, PrecoVenda, Quantidade FROM Produtos";
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
                String recebe_nome = rs.getString("Nome");
                String recebe_precovenda = rs.getString("PrecoVenda");
                String recebe_quantidade = rs.getString("Quantidade");

                DefaultTableModel grid = (DefaultTableModel) Tabela_Produtos_Consulta.getModel();
                grid0.addRow(new String[]{recebe_id, recebe_nome, recebe_precovenda, recebe_quantidade});
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
    public void CarregaCliente() {
        Connection conn = null;
        Conec.Conexao bd = new Conec.Conexao();

        conn = bd.getConnection();

        ArrayList strList = new ArrayList();

        String query = "SELECT Nome from Clientes ORDER BY Nome asc";
        
        try {
            PreparedStatement ps = null;
            ps = conn.prepareStatement(query);
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                strList.add(rs.getString("Nome"));
                
            }
            ps.close();
        } catch (SQLException ex) {
            Logger.getLogger(CadastroClientes.class.getName()).log(Level.SEVERE, null, ex);
        }

        //adiciona no comboBox
        DefaultComboBoxModel cb = new DefaultComboBoxModel(strList.toArray());
        ComboBoxCliente.setModel(cb);
    }
    /**
     * Creates new form Vendas2
     */
    public Vendas() {
        initComponents();
        CarregaCliente();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        ComboBoxCliente = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        Tabela_Produtos_Consulta = new javax.swing.JTable();
        Botao_Confirma = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        Botao_Sair = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        Text_Quantidade = new javax.swing.JFormattedTextField();
        Text_Parcelas = new javax.swing.JFormattedTextField();

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

        Tabela_Produtos_Consulta.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Código", "Nome", "Preço de Venda", "Quantidade"
            }
        ));
        jScrollPane1.setViewportView(Tabela_Produtos_Consulta);

        Botao_Confirma.setText("Confirmar");
        Botao_Confirma.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Botao_ConfirmaActionPerformed(evt);
            }
        });

        jLabel1.setText("Quantidade vendida:");

        Botao_Sair.setText("Sair");
        Botao_Sair.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Botao_SairMouseClicked(evt);
            }
        });

        jLabel3.setText("Cliente:");

        jLabel5.setText("N° de Parcelas:");

        Text_Quantidade.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(java.text.NumberFormat.getIntegerInstance())));

        Text_Parcelas.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(java.text.NumberFormat.getIntegerInstance())));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Text_Quantidade, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(ComboBoxCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Text_Parcelas, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(Botao_Sair))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 755, Short.MAX_VALUE))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(339, 339, 339)
                .addComponent(Botao_Confirma)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 235, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Botao_Sair)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel5)
                                .addComponent(Text_Parcelas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(ComboBoxCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel3))
                        .addGap(18, 18, 18)
                        .addComponent(Botao_Confirma)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(Text_Quantidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(70, 70, 70))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Botao_ConfirmaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Botao_ConfirmaActionPerformed
        int resp;
        resp = JOptionPane.showConfirmDialog(null, "Você confirma essa venda?");
        
        if (resp == JOptionPane.YES_OPTION){
            try {
            Connection conn = new Conec.Conexao().getConnection();

            DefaultTableModel grid0 = (DefaultTableModel) Tabela_Produtos_Consulta.getModel();

            String Codigo = ((String) Tabela_Produtos_Consulta.getValueAt(Tabela_Produtos_Consulta.getSelectedRow(), 0));
            String Produto = ((String) Tabela_Produtos_Consulta.getValueAt(Tabela_Produtos_Consulta.getSelectedRow(), 1));
            String ValorUnit = ((String) Tabela_Produtos_Consulta.getValueAt(Tabela_Produtos_Consulta.getSelectedRow(), 2));
            String Quantidade = ((String) Tabela_Produtos_Consulta.getValueAt(Tabela_Produtos_Consulta.getSelectedRow(), 3));

            Financeiro p = new Financeiro();

            p.setId(Integer.parseInt(Codigo));
            p.setParceiro((String)ComboBoxCliente.getSelectedItem());
            p.setProduto(Produto);
            Double ValorUni = (Double.parseDouble(ValorUnit));
            p.setQuantidade(Integer.parseInt(Text_Quantidade.getText()));
            int Parcelas = Integer.parseInt(Text_Parcelas.getText());
            p.setParcelas(Parcelas);
            Double Quantidade_ = (Double.parseDouble(Text_Quantidade.getText()));
            p.setValorunit(ValorUni);
            p.setTotal((Quantidade_ * ValorUni) / Parcelas);
            p.setQuantidade_prod(Integer.parseInt(Quantidade));

            p.setTipo("Saída");
            p.setStatus("Não Quitado");
                if (Double.parseDouble(Text_Quantidade.getText()) >= 1) {
                    if (Parcelas >= 1) {
                        if ((Integer.parseInt(Quantidade)) >= (Integer.parseInt(Text_Quantidade.getText()))) {
                            try {
                                p.cadastrar(conn);
                                Text_Quantidade.setText("");
                                Text_Parcelas.setText("");
                                JOptionPane.showMessageDialog(null, "Venda Concluída");
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
                        } else {
                            JOptionPane.showMessageDialog(null, "A quantidade de estoque não é suficiente para executar a compra", "Problema", JOptionPane.ERROR_MESSAGE);
                        }
                    } else {
                        JOptionPane.showMessageDialog(null, "A quantidade de parcelas não pode ser menor que 1", "Problema", JOptionPane.ERROR_MESSAGE);
                    }
                } else {
                    JOptionPane.showMessageDialog(null, "A quantidade de retirada não pode ser menor que 1", "Problema", JOptionPane.ERROR_MESSAGE);
                }
        } catch (java.lang.ArrayIndexOutOfBoundsException ex) {
            JOptionPane.showMessageDialog(null, "Selecione uma linha da tabela", "Problema", JOptionPane.ERROR_MESSAGE);
        } catch (java.lang.NumberFormatException ex) {
            JOptionPane.showMessageDialog(null, "Insira valores válidos", "Problema", JOptionPane.ERROR_MESSAGE);
        }
        }else{
            JOptionPane.showMessageDialog(null, "Venda Cancelada");
        }
    }//GEN-LAST:event_Botao_ConfirmaActionPerformed

    private void Botao_SairMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Botao_SairMouseClicked
        dispose();
    }//GEN-LAST:event_Botao_SairMouseClicked

    private void formInternalFrameActivated(javax.swing.event.InternalFrameEvent evt) {//GEN-FIRST:event_formInternalFrameActivated
        try {
            Consultar();
        } catch (SQLException ex) {
            Logger.getLogger(CadastroClientes.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_formInternalFrameActivated


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Botao_Confirma;
    private javax.swing.JButton Botao_Sair;
    private javax.swing.JComboBox<String> ComboBoxCliente;
    private javax.swing.JTable Tabela_Produtos_Consulta;
    private javax.swing.JFormattedTextField Text_Parcelas;
    private javax.swing.JFormattedTextField Text_Quantidade;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
