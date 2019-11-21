package Telas;

import Classes.Financeiro;
import Conec.Conexao;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;

public class Vendas extends javax.swing.JFrame {
String Codigo, Produto, ValorUnit, Quantidade;

    public void Consultar() throws SQLException {
        DefaultTableModel grid0 = (DefaultTableModel) Tabela_Produtos_Consulta.getModel();
        grid0.setNumRows(0);
        Connection conn = null;
        Conexao bd = new Conexao();
        conn = bd.getConnection();
        Statement stm = null;
        ResultSet rs = null;
        String SQLConsulta = "SELECT * FROM Contas";
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
                String recebe_telefone = rs.getString("Telefone");
                String recebe_email = rs.getString("Email");
                String recebe_cpf = rs.getString("Cpf_Cnpj");

                DefaultTableModel grid = (DefaultTableModel) Tabela_Produtos_Consulta.getModel();
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
     * Creates new form Produtos
     */
    public Vendas() {
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

        jScrollPane1 = new javax.swing.JScrollPane();
        Tabela_Produtos_Consulta = new javax.swing.JTable();
        Botao_Confirma = new javax.swing.JButton();
        Text_Quantidade = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        Botao_Sair = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        Text_Cliente = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        Text_Parcelas = new javax.swing.JTextField();
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
        Tabela_Produtos_Consulta.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Tabela_Produtos_ConsultaMouseClicked(evt);
            }
        });
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
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Text_Quantidade, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(25, 25, 25)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Text_Cliente, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Text_Parcelas, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(Botao_Sair))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 780, Short.MAX_VALUE))
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
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(Botao_Sair)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Text_Parcelas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Text_Quantidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Text_Cliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3))))
                .addGap(18, 18, 18)
                .addComponent(Botao_Confirma)
                .addContainerGap(14, Short.MAX_VALUE))
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

    private void Botao_ConfirmaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Botao_ConfirmaActionPerformed
        Date hoje = new Date();
        SimpleDateFormat dataFormatada = new SimpleDateFormat("dd/MM/yyyy");
        Calendar c = Calendar.getInstance();
        
        int Parcelas = Integer.parseInt(Text_Parcelas.getText());
        
        Connection conn = new Conexao().getConnection();
        Financeiro p = new Financeiro();

        p.setParceiro(Text_Cliente.getText());
        p.setProduto(Produto);
        Double ValorUni=(Double.parseDouble(ValorUnit));
        p.setQuantidade(Integer.parseInt(Text_Quantidade.getText()));
        
        Double Quantidade_=(Double.parseDouble(Text_Quantidade.getText()));
        p.setValorunit(ValorUni);
        p.setTotal((Quantidade_*ValorUni)/Parcelas);
        
        
        
        
        p.setTipo("Saída");
        p.setStatus("Não Quitado");
            stm.setDate(6, getDatacompra());
            stm.setDate(7, getVencimento());

        /*stm.setString(1, getParceiro());
            stm.setString(2, getProduto());
            stm.setDouble(3, getValorunit());
            stm.setInt(4, getQuantidade());
            stm.setDouble(5, getTotal());
            stm.setDate(6, getDatacompra());
            stm.setDate(7, getVencimento());
            stm.setString(8, getTipo());
            stm.setString(9, getStatus());*/
        p.cadastrar(conn);
        try {
            Consultar();
        } catch (SQLException ex) {
            Logger.getLogger(Vendas.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_Botao_ConfirmaActionPerformed

    private void Tabela_Produtos_ConsultaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Tabela_Produtos_ConsultaMouseClicked
        DefaultTableModel grid0 = (DefaultTableModel) Tabela_Produtos_Consulta.getModel();

        Codigo = ((String) Tabela_Produtos_Consulta.getValueAt(Tabela_Produtos_Consulta.getSelectedRow(), 0));
        Produto=((String) Tabela_Produtos_Consulta.getValueAt(Tabela_Produtos_Consulta.getSelectedRow(), 1));
        ValorUnit=((String) Tabela_Produtos_Consulta.getValueAt(Tabela_Produtos_Consulta.getSelectedRow(), 2));
        Quantidade=((String) Tabela_Produtos_Consulta.getValueAt(Tabela_Produtos_Consulta.getSelectedRow(), 3));
        
    }//GEN-LAST:event_Tabela_Produtos_ConsultaMouseClicked

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
            java.util.logging.Logger.getLogger(Vendas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Vendas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Vendas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Vendas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Vendas().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Botao_Confirma;
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
    private javax.swing.JTable Tabela_Produtos_Consulta;
    private javax.swing.JTextField Text_Cliente;
    private javax.swing.JTextField Text_Parcelas;
    private javax.swing.JTextField Text_Quantidade;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
