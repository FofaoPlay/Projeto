package Telas;

import Classes.Clientes;
import Conec.Conexao;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class CadastroClientes extends javax.swing.JFrame {

    public void Consultar() throws SQLException {
        DefaultTableModel grid0 = (DefaultTableModel) Tabela_Clientes.getModel();
        grid0.setNumRows(0);
        Connection conn = null;
        Conexao bd = new Conexao();
        conn = bd.getConnection();
        Statement stm = null;
        ResultSet rs = null;
        String SQLConsulta = "SELECT * FROM Clientes";

        stm = conn.createStatement();
        rs = stm.executeQuery(SQLConsulta);

        while (rs.next()) {
            String recebe_id = rs.getString("Codigo");
            String recebe_nome = rs.getString("Nome");
            String recebe_telefone = rs.getString("Telefone");
            String recebe_email = rs.getString("Email");
            String recebe_cpf = rs.getString("Cpf_Cnpj");

            DefaultTableModel grid = (DefaultTableModel) Tabela_Clientes.getModel();
            grid0.addRow(new String[]{recebe_id, recebe_nome, recebe_telefone, recebe_email, recebe_cpf});
        }

        rs.close();
        stm.close();

    }

    public CadastroClientes() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel5 = new javax.swing.JLabel();
        Text_Nome = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        Text_Telefone = new javax.swing.JFormattedTextField();
        Text_Email = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        Botao_Sair = new javax.swing.JButton();
        Text_CPF = new javax.swing.JTextField();
        Botao_Cadastrar = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        Botao_Alterar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        Tabela_Clientes = new javax.swing.JTable();
        Botao_Excluir = new javax.swing.JButton();
        Text_id = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        MenuCadastros = new javax.swing.JMenu();
        MenuCadastroClientes = new javax.swing.JMenuItem();
        MenuCadastroFornecedores = new javax.swing.JMenuItem();
        MenuCadastroProdutos = new javax.swing.JMenuItem();
        MenuFinanceiro = new javax.swing.JMenu();
        MenuPedidos = new javax.swing.JMenuItem();
        MenuVendas = new javax.swing.JMenuItem();
        MenuHistorico = new javax.swing.JMenu();
        MenuHistoricogeral = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
        });

        jLabel1.setText("Nome:");

        jLabel2.setText("Telefone");

        try {
            Text_Telefone.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("(##)#########")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        jLabel3.setText("Email:");

        Botao_Sair.setText("Sair");
        Botao_Sair.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Botao_SairMouseClicked(evt);
            }
        });

        Botao_Cadastrar.setText("Cadastrar");
        Botao_Cadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Botao_CadastrarActionPerformed(evt);
            }
        });

        jLabel4.setText("CPF/CNPJ:");

        Botao_Alterar.setText("Alterar");
        Botao_Alterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Botao_AlterarActionPerformed(evt);
            }
        });

        Tabela_Clientes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Código", "Nome", "Telefone", "Email", "CPF/CNPJ"
            }
        ));
        Tabela_Clientes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Tabela_ClientesMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(Tabela_Clientes);

        Botao_Excluir.setText("Excluir");
        Botao_Excluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Botao_ExcluirActionPerformed(evt);
            }
        });

        jLabel6.setText("Código:");

        MenuCadastros.setText("Cadastros");

        MenuCadastroClientes.setText("Clientes");
        MenuCadastroClientes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                MenuCadastroClientesMouseClicked(evt);
            }
        });
        MenuCadastroClientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuCadastroClientesActionPerformed(evt);
            }
        });
        MenuCadastros.add(MenuCadastroClientes);

        MenuCadastroFornecedores.setText("Fornecedores");
        MenuCadastroFornecedores.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuCadastroFornecedoresActionPerformed(evt);
            }
        });
        MenuCadastros.add(MenuCadastroFornecedores);

        MenuCadastroProdutos.setText("Produtos");
        MenuCadastroProdutos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuCadastroProdutosActionPerformed(evt);
            }
        });
        MenuCadastros.add(MenuCadastroProdutos);

        jMenuBar1.add(MenuCadastros);

        MenuFinanceiro.setText("Financeiro");

        MenuPedidos.setText("Pedido");
        MenuPedidos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuPedidosActionPerformed(evt);
            }
        });
        MenuFinanceiro.add(MenuPedidos);

        MenuVendas.setText("Vendas");
        MenuVendas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuVendasActionPerformed(evt);
            }
        });
        MenuFinanceiro.add(MenuVendas);

        jMenuBar1.add(MenuFinanceiro);

        MenuHistorico.setText("Histórico");

        MenuHistoricogeral.setText("Geral");
        MenuHistoricogeral.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuHistoricogeralActionPerformed(evt);
            }
        });
        MenuHistorico.add(MenuHistoricogeral);

        jMenuBar1.add(MenuHistorico);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 780, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(Botao_Cadastrar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Botao_Alterar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Botao_Excluir)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 497, Short.MAX_VALUE)
                        .addComponent(Botao_Sair)
                        .addGap(11, 11, 11))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(Text_id, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(14, 14, 14))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addGap(18, 18, 18)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(Text_Nome, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Text_Telefone, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(Text_Email, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(Text_CPF, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 219, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(17, 17, 17)
                                .addComponent(Text_id, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(Text_Telefone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel2)
                                    .addGap(26, 26, 26))
                                .addGroup(layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel3)
                                        .addComponent(jLabel4))
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(Text_Email, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(Text_CPF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGroup(layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel1)
                                        .addComponent(jLabel6))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(Text_Nome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Botao_Cadastrar)
                            .addComponent(Botao_Alterar)
                            .addComponent(Botao_Excluir)))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGap(55, 55, 55)
                        .addComponent(Botao_Sair)))
                .addContainerGap(34, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void MenuCadastroClientesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MenuCadastroClientesMouseClicked

    }//GEN-LAST:event_MenuCadastroClientesMouseClicked

    private void MenuCadastroClientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuCadastroClientesActionPerformed
        CadastroClientes c = new CadastroClientes();
        c.setVisible(true);
        dispose();
    }//GEN-LAST:event_MenuCadastroClientesActionPerformed

    private void MenuCadastroFornecedoresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuCadastroFornecedoresActionPerformed
        CadastroFornecedor c = new CadastroFornecedor();
        c.setVisible(true);
        dispose();
    }//GEN-LAST:event_MenuCadastroFornecedoresActionPerformed

    private void MenuCadastroProdutosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuCadastroProdutosActionPerformed
        CadastroProdutos2 c = new CadastroProdutos2();
        c.setVisible(true);
        dispose();
    }//GEN-LAST:event_MenuCadastroProdutosActionPerformed

    private void MenuPedidosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuPedidosActionPerformed
        Pedidos c = new Pedidos();
        c.setVisible(true);
        dispose();
    }//GEN-LAST:event_MenuPedidosActionPerformed

    private void MenuVendasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuVendasActionPerformed
        Vendas c = new Vendas();
        c.setVisible(true);
        dispose();
    }//GEN-LAST:event_MenuVendasActionPerformed

    private void MenuHistoricogeralActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuHistoricogeralActionPerformed
        HistGeral2 c = new HistGeral2();
        c.setVisible(true);
        dispose();
    }//GEN-LAST:event_MenuHistoricogeralActionPerformed

    private void Botao_SairMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Botao_SairMouseClicked
        Menu m = new Menu();
        m.setVisible(true);
        dispose();
    }//GEN-LAST:event_Botao_SairMouseClicked

    private void Botao_CadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Botao_CadastrarActionPerformed
        if ("".equals(Text_id.getText())){
        if ("".equals(Text_Nome.getText()) || "".equals(Text_Telefone.getText()) || "".equals(Text_Email.getText()) || "".equals(Text_CPF.getText())) {
            JOptionPane.showMessageDialog(null, "Insira valores válido", "Problema", JOptionPane.ERROR_MESSAGE);
        } else {
            try {
                Connection conn = new Conexao().getConnection();
                Clientes p = new Clientes();

                p.setNome(Text_Nome.getText());
                p.setTelefone(Text_Telefone.getText());
                p.setEmail(Text_Email.getText());
                p.setCpfcnpj(Text_CPF.getText());

                p.cadastrar(conn);
                Consultar();
                Text_id.setText("");
                Text_Nome.setText("");
                Text_Telefone.setText("");
                Text_Email.setText("");
                Text_CPF.setText("");
                
            } catch (java.lang.NumberFormatException ex) {
                JOptionPane.showMessageDialog(null, "Selecione uma linha da tabela", "Problema", JOptionPane.ERROR_MESSAGE);
            } catch (SQLException ex) {
                Logger.getLogger(CadastroProdutos2.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        }else{
            JOptionPane.showMessageDialog(null, "Valor Já cadastrado", "Problema", JOptionPane.ERROR_MESSAGE);
            Connection conn = new Conexao().getConnection();
            Clientes p = new Clientes();
            p.cadastrar(conn);
            try {
                Consultar();
            } catch (SQLException ex) {
                Logger.getLogger(CadastroClientes.class.getName()).log(Level.SEVERE, null, ex);
            }
                Text_id.setText("");
                Text_Nome.setText("");
                Text_Telefone.setText("");
                Text_Email.setText("");
                Text_CPF.setText("");
        }
    }//GEN-LAST:event_Botao_CadastrarActionPerformed

    private void Tabela_ClientesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Tabela_ClientesMouseClicked
        DefaultTableModel grid0 = (DefaultTableModel) Tabela_Clientes.getModel();

        Text_id.setText((String) Tabela_Clientes.getValueAt(Tabela_Clientes.getSelectedRow(), 0));
        Text_Nome.setText((String) Tabela_Clientes.getValueAt(Tabela_Clientes.getSelectedRow(), 1));
        Text_Telefone.setText((String) Tabela_Clientes.getValueAt(Tabela_Clientes.getSelectedRow(), 2));
        Text_Email.setText((String) Tabela_Clientes.getValueAt(Tabela_Clientes.getSelectedRow(), 3));
        Text_CPF.setText((String) Tabela_Clientes.getValueAt(Tabela_Clientes.getSelectedRow(), 4));
    }//GEN-LAST:event_Tabela_ClientesMouseClicked

    private void Botao_AlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Botao_AlterarActionPerformed
        if ("".equals(Text_Nome.getText()) || "".equals(Text_Telefone.getText()) || "".equals(Text_Email.getText()) || "".equals(Text_CPF.getText())) {
            JOptionPane.showMessageDialog(null, "Insira valores válido", "Problema", JOptionPane.ERROR_MESSAGE);
        } else {
            try {
                Connection conn = new Conexao().getConnection();
                Clientes p = new Clientes();

                p.setId(Integer.parseInt(Text_id.getText()));
                p.setNome(Text_Nome.getText());
                p.setTelefone(Text_Telefone.getText());
                p.setEmail(Text_Email.getText());
                p.setCpfcnpj(Text_CPF.getText());

                p.Alterar(conn);
                Consultar();

                Text_id.setText("");
                Text_Nome.setText("");
                Text_Telefone.setText("");
                Text_Email.setText("");
                Text_CPF.setText("");

            } catch (java.lang.NumberFormatException ex) {
                JOptionPane.showMessageDialog(null, "Selecione uma linha da tabela", "Problema", JOptionPane.ERROR_MESSAGE);
            } catch (SQLException ex) {
                Logger.getLogger(CadastroProdutos2.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_Botao_AlterarActionPerformed

    private void Botao_ExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Botao_ExcluirActionPerformed
        try {
            Connection conn = new Conexao().getConnection();
            Clientes p = new Clientes();
            p.setId(Integer.parseInt(Text_id.getText()));

            p.Deletar(conn);
            Consultar();

            Text_id.setText("");
            Text_Nome.setText("");
            Text_Telefone.setText("");
            Text_Email.setText("");
            Text_CPF.setText("");
        } catch (java.lang.NumberFormatException ex) {
            JOptionPane.showMessageDialog(null, "Selecione uma linha da tabela", "Problema", JOptionPane.ERROR_MESSAGE);
        } catch (SQLException ex) {
            Logger.getLogger(CadastroProdutos2.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_Botao_ExcluirActionPerformed

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
        try {
            Consultar();
        } catch (SQLException ex) {
            Logger.getLogger(CadastroClientes.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_formWindowActivated

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
            java.util.logging.Logger.getLogger(CadastroClientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CadastroClientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CadastroClientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CadastroClientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new CadastroClientes().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Botao_Alterar;
    private javax.swing.JButton Botao_Cadastrar;
    private javax.swing.JButton Botao_Excluir;
    private javax.swing.JButton Botao_Sair;
    private javax.swing.JMenuItem MenuCadastroClientes;
    private javax.swing.JMenuItem MenuCadastroFornecedores;
    private javax.swing.JMenuItem MenuCadastroProdutos;
    private javax.swing.JMenu MenuCadastros;
    private javax.swing.JMenu MenuFinanceiro;
    private javax.swing.JMenu MenuHistorico;
    private javax.swing.JMenuItem MenuHistoricogeral;
    private javax.swing.JMenuItem MenuPedidos;
    private javax.swing.JMenuItem MenuVendas;
    private javax.swing.JTable Tabela_Clientes;
    private javax.swing.JTextField Text_CPF;
    private javax.swing.JTextField Text_Email;
    private javax.swing.JTextField Text_Nome;
    private javax.swing.JFormattedTextField Text_Telefone;
    private javax.swing.JLabel Text_id;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
