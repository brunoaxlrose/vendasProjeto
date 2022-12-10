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
import br.com.projeto.model.Clientes;
import br.com.projeto.model.Fornecedores;
import br.com.projeto.model.Produtos;
import br.com.projeto.model.Vendas;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
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
            //JOptionPane.showMessageDialog(null, "Chegamos aqui fim da venda");
            // Executar comando sql
            stmt.execute();
            // Fecha a conexão com banco de dados.
            stmt.close();


        } catch (SQLException erroSql) {
            //throw new RuntimeException(erroSql);

            JOptionPane.showMessageDialog(null, "Erro111" + erroSql);
        }
    }

    //Método para retornar a última venda
    public int retornarUltimaVenda() {
        try {

            int idvenda = 0;
            
            //Função para selecionar e retornar o maior id da tabela (no caso a última venda realizada)
// tem um erro no sql max(id) id
            String sql = "select max(id) as id from tb_vendas";
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
    
    //Método para buscar venda pela data
    public List<Vendas> listarVendasPorPeriodo(LocalDate data_inicio, LocalDate data_final) {

        try {
            //Criar a lista das vendas
            List<Vendas> lista = new ArrayList<>();

            //Comando sql select
            String sql = "select v.id , date_format(v.data_venda, '%d/%m/%Y')as data_formatada      , c.nome, v.total_venda, v.observacoes from tb_vendas as v "
                    +    " inner join tb_clientes as c on(v.cliente_id = c.id) where v.data_venda BETWEEN? AND?";
            PreparedStatement stmt = conexao.prepareStatement(sql);
            stmt.setString(1, data_inicio.toString());
            stmt.setString(2, data_final.toString());
            //
            ResultSet rs = stmt.executeQuery();

            while (rs.next()) {
                Vendas venda = new Vendas();
                Clientes c = new Clientes();
                
                
                venda.setId(rs.getInt("v.id"));
                venda.setData_venda(rs.getString("data_formatada"));
                c.setNome(rs.getString("c.nome"));
                venda.setTotal_venda(rs.getDouble("v.total_venda"));
                venda.setObs(rs.getString("v.observacoes"));
                
                venda.setCliente(c);
                
                lista.add(venda);
            }
            return lista;

        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, "Erro" + erro);
            return null;
        }            
    }

}
