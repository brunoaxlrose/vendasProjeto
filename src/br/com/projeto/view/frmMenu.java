/*
 * The MIT License
 *
 * Copyright 2022 Bruno Lucas Alcantara de Oliveira.
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

import java.awt.Graphics;
import java.awt.Image;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import static javax.swing.UIManager.getString;

/**
 *
 * @author Bruno Oliveira
 * @version 0.1
 */
public class frmMenu extends javax.swing.JFrame {

    /**
     * Creates new form frmMenu
     */
    public String usuariologado;
    public String usuarioCargo;
    public String lblOperador;

    public frmMenu() {
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

        jPanel2 = new javax.swing.JPanel();
        telaControleCliente = new javax.swing.JToggleButton();
        telaControleFuncionario = new javax.swing.JToggleButton();
        telaPDV = new javax.swing.JToggleButton();
        SairPrograma = new javax.swing.JToggleButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        lblUsuario = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        lblCargo = new javax.swing.JLabel();
        telaConsultaCliente = new javax.swing.JToggleButton();
        telaConsultaFuncionario = new javax.swing.JToggleButton();
        telaConsultaFornecedores = new javax.swing.JToggleButton();
        telaControleFornecedor = new javax.swing.JToggleButton();
        telaTrocarUsuario = new javax.swing.JToggleButton();
        telaHistoricoVendas = new javax.swing.JToggleButton();
        telaControleEstoque = new javax.swing.JToggleButton();
        telaPosicaoDia = new javax.swing.JToggleButton();
        telaConsultaProduto = new javax.swing.JToggleButton();
        jLabel3 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        lblData = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Sistema de controle de estoque");
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
        });

        jPanel2.setBackground(new java.awt.Color(55, 149, 193));

        telaControleCliente.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        telaControleCliente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/pacotes icones/clientes.png"))); // NOI18N
        telaControleCliente.setText("Cadastro de Cliente");
        telaControleCliente.setToolTipText("");
        telaControleCliente.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        telaControleCliente.setDisplayedMnemonicIndex(0);
        telaControleCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                telaControleClienteActionPerformed(evt);
            }
        });

        telaControleFuncionario.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        telaControleFuncionario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/pacotes icones/funcionarios.png"))); // NOI18N
        telaControleFuncionario.setText("Cadastro de Funcion??rios");
        telaControleFuncionario.setToolTipText("");
        telaControleFuncionario.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        telaControleFuncionario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                telaControleFuncionarioActionPerformed(evt);
            }
        });

        telaPDV.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        telaPDV.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/pacotes icones/vendas.png"))); // NOI18N
        telaPDV.setText("Abrir PDV");
        telaPDV.setToolTipText("");
        telaPDV.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        telaPDV.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                telaPDVActionPerformed(evt);
            }
        });

        SairPrograma.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        SairPrograma.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/pacotes icones/sair.png"))); // NOI18N
        SairPrograma.setText("Exit");
        SairPrograma.setToolTipText("");
        SairPrograma.setActionCommand("Configura????es");
        SairPrograma.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        SairPrograma.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SairProgramaActionPerformed(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(55, 149, 193));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel1.setText("Usu??rio logado:");

        lblUsuario.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lblUsuario.setForeground(new java.awt.Color(255, 0, 0));
        lblUsuario.setText("----");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel2.setText("Cargo:");

        lblCargo.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lblCargo.setForeground(new java.awt.Color(255, 0, 0));
        lblCargo.setText("----");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblUsuario)
                .addGap(18, 18, 18)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblCargo)
                .addContainerGap(47, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(lblUsuario)
                    .addComponent(jLabel2)
                    .addComponent(lblCargo))
                .addGap(76, 76, 76))
        );

        telaConsultaCliente.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        telaConsultaCliente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/pacotes icones/clientes.png"))); // NOI18N
        telaConsultaCliente.setText("Consulta de Cliente");
        telaConsultaCliente.setToolTipText("");
        telaConsultaCliente.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        telaConsultaCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                telaConsultaClienteActionPerformed(evt);
            }
        });

        telaConsultaFuncionario.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        telaConsultaFuncionario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/pacotes icones/funcionarios.png"))); // NOI18N
        telaConsultaFuncionario.setText("Consulta de Funcion??rios");
        telaConsultaFuncionario.setToolTipText("");
        telaConsultaFuncionario.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        telaConsultaFuncionario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                telaConsultaFuncionarioActionPerformed(evt);
            }
        });

        telaConsultaFornecedores.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        telaConsultaFornecedores.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/pacotes icones/fornecedores.png"))); // NOI18N
        telaConsultaFornecedores.setText("Consulta de Fornecedores");
        telaConsultaFornecedores.setToolTipText("");
        telaConsultaFornecedores.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        telaConsultaFornecedores.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                telaConsultaFornecedoresActionPerformed(evt);
            }
        });

        telaControleFornecedor.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        telaControleFornecedor.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/pacotes icones/fornecedores.png"))); // NOI18N
        telaControleFornecedor.setText("Cadastro de Fornecedores");
        telaControleFornecedor.setToolTipText("");
        telaControleFornecedor.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        telaControleFornecedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                telaControleFornecedorActionPerformed(evt);
            }
        });

        telaTrocarUsuario.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        telaTrocarUsuario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/pacotes icones/configuracoes.png"))); // NOI18N
        telaTrocarUsuario.setText("Trocar usu??rio");
        telaTrocarUsuario.setToolTipText("");
        telaTrocarUsuario.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        telaTrocarUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                telaTrocarUsuarioActionPerformed(evt);
            }
        });

        telaHistoricoVendas.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        telaHistoricoVendas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/pacotes icones/vendas.png"))); // NOI18N
        telaHistoricoVendas.setText("Hist??rico de vendas");
        telaHistoricoVendas.setToolTipText("");
        telaHistoricoVendas.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        telaHistoricoVendas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                telaHistoricoVendasActionPerformed(evt);
            }
        });

        telaControleEstoque.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        telaControleEstoque.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/pacotes icones/produtos.png"))); // NOI18N
        telaControleEstoque.setText("Controle de estoque");
        telaControleEstoque.setToolTipText("");
        telaControleEstoque.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        telaControleEstoque.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                telaControleEstoqueActionPerformed(evt);
            }
        });

        telaPosicaoDia.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        telaPosicaoDia.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/pacotes icones/vendas.png"))); // NOI18N
        telaPosicaoDia.setText("Posi????o do dia");
        telaPosicaoDia.setToolTipText("");
        telaPosicaoDia.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        telaPosicaoDia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                telaPosicaoDiaActionPerformed(evt);
            }
        });

        telaConsultaProduto.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        telaConsultaProduto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/pacotes icones/produtos.png"))); // NOI18N
        telaConsultaProduto.setText("Consulta de produtos");
        telaConsultaProduto.setToolTipText("");
        telaConsultaProduto.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        telaConsultaProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                telaConsultaProdutoActionPerformed(evt);
            }
        });

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/projeto/imagens/LOGO.png"))); // NOI18N
        jLabel3.setLabelFor(this);

        jPanel3.setBackground(new java.awt.Color(55, 149, 193));

        lblData.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lblData.setForeground(new java.awt.Color(255, 0, 0));
        lblData.setText("----");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel4.setText("Data:");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblData)
                .addContainerGap(28, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(lblData))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(telaControleCliente, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(telaControleFuncionario, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(telaControleFornecedor, javax.swing.GroupLayout.DEFAULT_SIZE, 227, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(telaConsultaFuncionario, javax.swing.GroupLayout.PREFERRED_SIZE, 227, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(telaConsultaCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 227, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(telaControleEstoque, javax.swing.GroupLayout.DEFAULT_SIZE, 227, Short.MAX_VALUE)
                            .addComponent(telaPDV, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(telaPosicaoDia, javax.swing.GroupLayout.PREFERRED_SIZE, 227, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(telaConsultaFornecedores, javax.swing.GroupLayout.PREFERRED_SIZE, 227, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(telaConsultaProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 227, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(SairPrograma, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(telaHistoricoVendas, javax.swing.GroupLayout.DEFAULT_SIZE, 290, Short.MAX_VALUE)
                            .addComponent(telaTrocarUsuario, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(telaControleCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(telaConsultaCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(1, 1, 1)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(telaControleFuncionario, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(telaConsultaFuncionario, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(7, 7, 7)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(telaConsultaFornecedores, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(telaControleFornecedor, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(telaTrocarUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(4, 4, 4)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(telaPDV, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(telaPosicaoDia, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(telaHistoricoVendas, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(telaControleEstoque, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(SairPrograma, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(telaConsultaProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(35, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated

        Date agora = new Date();

        //Colocar a data do tipo desejado.
       // SimpleDateTime dataBr = new SimpleDateTime("dd/MM/yyyy HH:MM:ss");
        SimpleDateFormat dataBr = new SimpleDateFormat("dd/MM/yyyy");
        String dataFormatada = dataBr.format(agora);
        //Chamando a data atual para o campo txt citado.
        lblData.setText(dataFormatada);
        this.setVisible(true);
        
        //Mostrar qual usuario est?? logado
        lblUsuario.setText(usuariologado);
        //Mostrar cargo do usuario.
        lblCargo.setText(usuarioCargo);
        this.setVisible(true);
    }//GEN-LAST:event_formWindowActivated

    private void telaControleEstoqueActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_telaControleEstoqueActionPerformed
        // Abrir controle de estoque
        frmEstoque telaEstoque = new frmEstoque();
        telaEstoque.setVisible(true);
    }//GEN-LAST:event_telaControleEstoqueActionPerformed

    private void telaConsultaProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_telaConsultaProdutoActionPerformed
        // Abri consulta de produto
        frmProduto telaProduto = new frmProduto();
        telaProduto.setVisible(true);
    }//GEN-LAST:event_telaConsultaProdutoActionPerformed

    private void telaControleClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_telaControleClienteActionPerformed

        frmFuncionario tela = new frmFuncionario();
        //Selecionar a tela de consulta, chamando pela guia.
        tela.jTabbedPane1.setSelectedIndex(0);
        tela.setVisible(true);

    }//GEN-LAST:event_telaControleClienteActionPerformed

    private void SairProgramaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SairProgramaActionPerformed
        // Ao clicar com mouse, com uma pergunta
        int retorno;

        retorno = JOptionPane.showConfirmDialog(null, "Desejar sair?");

        //Condi????o para quando usu??rio clicar "Sim" a aplica????o encerrar.
        if (retorno == 0) {
            System.exit(0);
        }
    }//GEN-LAST:event_SairProgramaActionPerformed

    private void telaTrocarUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_telaTrocarUsuarioActionPerformed
        // Bot??o trocar de usu??rio, efetuar logout
        frmLogin telaLogin = new frmLogin();
        int retorno;

        retorno = JOptionPane.showConfirmDialog(null, "Desejar trocar de usu??rio?");

        //Condi????o para caso usu??rio n??o desejar trocar o usu??rio.
        if (retorno == 0) {
            this.dispose();
            telaLogin.setVisible(true);
        }

    }//GEN-LAST:event_telaTrocarUsuarioActionPerformed

    private void telaPosicaoDiaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_telaPosicaoDiaActionPerformed
        // Bot??o posi????o do dia
        frmTotalVenda telaPosicaoDia = new frmTotalVenda();
        telaPosicaoDia.setVisible(true);
    }//GEN-LAST:event_telaPosicaoDiaActionPerformed

    private void telaHistoricoVendasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_telaHistoricoVendasActionPerformed
        // Bot??o Controle de vendas
        frmHistorico telaHistorico = new frmHistorico();
        telaHistorico.setVisible(true);
    }//GEN-LAST:event_telaHistoricoVendasActionPerformed

    private void telaConsultaClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_telaConsultaClienteActionPerformed
        // Bot??o consultar cliente
        frmCliente tela = new frmCliente();
        //Selecionar a tela de consulta, chamando pela guia.
        tela.jTabbedPane1.setSelectedIndex(1);
        tela.setVisible(true);
    }//GEN-LAST:event_telaConsultaClienteActionPerformed

    private void telaConsultaFuncionarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_telaConsultaFuncionarioActionPerformed
        // Bot??o consultar funcionario
        frmFuncionario tela = new frmFuncionario();
        //Selecionar a tela de consulta, chamando pela guia.
        tela.jTabbedPane1.setSelectedIndex(1);
        tela.setVisible(true);
    }//GEN-LAST:event_telaConsultaFuncionarioActionPerformed

    private void telaConsultaFornecedoresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_telaConsultaFornecedoresActionPerformed
        // Bot??o consultar fornecedores
        frmFornecedor tela = new frmFornecedor();
        //Selecionar a tela de consulta, chamando pela guia.
        tela.jTabbedPane1.setSelectedIndex(1);
        tela.setVisible(true);
    }//GEN-LAST:event_telaConsultaFornecedoresActionPerformed

    private void telaControleFuncionarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_telaControleFuncionarioActionPerformed
        // Bot??o consultar funcionario
        frmFuncionario tela = new frmFuncionario();
        //Selecionar a tela de consulta, chamando pela guia.
        tela.jTabbedPane1.setSelectedIndex(0);
        tela.setVisible(true);
    }//GEN-LAST:event_telaControleFuncionarioActionPerformed

    private void telaPDVActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_telaPDVActionPerformed
        // Bot??o abrir pdv
        frmVendas telaPDV = new frmVendas();

        telaPDV.usuariologado = getString("nome");
        telaPDV.setVisible(true);
    }//GEN-LAST:event_telaPDVActionPerformed

    private void telaControleFornecedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_telaControleFornecedorActionPerformed
        frmFornecedor tela = new frmFornecedor();
        //Selecionar a tela de consulta, chamando pela guia.
        tela.jTabbedPane1.setSelectedIndex(0);
        tela.setVisible(true);
    }//GEN-LAST:event_telaControleFornecedorActionPerformed

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
            java.util.logging.Logger.getLogger(frmMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmMenu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JToggleButton SairPrograma;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JLabel lblCargo;
    public javax.swing.JLabel lblData;
    public javax.swing.JLabel lblUsuario;
    public javax.swing.JToggleButton telaConsultaCliente;
    public javax.swing.JToggleButton telaConsultaFornecedores;
    public javax.swing.JToggleButton telaConsultaFuncionario;
    public javax.swing.JToggleButton telaConsultaProduto;
    public javax.swing.JToggleButton telaControleCliente;
    public javax.swing.JToggleButton telaControleEstoque;
    public javax.swing.JToggleButton telaControleFornecedor;
    public javax.swing.JToggleButton telaControleFuncionario;
    public javax.swing.JToggleButton telaHistoricoVendas;
    public javax.swing.JToggleButton telaPDV;
    public javax.swing.JToggleButton telaPosicaoDia;
    public javax.swing.JToggleButton telaTrocarUsuario;
    // End of variables declaration//GEN-END:variables
}
