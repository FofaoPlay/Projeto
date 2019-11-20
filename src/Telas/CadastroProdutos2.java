/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Telas;

import Classes.Produtos;
import Conec.Conexao;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Fofao
 */
public class CadastroProdutos2 extends javax.swing.JFrame {

    public void Consultar() throws SQLException {
        DefaultTableModel grid0 = (DefaultTableModel) Tabela_Produtos.getModel();
        grid0.setNumRows(0);
        Connection conn = null;
        Conexao bd = new Conexao();
        conn = bd.getConnection();
        Statement stm = null;
        ResultSet rs = null;
        String SQLConsulta = "SELECT * FROM Produtos";
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
                String recebe_telefone = rs.getString("PrecoCompra");
                String recebe_email = rs.getString("PrecoVenda");
                String recebe_cpf = rs.getString("Quantidade");

                DefaultTableModel grid = (DefaultTableModel) Tabela_Produtos.getModel();
                grid0.addRow(new String[]{recebe_id, recebe_nome, recebe_telefone, recebe_email, recebe_cpf});
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
     * Creates new form CadastroProdutos
     */
    public CadastroProdutos2() {
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

        Text_Nome = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        Botao_Sair = new javax.swing.JButton();
        Botao_Cadastro = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        Tabela_Produtos = new javax.swing.JTable();
        Text_Quant = new javax.swing.JTextField();
        Text_Compra = new javax.swing.JTextField();
        Text_Venda = new javax.swing.JTextField();
        Botao_Alterar = new javax.swing.JButton();
        Botao_Excluir = new javax.swing.JButton();
        Botao_Listar = new javax.swing.JButton();
        Text_id = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        MenuCadastros = new javax.swing.JMenu();
        MenuCadastroClientes = new javax.swing.JMenuItem();
        MenuCadastroFornecedores = new javax.swing.JMenuItem();
        MenuCadastroProdutos = new javax.swing.JMenuItem();
        MenuFinanceiro = new javax.swing.JMenu();
        MenuPedidos = new javax.swing.JMenuItem();
        MenuVendas = new javax.swing.JMenuItem();
        MenuSaldos = new javax.swing.JMenuItem();
        MenuHistorico = new javax.swing.JMenu();
        MenuHistoricogeral = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Nome do Produto:");

        jLabel2.setText("Preço de Venda:");

        jLabel3.setText("Preço de Compra:");

        jLabel4.setText("Quantidade:");

        Botao_Sair.setText("Sair");
        Botao_Sair.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Botao_SairMouseClicked(evt);
            }
        });
        Botao_Sair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Botao_SairActionPerformed(evt);
            }
        });

        Botao_Cadastro.setText("Cadastrar");
        Botao_Cadastro.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Botao_CadastroMouseClicked(evt);
            }
        });
        Botao_Cadastro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Botao_CadastroActionPerformed(evt);
            }
        });

        Tabela_Produtos.setModel(new javax.swing.table.DefaultTableModel(
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
                "Código", "Nome", "Preço de Venda", "Preço de Compra", "Quantidade"
            }
        ));
        Tabela_Produtos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Tabela_ProdutosMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(Tabela_Produtos);

        Botao_Alterar.setText("Alterar");
        Botao_Alterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Botao_AlterarActionPerformed(evt);
            }
        });

        Botao_Excluir.setText("Excluir");
        Botao_Excluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Botao_ExcluirActionPerformed(evt);
            }
        });

        Botao_Listar.setText("Atualizar");
        Botao_Listar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Botao_ListarActionPerformed(evt);
            }
        });

        jLabel5.setText("Código:");

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

        MenuSaldos.setText("Saldos");
        MenuSaldos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuSaldosActionPerformed(evt);
            }
        });
        MenuFinanceiro.add(MenuSaldos);

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
                    .addComponent(jScrollPane1)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(Botao_Cadastro)
                        .addGap(18, 18, 18)
                        .addComponent(Botao_Alterar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Botao_Excluir)
                        .addGap(0, 496, Short.MAX_VALUE)
                        .addComponent(Botao_Sair))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(Text_id, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5))
                        .addGap(27, 27, 27)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(Text_Nome, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(30, 30, 30)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(Text_Compra)
                            .addComponent(jLabel3))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(Text_Venda)
                            .addComponent(jLabel2))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(1, 1, 1)
                                .addComponent(Text_Quant))
                            .addComponent(jLabel4))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(Botao_Listar)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 219, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(Botao_Listar)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jLabel5)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(Text_id, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                            .addComponent(jLabel1)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(Text_Nome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel3)
                                .addComponent(jLabel2))
                            .addGap(26, 26, 26)))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jLabel4)
                            .addGap(26, 26, 26))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Text_Venda, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Text_Compra, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(Text_Quant, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Botao_Cadastro)
                    .addComponent(Botao_Sair)
                    .addComponent(Botao_Alterar)
                    .addComponent(Botao_Excluir))
                .addContainerGap(29, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Botao_SairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Botao_SairActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Botao_SairActionPerformed

    private void Botao_CadastroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Botao_CadastroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Botao_CadastroActionPerformed

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

    private void MenuSaldosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuSaldosActionPerformed
        Saldos c = new Saldos();
        c.setVisible(true);
        dispose();
    }//GEN-LAST:event_MenuSaldosActionPerformed

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

    private void Botao_CadastroMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Botao_CadastroMouseClicked
        Connection conn = new Conec.Conexao().getConnection();
        Produtos p = new Produtos();

        p.setNome(Text_Nome.getText());
        p.setPrecocompra(Double.parseDouble(Text_Compra.getText()));
        p.setPrecovenda(Double.parseDouble(Text_Venda.getText()));
        p.setQuantidade(Integer.parseInt(Text_Quant.getText()));

        p.cadastrar(conn);
    }//GEN-LAST:event_Botao_CadastroMouseClicked

    private void Botao_AlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Botao_AlterarActionPerformed
        Connection conn = new Conexao().getConnection();
        Produtos p = new Produtos();

        p.setId(Integer.parseInt(Text_id.getText()));
        p.setNome(Text_Nome.getText());
        p.setPrecocompra(Double.parseDouble(Text_Compra.getText()));
        p.setPrecovenda(Double.parseDouble(Text_Venda.getText()));
        p.setQuantidade(Integer.parseInt(Text_Quant.getText()));

        p.Alterar(conn);
    }//GEN-LAST:event_Botao_AlterarActionPerformed

    private void Botao_ListarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Botao_ListarActionPerformed
        try {
            Consultar();
        } catch (SQLException ex) {
            Logger.getLogger(CadastroClientes.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_Botao_ListarActionPerformed

    private void Tabela_ProdutosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Tabela_ProdutosMouseClicked
        DefaultTableModel grid0 = (DefaultTableModel) Tabela_Produtos.getModel();

        Text_id.setText((String) Tabela_Produtos.getValueAt(Tabela_Produtos.getSelectedRow(), 0));
        Text_Nome.setText((String) Tabela_Produtos.getValueAt(Tabela_Produtos.getSelectedRow(), 1));
        Text_Venda.setText((String) Tabela_Produtos.getValueAt(Tabela_Produtos.getSelectedRow(), 2));
        Text_Compra.setText((String) Tabela_Produtos.getValueAt(Tabela_Produtos.getSelectedRow(), 3));
        Text_Quant.setText((String) Tabela_Produtos.getValueAt(Tabela_Produtos.getSelectedRow(), 4));
    }//GEN-LAST:event_Tabela_ProdutosMouseClicked

    private void Botao_ExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Botao_ExcluirActionPerformed
        Connection conn = new Conexao().getConnection();
        Produtos p = new Produtos();
        p.setId(Integer.parseInt(Text_id.getText()));

        p.Alterar(conn);
    }//GEN-LAST:event_Botao_ExcluirActionPerformed

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
            java.util.logging.Logger.getLogger(CadastroProdutos2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CadastroProdutos2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CadastroProdutos2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CadastroProdutos2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CadastroProdutos2().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Botao_Alterar;
    private javax.swing.JButton Botao_Cadastro;
    private javax.swing.JButton Botao_Excluir;
    private javax.swing.JButton Botao_Listar;
    private javax.swing.JButton Botao_Sair;
    private javax.swing.JMenuItem MenuCadastroClientes;
    private javax.swing.JMenuItem MenuCadastroFornecedores;
    private javax.swing.JMenuItem MenuCadastroProdutos;
    private javax.swing.JMenu MenuCadastros;
    private javax.swing.JMenu MenuFinanceiro;
    private javax.swing.JMenu MenuHistorico;
    private javax.swing.JMenuItem MenuHistoricogeral;
    private javax.swing.JMenuItem MenuPedidos;
    private javax.swing.JMenuItem MenuSaldos;
    private javax.swing.JMenuItem MenuVendas;
    private javax.swing.JTable Tabela_Produtos;
    private javax.swing.JTextField Text_Compra;
    private javax.swing.JTextField Text_Nome;
    private javax.swing.JTextField Text_Quant;
    private javax.swing.JTextField Text_Venda;
    private javax.swing.JLabel Text_id;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
