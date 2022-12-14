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

import br.com.projeto.dao.ClientesDAO;
import br.com.projeto.dao.FornecedoresDAO;
import br.com.projeto.model.Clientes;
import br.com.projeto.model.Fornecedores;
import br.com.projeto.model.Utilitarios;
import java.awt.event.KeyEvent;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Bruno Oliveira
 */
public class frmFornecedor extends javax.swing.JFrame {

    //MEtodo para listar na tabela
    public frmFornecedor() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        panelDados = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txt_Codigo = new javax.swing.JTextField();
        txt_Email = new javax.swing.JTextField();
        txt_Nome = new javax.swing.JTextField();
        txt_Bairro = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        txt_Celular = new javax.swing.JFormattedTextField();
        jLabel10 = new javax.swing.JLabel();
        txt_TelefoneFixo = new javax.swing.JFormattedTextField();
        txt_CEP = new javax.swing.JFormattedTextField();
        txt_Endereco = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        txt_Numero = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        txt_Cidade = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        txt_Complemento = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        cbx_UF = new javax.swing.JComboBox<>();
        txt_CNPJ = new javax.swing.JFormattedTextField();
        btnBuscar = new javax.swing.JButton();
        panelConsulta = new javax.swing.JPanel();
        jLabel16 = new javax.swing.JLabel();
        txtPesquisa = new javax.swing.JTextField();
        btnPesquisar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabelaFornecedor = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        btn_Novo = new javax.swing.JButton();
        btn_Salvar = new javax.swing.JButton();
        btn_Editar = new javax.swing.JButton();
        btn_Excluir = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setBackground(java.awt.SystemColor.windowBorder);
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setLocation(new java.awt.Point(0, 0));
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
        });

        panelDados.setBackground(new java.awt.Color(255, 255, 255));

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setText("C??digo:");
        jLabel2.setName("lbl_Codigo"); // NOI18N

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setText("Nome:");
        jLabel3.setName("lbl_Nome"); // NOI18N

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel4.setText("E-mail:");
        jLabel4.setName("lbl_Email"); // NOI18N

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel5.setText("CEP:");
        jLabel5.setName("lbl_CEP"); // NOI18N

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel6.setText("Bairro:");
        jLabel6.setName("lbl_Bairro"); // NOI18N

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel7.setText("CNPJ:");
        jLabel7.setName("lbl_RG"); // NOI18N

        txt_Codigo.setEditable(false);
        txt_Codigo.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txt_Codigo.setName("txt_Codigo"); // NOI18N
        txt_Codigo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_CodigoActionPerformed(evt);
            }
        });

        txt_Email.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txt_Email.setName("txt_Email"); // NOI18N

        txt_Nome.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txt_Nome.setName("txt_Nome"); // NOI18N

        txt_Bairro.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txt_Bairro.setName("txt_Bairro"); // NOI18N

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel9.setText("Celular:");
        jLabel9.setName("lbl_Celular"); // NOI18N

        try {
            txt_Celular.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("(##) #####-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        txt_Celular.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txt_Celular.setName("txt_Celular"); // NOI18N

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel10.setText("Telefone (fixo):");
        jLabel10.setName("lbl_Celular"); // NOI18N

        try {
            txt_TelefoneFixo.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("(##) ####-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        txt_TelefoneFixo.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txt_TelefoneFixo.setName("txt_Celular"); // NOI18N

        try {
            txt_CEP.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("#####-###")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        txt_CEP.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txt_CEP.setName("txt_CEP"); // NOI18N
        txt_CEP.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txt_CEPKeyPressed(evt);
            }
        });

        txt_Endereco.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txt_Endereco.setName("txt_Bairro"); // NOI18N

        jLabel11.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel11.setText("Endere??o:");
        jLabel11.setName("lbl_Endereco"); // NOI18N

        jLabel12.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel12.setText("N??:");
        jLabel12.setName("lbl_Numero"); // NOI18N

        txt_Numero.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txt_Numero.setName("txt_Numero"); // NOI18N

        jLabel13.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel13.setText("Cidade:");
        jLabel13.setName("lbl_Cidade"); // NOI18N

        txt_Cidade.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txt_Cidade.setName("txt_Cidade"); // NOI18N
        txt_Cidade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_CidadeActionPerformed(evt);
            }
        });

        jLabel14.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel14.setText("Complemento:");
        jLabel14.setName("lbl_Bairro"); // NOI18N

        txt_Complemento.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txt_Complemento.setName("txt_Bairro"); // NOI18N

        jLabel15.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel15.setText("UF:");
        jLabel15.setName("lbl_UF"); // NOI18N

        cbx_UF.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        cbx_UF.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "AC", "AL", "AP", "AM", "BA", "CE", "DF", "ES", "GO", "MA", "MT", "MS", "MG", "PA", "PB", "PR", "PE", "PI", "RJ", "RN", "RS", "RO", "RR", "SC", "SP", "SE", "TO", " " }));
        cbx_UF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbx_UFActionPerformed(evt);
            }
        });

        try {
            txt_CNPJ.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##.###.###/####-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        txt_CNPJ.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txt_CNPJ.setName("txt_Celular"); // NOI18N

        btnBuscar.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnBuscar.setText("Buscar");
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelDadosLayout = new javax.swing.GroupLayout(panelDados);
        panelDados.setLayout(panelDadosLayout);
        panelDadosLayout.setHorizontalGroup(
            panelDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelDadosLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(panelDadosLayout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txt_Codigo, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txt_Nome, javax.swing.GroupLayout.PREFERRED_SIZE, 385, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelDadosLayout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txt_CEP, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(20, 20, 20)
                        .addComponent(jLabel11)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txt_Endereco, javax.swing.GroupLayout.PREFERRED_SIZE, 322, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel12)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txt_Numero, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel15)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(cbx_UF, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(panelDadosLayout.createSequentialGroup()
                        .addComponent(jLabel13)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txt_Cidade, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txt_Bairro, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel14)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txt_Complemento))
                    .addGroup(panelDadosLayout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addGap(18, 18, 18)
                        .addComponent(txt_CNPJ, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelDadosLayout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txt_Email, javax.swing.GroupLayout.PREFERRED_SIZE, 322, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel9)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txt_Celular, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel10)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txt_TelefoneFixo, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panelDadosLayout.setVerticalGroup(
            panelDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelDadosLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txt_Codigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(txt_Nome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBuscar))
                .addGap(18, 18, 18)
                .addGroup(panelDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(txt_CNPJ, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(panelDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txt_Email, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9)
                    .addComponent(txt_Celular, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10)
                    .addComponent(txt_TelefoneFixo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(panelDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel12)
                        .addComponent(txt_Numero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel15)
                        .addComponent(cbx_UF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel11)
                        .addComponent(txt_Endereco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel5)
                        .addComponent(txt_CEP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(25, 25, 25)
                .addGroup(panelDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13)
                    .addComponent(txt_Cidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6)
                    .addComponent(txt_Bairro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel14)
                    .addComponent(txt_Complemento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(80, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Dados pessoais", panelDados);

        panelConsulta.setBackground(new java.awt.Color(255, 255, 255));

        jLabel16.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel16.setText("Nome:");
        jLabel16.setToolTipText("");
        jLabel16.setName("lbl_Nome"); // NOI18N

        txtPesquisa.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtPesquisa.setName("txt_Codigo"); // NOI18N
        txtPesquisa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPesquisaActionPerformed(evt);
            }
        });
        txtPesquisa.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtPesquisaKeyPressed(evt);
            }
        });

        btnPesquisar.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnPesquisar.setText("Buscar");
        btnPesquisar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPesquisarActionPerformed(evt);
            }
        });

        tabelaFornecedor.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "C??digo:", "Nome:", "CNPJ", "Email", "Celular", "Telefone", "CEP", "Endere??o", "N??", "Comp", "Bairro", "Cidade", "UF"
            }
        ));
        tabelaFornecedor.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabelaFornecedorMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tabelaFornecedor);

        javax.swing.GroupLayout panelConsultaLayout = new javax.swing.GroupLayout(panelConsulta);
        panelConsulta.setLayout(panelConsultaLayout);
        panelConsultaLayout.setHorizontalGroup(
            panelConsultaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelConsultaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelConsultaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(panelConsultaLayout.createSequentialGroup()
                        .addComponent(jLabel16)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtPesquisa, javax.swing.GroupLayout.PREFERRED_SIZE, 373, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnPesquisar)
                        .addGap(0, 284, Short.MAX_VALUE)))
                .addContainerGap())
        );
        panelConsultaLayout.setVerticalGroup(
            panelConsultaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelConsultaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelConsultaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel16)
                    .addComponent(txtPesquisa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnPesquisar))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(68, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Consulta de fornecedores", panelConsulta);

        jPanel1.setBackground(new java.awt.Color(55, 149, 193));
        jPanel1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel1.setFont(new java.awt.Font("Segoe UI Black", 0, 24)); // NOI18N
        jLabel1.setText("Cadastro de Fornecedores");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(258, 258, 258))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jLabel1)
                .addContainerGap(34, Short.MAX_VALUE))
        );

        btn_Novo.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btn_Novo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/pacotes icones/novo.png"))); // NOI18N
        btn_Novo.setText("NOVO");
        btn_Novo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_NovoActionPerformed(evt);
            }
        });

        btn_Salvar.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btn_Salvar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/pacotes icones/salvar.png"))); // NOI18N
        btn_Salvar.setText("SALVAR");
        btn_Salvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_SalvarActionPerformed(evt);
            }
        });

        btn_Editar.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btn_Editar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/pacotes icones/editar.png"))); // NOI18N
        btn_Editar.setText("EDITAR");
        btn_Editar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_EditarActionPerformed(evt);
            }
        });

        btn_Excluir.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btn_Excluir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/pacotes icones/excluir.png"))); // NOI18N
        btn_Excluir.setText("EXCLUIR");
        btn_Excluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_ExcluirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jTabbedPane1)
            .addGroup(layout.createSequentialGroup()
                .addGap(186, 186, 186)
                .addComponent(btn_Novo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btn_Salvar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btn_Editar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btn_Excluir)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 315, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_Novo, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_Excluir, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_Salvar, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_Editar, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(60, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void txtPesquisaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPesquisaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPesquisaActionPerformed

    private void cbx_UFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbx_UFActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbx_UFActionPerformed

    private void txt_CidadeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_CidadeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_CidadeActionPerformed

    private void txt_CodigoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_CodigoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_CodigoActionPerformed

    public void listar() {

        FornecedoresDAO dao = new FornecedoresDAO();
        List<Fornecedores> lista = dao.listarFornecedores();
        // Cria o objeto que armazena os dados da tabela fornecedor.
        DefaultTableModel dados = (DefaultTableModel) tabelaFornecedor.getModel();
        // Contar quantas linhas ter?? dentro da tabela
        dados.setNumRows(0);
        // Adiciona linha para item da lista da tabela desejada.
        for (Fornecedores c : lista) {
            dados.addRow(new Object[]{
                c.getId(),
                c.getNome(),
                c.getCnpj(),
                c.getEmail(),
                c.getTelefone(),
                c.getCelular(),
                c.getCep(),
                c.getEndereco(),
                c.getNumero(),
                c.getComplemento(),
                c.getBairro(),
                c.getCidade(),
                c.getUf()
            });
        }
    }
    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
        // Carrega a lista de clientes
        listar();
    }//GEN-LAST:event_formWindowActivated

    private void tabelaFornecedorMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabelaFornecedorMouseClicked
        // Pegar os dados do painel consulta e enviar para cadastrar cliente com os dados
        jTabbedPane1.setSelectedIndex(0);
        txt_Codigo.setText(tabelaFornecedor.getValueAt(tabelaFornecedor.getSelectedRow(), 0).toString());
        txt_Nome.setText(tabelaFornecedor.getValueAt(tabelaFornecedor.getSelectedRow(), 1).toString());
        txt_CNPJ.setText(tabelaFornecedor.getValueAt(tabelaFornecedor.getSelectedRow(), 2).toString());
        txt_Email.setText(tabelaFornecedor.getValueAt(tabelaFornecedor.getSelectedRow(), 3).toString());
        txt_TelefoneFixo.setText(tabelaFornecedor.getValueAt(tabelaFornecedor.getSelectedRow(), 4).toString());
        txt_Celular.setText(tabelaFornecedor.getValueAt(tabelaFornecedor.getSelectedRow(), 5).toString());
        txt_CEP.setText(tabelaFornecedor.getValueAt(tabelaFornecedor.getSelectedRow(), 6).toString());
        txt_Endereco.setText(tabelaFornecedor.getValueAt(tabelaFornecedor.getSelectedRow(), 7).toString());
        txt_Numero.setText(tabelaFornecedor.getValueAt(tabelaFornecedor.getSelectedRow(), 8).toString());
        txt_Complemento.setText(tabelaFornecedor.getValueAt(tabelaFornecedor.getSelectedRow(), 9).toString());
        txt_Bairro.setText(tabelaFornecedor.getValueAt(tabelaFornecedor.getSelectedRow(), 10).toString());
        txt_Cidade.setText(tabelaFornecedor.getValueAt(tabelaFornecedor.getSelectedRow(), 11).toString());
        cbx_UF.setSelectedItem(tabelaFornecedor.getValueAt(tabelaFornecedor.getSelectedRow(), 12).toString());
    }//GEN-LAST:event_tabelaFornecedorMouseClicked

    private void btnPesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPesquisarActionPerformed
        // Bot??o pesquisar com porcentagem para encontrar qualquer valor aproximado usar %%
        String nome = "%" + txtPesquisa.getText() + "%";

        FornecedoresDAO dao = new FornecedoresDAO();
        List<Fornecedores> lista = dao.buscaFornecedorPorNome(nome);
        // Cria o objeto que armazena os dados da tabela fornecedor.
        DefaultTableModel dados = (DefaultTableModel) tabelaFornecedor.getModel();
        // Contar quantas linhas ter?? dentro da tabela
        dados.setNumRows(0);
        // Adiciona linha para item da lista da tabela desejada.
        for (Fornecedores c : lista) {
            dados.addRow(new Object[]{
                c.getId(),
                c.getNome(),
                c.getCnpj(),
                c.getEmail(),
                c.getTelefone(),
                c.getCelular(),
                c.getCep(),
                c.getEndereco(),
                c.getNumero(),
                c.getComplemento(),
                c.getBairro(),
                c.getCidade(),
                c.getUf()
            });
    }//GEN-LAST:event_btnPesquisarActionPerformed
    }


    private void txtPesquisaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPesquisaKeyPressed
        // Pesquisar clientes pressionando a tecla
        String nome = "%" + txtPesquisa.getText() + "%";

        FornecedoresDAO dao = new FornecedoresDAO();
        List<Fornecedores> lista = dao.buscaFornecedorPorNome(nome);
        // Cria o objeto que armazena os dados da tabela fornecedor.
        DefaultTableModel dados = (DefaultTableModel) tabelaFornecedor.getModel();
        // Contar quantas linhas ter?? dentro da tabela
        dados.setNumRows(0);
        // Adiciona linha para item da lista da tabela desejada.
        for (Fornecedores c : lista) {
            dados.addRow(new Object[]{
                c.getId(),
                c.getNome(),
                c.getCnpj(),
                c.getEmail(),
                c.getTelefone(),
                c.getCelular(),
                c.getCep(),
                c.getEndereco(),
                c.getNumero(),
                c.getComplemento(),
                c.getBairro(),
                c.getCidade(),
                c.getUf()
            });
    }//GEN-LAST:event_txtPesquisaKeyPressed
    }

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        // Bot??o busca dentro do  frame do cadastro de dados
        // Esse bot??o busca com o nome especifico.

        String nome = txt_Nome.getText();
        Fornecedores fornecedor = new Fornecedores();
        FornecedoresDAO dao = new FornecedoresDAO();

        fornecedor = dao.consultaFornecedorPorNome(nome);

        // Se cliente for diferente de nulo ele mostra
        if (fornecedor.getNome() != null) {
            //Exibir os dados do fornecedor dentro dos campos dos textos
            txt_Codigo.setText(String.valueOf(fornecedor.getId()));
            txt_Nome.setText(fornecedor.getNome());
            txt_CNPJ.setText(fornecedor.getRg());
            txt_Email.setText(fornecedor.getEmail());
            txt_TelefoneFixo.setText(fornecedor.getTelefone());
            txt_Celular.setText(fornecedor.getCelular());
            txt_CEP.setText(fornecedor.getCep());
            txt_Endereco.setText(fornecedor.getEndereco());
            txt_Numero.setText(String.valueOf(fornecedor.getNumero()));
            txt_Complemento.setText(fornecedor.getComplemento());
            txt_Bairro.setText(fornecedor.getBairro());
            txt_Cidade.setText(fornecedor.getBairro());
            cbx_UF.setSelectedItem(fornecedor.getUf());
            // Se n??o ele mostra mensagem fornecedor n??o encontrado.
        } else {
            JOptionPane.showMessageDialog(null, "Fornecedor n??o encontrado");
        }


    }//GEN-LAST:event_btnBuscarActionPerformed

    private void txt_CEPKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_CEPKeyPressed
        // Quando usuario pressionar tecla Enter ele busca o CEP
        //Programacao do keypress
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            Clientes cepCliente = new Clientes();
            ClientesDAO dao = new ClientesDAO();
            cepCliente = dao.buscaCep(txt_CEP.getText());

            txt_Endereco.setText(cepCliente.getEndereco());
            txt_Bairro.setText(cepCliente.getBairro());
            txt_Cidade.setText(cepCliente.getCidade());
            cbx_UF.setSelectedItem(cepCliente.getUf());
            System.out.println(cepCliente.getUf());

        }
    }//GEN-LAST:event_txt_CEPKeyPressed

    private void btn_ExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_ExcluirActionPerformed
        // Bot??o excluir
        Fornecedores fornecedor = new Fornecedores();

        //Exclui os dados pelo ID.
        fornecedor.setId(Integer.parseInt(txt_Codigo.getText()));

        FornecedoresDAO dao = new FornecedoresDAO();
        dao.excluirFornecedor(fornecedor);

        new Utilitarios().limparTela(panelDados);
    }//GEN-LAST:event_btn_ExcluirActionPerformed

    private void btn_SalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_SalvarActionPerformed
        // Bot??o salvar
        try {
            Fornecedores fornecedor = new Fornecedores();
            fornecedor.setNome(txt_Nome.getText());
            fornecedor.setCnpj(txt_CNPJ.getText());
            fornecedor.setEmail(txt_Email.getText());
            fornecedor.setTelefone(txt_TelefoneFixo.getText());
            fornecedor.setCelular(txt_Celular.getText());
            fornecedor.setCep(txt_CEP.getText());
            fornecedor.setEndereco(txt_Endereco.getText());
            fornecedor.setNumero(Integer.parseInt(txt_Numero.getText()));
            fornecedor.setComplemento(txt_Complemento.getText());
            fornecedor.setBairro(txt_Bairro.getText());
            fornecedor.setCidade(txt_Cidade.getText());
            fornecedor.setUf(cbx_UF.getSelectedItem().toString());

            FornecedoresDAO dao = new FornecedoresDAO();
            dao.cadastrarFornecedor(fornecedor);

            new Utilitarios().limparTela(panelDados);

        } catch (Exception erro) {
        }
    }//GEN-LAST:event_btn_SalvarActionPerformed

    private void btn_NovoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_NovoActionPerformed
        // Bot??o novo
        new Utilitarios().limparTela(panelDados);
    }//GEN-LAST:event_btn_NovoActionPerformed

    private void btn_EditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_EditarActionPerformed

        // Bot??o Editar
        Fornecedores fornecedor = new Fornecedores();
        fornecedor.setNome(txt_Nome.getText());
        fornecedor.setCnpj(txt_CNPJ.getText());
        fornecedor.setEmail(txt_Email.getText());
        fornecedor.setTelefone(txt_TelefoneFixo.getText());
        fornecedor.setCelular(txt_Celular.getText());
        fornecedor.setCep(txt_CEP.getText());
        fornecedor.setEndereco(txt_Endereco.getText());
        fornecedor.setNumero(Integer.parseInt(txt_Numero.getText()));
        fornecedor.setComplemento(txt_Complemento.getText());
        fornecedor.setBairro(txt_Bairro.getText());
        fornecedor.setCidade(txt_Cidade.getText());
        fornecedor.setUf(cbx_UF.getSelectedItem().toString());

        //Altera pelo ID chamando os atributos dele.
        fornecedor.setId(Integer.parseInt(txt_Codigo.getText()));

        FornecedoresDAO dao = new FornecedoresDAO();
        dao.alterarFornecedor(fornecedor);

        new Utilitarios().limparTela(panelDados);
    }//GEN-LAST:event_btn_EditarActionPerformed

    /**
     * @param the command line arguments
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
            java.util.logging.Logger.getLogger(frmFornecedor.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmFornecedor.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmFornecedor.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmFornecedor.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmFornecedor().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnPesquisar;
    private javax.swing.JButton btn_Editar;
    private javax.swing.JButton btn_Excluir;
    private javax.swing.JButton btn_Novo;
    private javax.swing.JButton btn_Salvar;
    private javax.swing.JComboBox<String> cbx_UF;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    public javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JPanel panelConsulta;
    private javax.swing.JPanel panelDados;
    public javax.swing.JTable tabelaFornecedor;
    private javax.swing.JTextField txtPesquisa;
    private javax.swing.JTextField txt_Bairro;
    private javax.swing.JFormattedTextField txt_CEP;
    private javax.swing.JFormattedTextField txt_CNPJ;
    private javax.swing.JFormattedTextField txt_Celular;
    private javax.swing.JTextField txt_Cidade;
    private javax.swing.JTextField txt_Codigo;
    private javax.swing.JTextField txt_Complemento;
    private javax.swing.JTextField txt_Email;
    private javax.swing.JTextField txt_Endereco;
    private javax.swing.JTextField txt_Nome;
    private javax.swing.JTextField txt_Numero;
    private javax.swing.JFormattedTextField txt_TelefoneFixo;
    // End of variables declaration//GEN-END:variables
}
