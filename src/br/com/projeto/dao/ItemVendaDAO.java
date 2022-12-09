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
package br.com.projeto.dao;

import br.com.projeto.jdbc.ConnectionFactory;
import br.com.projeto.model.ItemVendas;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author bruno
 */
public class ItemVendaDAO {
        private Connection conexao;

    public ItemVendaDAO() {

        this.conexao = new ConnectionFactory().getConnection();
    }
    
    //Método para cadastrar os itens
    public void cadastrarItem(ItemVendas vendaItem){
                try {
            // Comando  de inserção sqlna tabela de itensVenda.
            String sql = "insert into tb_itensvendas(venda_id, produto_id, qtd, subtotal)"
                    + "                   values (?,?,?,?)";
            // Conectar ao banco de dados e organizar o comando sql.
            PreparedStatement stmt = conexao.prepareStatement(sql);
            stmt.setInt(1, vendaItem.getVenda().getId());
            stmt.setInt(2, vendaItem.getProduto().getId());
            stmt.setInt(3, vendaItem.getQtd());
            stmt.setDouble(4, vendaItem.getSubtotal());

            // Executar comando sql
            stmt.execute();
            // Fecha a conexão com banco de dados.
            stmt.close();

            

        } catch (SQLException erroSql) {
            JOptionPane.showMessageDialog(null, "Erro" + erroSql);
        }
    }
}
