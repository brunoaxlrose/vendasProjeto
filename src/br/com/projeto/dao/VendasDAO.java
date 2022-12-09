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
import br.com.projeto.model.Vendas;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author bruno
 */
public class VendasDAO {

    private Connection conexao;

    public VendasDAO() {
        //Manipular o banco de dados através desse método.
        this.conexao = new ConnectionFactory().getConnection();
    }

    //Método para cadastrar as vendas
    public void cadastrarVenda(Vendas venda) {
        try {
            // Comando  de inserção sqlna tabela de vendas.
            String sql = "insert into tb_vendas(cliente_id, data_venda, total_venda, observacoes)"
                    + "                   values (?,?,?,?)";
            // Conectar ao banco de dados e organizar o comando sql.
            PreparedStatement stmt = conexao.prepareStatement(sql);
            stmt.setInt(1, venda.getCliente().getId());
            stmt.setString(2, venda.getData_venda());
            stmt.setDouble(3, venda.getTotal_venda());
            stmt.setString(4, venda.getObs());

            // Executar comando sql
            stmt.execute();
            // Fecha a conexão com banco de dados.
            stmt.close();

            JOptionPane.showMessageDialog(null, "Venda registrada com sucesso");

        } catch (SQLException erroSql) {
            throw new RuntimeException(erroSql);
            //JOptionPane.showMessageDialog(null, "Erro" + erroSql);
        }
    }

    //Método para retornar a última venda
    public int retornarUltimaVenda() {
        try {
            int idvenda = 0;
            
            //Função para selecionar e retornar o maior id da tabela (no caso a última venda realizada)
            String sql = "select max(id) id from vendas";
            PreparedStatement ps = conexao.prepareStatement(sql);

            //Verificar se existe o objeto
            ResultSet rs = ps.executeQuery();

            if (rs.next()) {
                Vendas p = new Vendas();

                p.setId(rs.getInt("id"));

                idvenda = p.getId();
            }
            return idvenda;
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

}
