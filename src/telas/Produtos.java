/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package telas;

/**
 *
 * @author gusic
 */
public class Produtos extends javax.swing.JInternalFrame {

    /**
     * Creates new form Produtos
     */
    public Produtos() {
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
        Tabela_Produtos_Consulta = new javax.swing.JTable();
        Botao_Saida = new javax.swing.JButton();
        Botao_Saida1 = new javax.swing.JButton();
        Text_Quantidade = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        Menu_Cadastro_Clientes = new javax.swing.JMenuItem();
        Menu_Cadastro_Fornecedores = new javax.swing.JMenuItem();
        Menu_Cadastro_Produtos = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();

        Botao_Sair.setText("Sair");

        Tabela_Produtos_Consulta.setModel(new javax.swing.table.DefaultTableModel(
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
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Código", "Nome", "Preço de Venda", "Preço de Compra", "Quantidade"
            }
        ));
        jScrollPane1.setViewportView(Tabela_Produtos_Consulta);

        Botao_Saida.setText("saida");

        Botao_Saida1.setText("entrada");
        Botao_Saida1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Botao_Saida1ActionPerformed(evt);
            }
        });

        jLabel1.setText("Quantidade a ser alterada:");

        jMenu1.setText("Cadastros");

        Menu_Cadastro_Clientes.setText("Clientes");
        jMenu1.add(Menu_Cadastro_Clientes);

        Menu_Cadastro_Fornecedores.setText("Fornecedores");
        Menu_Cadastro_Fornecedores.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Menu_Cadastro_FornecedoresActionPerformed(evt);
            }
        });
        jMenu1.add(Menu_Cadastro_Fornecedores);

        Menu_Cadastro_Produtos.setText("Produtos");
        jMenu1.add(Menu_Cadastro_Produtos);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Produtos");
        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1)
            .addGroup(layout.createSequentialGroup()
                .addGap(7, 7, 7)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Text_Quantidade, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addComponent(Botao_Saida1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Botao_Saida, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 259, Short.MAX_VALUE)
                .addComponent(Botao_Sair))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 235, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(49, 49, 49)
                        .addComponent(Botao_Sair))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Text_Quantidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Botao_Saida1)
                            .addComponent(Botao_Saida)
                            .addComponent(jLabel1))))
                .addContainerGap(13, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Menu_Cadastro_FornecedoresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Menu_Cadastro_FornecedoresActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Menu_Cadastro_FornecedoresActionPerformed

    private void Botao_Saida1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Botao_Saida1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Botao_Saida1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Botao_Saida;
    private javax.swing.JButton Botao_Saida1;
    private javax.swing.JButton Botao_Sair;
    private javax.swing.JMenuItem Menu_Cadastro_Clientes;
    private javax.swing.JMenuItem Menu_Cadastro_Fornecedores;
    private javax.swing.JMenuItem Menu_Cadastro_Produtos;
    private javax.swing.JTable Tabela_Produtos_Consulta;
    private javax.swing.JTextField Text_Quantidade;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}