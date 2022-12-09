/*
 * The MIT License
 *
 * Copyright 2022 bruno.
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in
 * all copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN
 * THE SOFTWARE.
 */
package br.com.projeto.view;

import br.com.projeto.dao.ItemVendaDAO;
import br.com.projeto.dao.VendasDAO;
import br.com.projeto.model.Clientes;
import br.com.projeto.model.ItemVendas;
import br.com.projeto.model.Produtos;
import br.com.projeto.model.Vendas;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author bruno
 */
public class frmPagamentos extends javax.swing.JFrame {

    Clientes cliente = new Clientes();
    DefaultTableModel carrinho;

    public frmPagamentos() {
        initComponents();
        txt_Cartao.setText("0");
        txt_Cheque.setText("0");
        txt_Dinheiro.setText("0");
        txt_Troco.setText("0");
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txt_Dinheiro = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txt_Cartao = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txt_Cheque = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txt_Troco = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txtTotal = new javax.swing.JTextField();
        btnFinalizarVenda = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtObs = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Tela de Pamentos");

        jPanel1.setBackground(new java.awt.Color(0, 0, 204));

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel1.setText("Pagamentos");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(90, 90, 90)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jLabel1)
                .addContainerGap(34, Short.MAX_VALUE))
        );

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 26)); // NOI18N
        jLabel2.setText("DINHEIRO:");
        jLabel2.setName("lbl_Codigo"); // NOI18N

        txt_Dinheiro.setFont(new java.awt.Font("Tahoma", 0, 26)); // NOI18N
        txt_Dinheiro.setName("txt_Dinheiro"); // NOI18N
        txt_Dinheiro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_DinheiroActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 26)); // NOI18N
        jLabel3.setText("CARTÃO:");
        jLabel3.setName("lbl_Codigo"); // NOI18N

        txt_Cartao.setFont(new java.awt.Font("Tahoma", 0, 26)); // NOI18N
        txt_Cartao.setName("txt_Codigo"); // NOI18N
        txt_Cartao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_CartaoActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 26)); // NOI18N
        jLabel4.setText("CHEQUE:");
        jLabel4.setName("lbl_Codigo"); // NOI18N

        txt_Cheque.setFont(new java.awt.Font("Tahoma", 0, 26)); // NOI18N
        txt_Cheque.setName("txt_Codigo"); // NOI18N
        txt_Cheque.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_ChequeActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 26)); // NOI18N
        jLabel5.setText("TROCO:");
        jLabel5.setName("lbl_Codigo"); // NOI18N

        txt_Troco.setEditable(false);
        txt_Troco.setFont(new java.awt.Font("Tahoma", 0, 26)); // NOI18N
        txt_Troco.setName("txt_Codigo"); // NOI18N
        txt_Troco.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_TrocoActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 26)); // NOI18N
        jLabel6.setText("TOTAL:");
        jLabel6.setName("lbl_Codigo"); // NOI18N

        txtTotal.setEditable(false);
        txtTotal.setFont(new java.awt.Font("Tahoma", 0, 26)); // NOI18N
        txtTotal.setName("txt_Codigo"); // NOI18N
        txtTotal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTotalActionPerformed(evt);
            }
        });

        btnFinalizarVenda.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnFinalizarVenda.setText("FINALIZAR VENDA");
        btnFinalizarVenda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFinalizarVendaActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 26)); // NOI18N
        jLabel7.setText("Observação:");
        jLabel7.setName("lbl_Codigo"); // NOI18N

        txtObs.setColumns(20);
        txtObs.setRows(5);
        jScrollPane1.setViewportView(txtObs);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(txtTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(txt_Troco, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(txt_Cheque, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(txt_Cartao, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txt_Dinheiro, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(33, 33, 33)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(94, 94, 94)
                        .addComponent(btnFinalizarVenda, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(26, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txt_Dinheiro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(txt_Cartao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(txt_Cheque, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(txt_Troco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(txtTotal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(35, 35, 35)
                .addComponent(btnFinalizarVenda, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(37, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void txt_DinheiroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_DinheiroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_DinheiroActionPerformed

    private void txt_CartaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_CartaoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_CartaoActionPerformed

    private void txt_ChequeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_ChequeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_ChequeActionPerformed

    private void txt_TrocoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_TrocoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_TrocoActionPerformed

    private void txtTotalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTotalActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTotalActionPerformed

    private void btnFinalizarVendaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFinalizarVendaActionPerformed
        // Botão para finalizar venda
        
            double pagamentoCartao, pagamentoCheque, pagamentoDinheiro, totalPago, totalVenda, troco;

            pagamentoCartao = Double.parseDouble(txt_Cartao.getText());
            pagamentoCheque = Double.parseDouble(txt_Cheque.getText());
            pagamentoDinheiro = Double.parseDouble(txt_Dinheiro.getText());

            totalVenda = Double.parseDouble(txtTotal.getText());

            //Calcula total da compra e o preço
            totalPago = pagamentoCartao + pagamentoCheque + pagamentoDinheiro;

            //Calcular o troco do cliente
            troco = totalPago - totalVenda;
            txt_Troco.setText(String.valueOf(troco));

            Vendas vendas = new Vendas();

            //Dados do cliente 
            vendas.setCliente(cliente);

            // Pega a data da venda com formato dos EUA
            Date agora = new Date();
            SimpleDateFormat dataEUA = new SimpleDateFormat("yyyy-MM-dd");
            String dataMysql = dataEUA.format(agora);

            vendas.setData_venda(dataMysql);

            //Total da venda do cliente
            vendas.setTotal_venda(totalVenda);
            vendas.setObs(txtObs.getText());

            //Salvando vendas dentro do banco de dados
            VendasDAO dao_vendas = new VendasDAO();
            dao_vendas.cadastrarVenda(vendas);

            //Retorna o id da ultima venda realizada
            vendas.setId(dao_vendas.retornarUltimaVenda());

            //System.out.println("ID da última venda: " + vendas.getId());
            //Cadastrar produtos na tabela de itens vendas
            for (int i = 0; i < carrinho.getRowCount() - 1; i++) {
                Produtos objp = new Produtos();
                ItemVendas item = new ItemVendas();
                item.setVenda(vendas);

                objp.setId(Integer.parseInt(carrinho.getValueAt(i, 0).toString()));
                //produto está na coluna 0
                item.setProduto(objp);
                //Quantidade está na coluna 2
                item.setQtd(Integer.parseInt(carrinho.getValueAt(i, 2).toString()));
                //Subtotal está na coluna 4
                item.setSubtotal(Double.parseDouble(carrinho.getValueAt(i, 4).toString()));

                ItemVendaDAO daoitem = new ItemVendaDAO();
                daoitem.cadastrarItem(item);

            }
                            

      
        /**
         * ****************************************************************
         */


    }//GEN-LAST:event_btnFinalizarVendaActionPerformed

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
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(frmPagamentos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmPagamentos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmPagamentos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmPagamentos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmPagamentos().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnFinalizarVenda;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea txtObs;
    public javax.swing.JTextField txtTotal;
    private javax.swing.JTextField txt_Cartao;
    private javax.swing.JTextField txt_Cheque;
    private javax.swing.JTextField txt_Dinheiro;
    private javax.swing.JTextField txt_Troco;
    // End of variables declaration//GEN-END:variables
}
