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
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author bruno
 */
public class ProdutosDAO {
    
        private Connection conexao;

    public ProdutosDAO() {
        //Manipular o banco de dados através desse método.
        this.conexao = new ConnectionFactory().getConnection();
    }
    
    //Método p/ cadastrar  produtos
    public void cadastrarProduto(Produtos produto) {
        try {
            // Comando  de inserção sqlna tabela produtos.
            String sql = "insert into tb_produtos(descricao, preco, qtd_estoque, for_id)"
                    + "                   values (?,?,?,?);";
            // Conectar ao banco de dados e organizar o comando sql.
            PreparedStatement stmt = conexao.prepareStatement(sql);
            stmt.setString(1, produto.getDescricao());
            stmt.setDouble(2, produto.getPreco());
            stmt.setInt(3, produto.getQtd_estoque());
            //Pegar do objeto Fornecedor o ID dele. 
            stmt.setInt(4, produto.getFornecedor().getId());

            // Executar comando sql
            stmt.execute();
            // Fecha a conexão com banco de dados.
            stmt.close();

            JOptionPane.showMessageDialog(null, "Produto cadastrado com sucesso");

        } catch (SQLException erroSql) {
            JOptionPane.showMessageDialog(null, "Erro" + erroSql);
        }
    }
    
    //Método para alterar dados do produto.
    public void alterarProduto(Produtos produto) {
        try {
            // Comando  de inserção na tabela produto pelo id.
            String sql = "update tb_produtos set descricao=?, preco=?, qtd_estoque=?, for_id=? where id = ?";
               
            PreparedStatement stmt = conexao.prepareStatement(sql);
            stmt.setString(1, produto.getDescricao());
            stmt.setDouble(2, produto.getPreco());
            stmt.setInt(3, produto.getQtd_estoque());
            //Pegar do objeto Fornecedor o ID dele. (Chave estrangeira)
            stmt.setInt(4, produto.getFornecedor().getId());
            
            stmt.setInt(5, produto.getId());
            
            //stmt.setInt(13, produto.getId());

            // Executar comando sql
            stmt.execute();
            // Fecha a conexão com banco de dados.
            stmt.close();

            JOptionPane.showMessageDialog(null, "Alterado dados do produto com sucesso");

        } catch (SQLException erroSql) {
            JOptionPane.showMessageDialog(null, "Erro" + erroSql);
        }

    }
    
        //Método p/ excluir produto
    public void excluirProduto(Produtos produto) {
        try {
            // Comando  de deletar na tabela produto pelo id.
            String sql = "delete from tb_produtos where id = ?";
            // Conectar ao banco de dados e organizar o comando sql.
            PreparedStatement stmt = conexao.prepareStatement(sql);
            stmt.setInt(1, produto.getId());

            // Executar comando sql
            stmt.execute();
            // Fecha a conexão com banco de dados.
            stmt.close();

            JOptionPane.showMessageDialog(null, "Produto excluído com sucesso");

        } catch (SQLException erroSql) {
            JOptionPane.showMessageDialog(null, "Erro" + erroSql);
        }
    }
    
    //Método p/ listar todos os produtos
    public List<Produtos> listarProdutos() {

        try {
            //Criar a lista dos produtos
            List<Produtos> lista = new ArrayList<>();

            //Comando sql select
            String sql = "select p.id, p.descricao, p.preco, p.qtd_estoque, f.nome from tb_produtos as p "
                    +"inner join tb_fornecedores as f on (p.for_id = f.id)";
            PreparedStatement stmt = conexao.prepareStatement(sql);

            //
            ResultSet rs = stmt.executeQuery();

            while (rs.next()) {
                Produtos produto = new Produtos();
                Fornecedores fornecedor = new Fornecedores();
                
                
                produto.setId(rs.getInt("p.id"));                          
                produto.setDescricao(rs.getString("p.descricao"));
                produto.setPreco(rs.getDouble("p.preco"));
                produto.setQtd_estoque(rs.getInt("p.qtd_estoque"));
                
                fornecedor.setNome(rs.getString("f.nome"));
                
                produto.setFornecedor(fornecedor);
                //Retornar uma lista de produto.
                lista.add(produto);
            }
            return lista;

        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, "Erro" + erro);
            return null;
        }            
    }
    
    //Metodo buscar produto pelo nome e me retorna uma lista
        public List<Produtos> buscaProdutoPorNome(String nome) {

        try {
            //Criar a lista dos produtos
            List<Produtos> lista = new ArrayList<>();

            //Comando sql select para encontrar pela descricao aproximado
            String sql = "select p.id, p.descricao, p.preco, p.qtd_estoque, f.nome from tb_produtos as p " 
                   +     "inner join tb_fornecedores as f on (p.for_id = f.id) where p.descricao like ?";
            PreparedStatement stmt = conexao.prepareStatement(sql);

            stmt.setString(1, nome);
            
            ResultSet rs = stmt.executeQuery();

            while (rs.next()) {
                Produtos produto = new Produtos();
                Fornecedores fornecedor = new Fornecedores();

                produto.setId(rs.getInt("p.id"));
                produto.setDescricao(rs.getString("p.descricao"));
                produto.setPreco(rs.getDouble("p.preco"));
                produto.setQtd_estoque(rs.getInt("p.qtd_estoque"));
                
                fornecedor.setNome(rs.getString("f.nome"));
                
                produto.setFornecedor(fornecedor);

                //Retornar uma lista de produto setados acima.
                lista.add(produto);
            }
            return lista;

        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, "Erro" + erro);
            return null;
        }              
    }
        

}
