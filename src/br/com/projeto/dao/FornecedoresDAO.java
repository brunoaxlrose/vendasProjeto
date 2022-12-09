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
public class FornecedoresDAO {
     
    private Connection conexao;

    public FornecedoresDAO() {
        //Manipular o banco de dados através desse método.
        this.conexao = new ConnectionFactory().getConnection();
    }
    
     //Método p/ cadastrar  fornecedores
    public void cadastrarFornecedor(Fornecedores fornecedor) {
        try {
            // Comando  de inserção sqlna tabela fornecedores.
            String sql = "insert into tb_fornecedores(nome,cnpj,email,telefone,celular,endereco,cep,numero,complemento,bairro,cidade,estado)"
                    + "                   values (?,?,?,?,?,?,?,?,?,?,?,?)";
            // Conectar ao banco de dados e organizar o comando sql.
            PreparedStatement stmt = conexao.prepareStatement(sql);
            stmt.setString(1, fornecedor.getNome());
            stmt.setString(2, fornecedor.getCnpj());
            stmt.setString(3, fornecedor.getEmail());
            stmt.setString(4, fornecedor.getTelefone());
            stmt.setString(5, fornecedor.getCelular());
            stmt.setString(6, fornecedor.getEndereco());
            stmt.setString(7, fornecedor.getCep());
            stmt.setInt(8, fornecedor.getNumero());
            stmt.setString(9, fornecedor.getComplemento());
            stmt.setString(10, fornecedor.getBairro());
            stmt.setString(11, fornecedor.getCidade());
            stmt.setString(12, fornecedor.getUf());

            // Executar comando sql
            stmt.execute();
            // Fecha a conexão com banco de dados.
            stmt.close();

            JOptionPane.showMessageDialog(null, "Fornecedor cadastrado com sucesso");

        } catch (SQLException erroSql) {
            JOptionPane.showMessageDialog(null, "Erro" + erroSql);
        }
    }
    
    //Método para alterar dados do fornecedor.
    public void alterarFornecedor(Fornecedores fornecedor) {
        try {
            // Comando  de inserção na tabela fornecedor pelo id.
            String sql = "update tb_fornecedores set nome=?,cnpj=?, email=?, telefone=?, celular=?, cep=?"
                    + "   , endereco=?, numero=?, complemento=?, bairro=?, cidade=?, estado=? where id = ?";
               

            PreparedStatement stmt = conexao.prepareStatement(sql);
            stmt.setString(1, fornecedor.getNome());
            stmt.setString(2, fornecedor.getCnpj());
            stmt.setString(3, fornecedor.getEmail());
            stmt.setString(4, fornecedor.getTelefone());
            stmt.setString(5, fornecedor.getCelular());
            stmt.setString(6, fornecedor.getCep());
            stmt.setString(7, fornecedor.getEndereco());
            stmt.setInt(8, fornecedor.getNumero());
            stmt.setString(9, fornecedor.getComplemento());
            stmt.setString(10, fornecedor.getBairro());
            stmt.setString(11, fornecedor.getCidade());
            stmt.setString(12, fornecedor.getUf());
            
            stmt.setInt(13, fornecedor.getId());

            // Executar comando sql
            stmt.execute();
            // Fecha a conexão com banco de dados.
            stmt.close();

            JOptionPane.showMessageDialog(null, "Alterado dados do fornecedor com sucesso");

        } catch (SQLException erroSql) {
            JOptionPane.showMessageDialog(null, "Erro" + erroSql);
        }

    }
    
    //Método p/ excluir fornecedor
    public void excluirFornecedor(Fornecedores fornecedor) {
        try {
            // Comando  de deletar na tabela fornecedor pelo id.
            String sql = "delete from tb_fornecedores where id = ?";
            // Conectar ao banco de dados e organizar o comando sql.
            PreparedStatement stmt = conexao.prepareStatement(sql);
            stmt.setInt(1, fornecedor.getId());

            // Executar comando sql
            stmt.execute();
            // Fecha a conexão com banco de dados.
            stmt.close();

            JOptionPane.showMessageDialog(null, "Excluido dados do fornecedor com sucesso");

        } catch (SQLException erroSql) {
            JOptionPane.showMessageDialog(null, "Erro" + erroSql);
        }
    }
    
    //Método p/ listar todos os fornecedores
    public List<Fornecedores> listarFornecedores() {

        try {
            //Criar a lista dos fornecedores
            List<Fornecedores> lista = new ArrayList<>();

            //Comando sql select
            String sql = "select * from tb_fornecedores";
            PreparedStatement stmt = conexao.prepareStatement(sql);

            //
            ResultSet rs = stmt.executeQuery();

            while (rs.next()) {
                Fornecedores fornecedor = new Fornecedores();

                fornecedor.setId(rs.getInt("id"));
                fornecedor.setNome(rs.getString("nome"));
                fornecedor.setCnpj(rs.getString("cnpj"));
                fornecedor.setEmail(rs.getString("email"));
                fornecedor.setTelefone(rs.getString("telefone"));
                fornecedor.setCelular(rs.getString("celular"));
                fornecedor.setCep(rs.getString("cep"));
                fornecedor.setEndereco(rs.getString("endereco"));
                fornecedor.setNumero(rs.getInt("numero"));
                fornecedor.setComplemento(rs.getString("complemento"));
                fornecedor.setBairro(rs.getString("bairro"));
                fornecedor.setCidade(rs.getString("cidade"));
                fornecedor.setUf(rs.getString("estado"));

                //Retornar uma lista de clientes setados acima.
                lista.add(fornecedor);
            }
            return lista;

        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, "Erro" + erro);
            return null;
        }         
    }
    
    //Metodo buscar fornecedor pelo nome e me retorna uma lista
        public List<Fornecedores> buscaFornecedorPorNome(String nome) {

        try {
            //Criar a lista dos fornecedores
            List<Fornecedores> lista = new ArrayList<>();

            //Comando sql select para encontrar pelo nome aproximado
            String sql = "select * from tb_fornecedores where nome like ?";
            PreparedStatement stmt = conexao.prepareStatement(sql);

            stmt.setString(1, nome);
            ResultSet rs = stmt.executeQuery();

            while (rs.next()) {
                Fornecedores fornecedor = new Fornecedores();

                fornecedor.setId(rs.getInt("id"));
                fornecedor.setNome(rs.getString("nome"));
                fornecedor.setCnpj(rs.getString("cnpj"));
                fornecedor.setEmail(rs.getString("email"));
                fornecedor.setTelefone(rs.getString("telefone"));
                fornecedor.setCelular(rs.getString("celular"));
                fornecedor.setCep(rs.getString("cep"));
                fornecedor.setEndereco(rs.getString("endereco"));
                fornecedor.setNumero(rs.getInt("numero"));
                fornecedor.setComplemento(rs.getString("complemento"));
                fornecedor.setBairro(rs.getString("bairro"));
                fornecedor.setCidade(rs.getString("cidade"));
                fornecedor.setUf(rs.getString("estado"));

                //Retornar uma lista de clientes setados acima.
                lista.add(fornecedor);
            }
            return lista;

        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, "Erro" + erro);
            return null;
        }              
    }
        
        // MEtodo para consultaFornecedor por nome
        public Fornecedores consultaFornecedorPorNome(String nome)
        {
            try {
                 //Comando para buscar pelo nome
            String sql = "select * from tb_fornecedores where nome = ?";
            PreparedStatement stmt = conexao.prepareStatement(sql);
            
            stmt.setString(1, nome);
            ResultSet rs = stmt.executeQuery();
            Fornecedores fornecedor = new Fornecedores();
            if (rs.next()) {

                fornecedor.setId(rs.getInt("id"));
                fornecedor.setNome(rs.getString("nome"));
                fornecedor.setCnpj(rs.getString("cnpj"));
                fornecedor.setEmail(rs.getString("email"));
                fornecedor.setTelefone(rs.getString("telefone"));
                fornecedor.setCelular(rs.getString("celular"));
                fornecedor.setCep(rs.getString("cep"));
                fornecedor.setEndereco(rs.getString("endereco"));
                fornecedor.setNumero(rs.getInt("numero"));
                fornecedor.setComplemento(rs.getString("complemento"));
                fornecedor.setBairro(rs.getString("bairro"));
                fornecedor.setCidade(rs.getString("cidade"));
                fornecedor.setUf(rs.getString("estado"));

            }
                return fornecedor;
                
                
            } catch (Exception e) {
                
                JOptionPane.showMessageDialog(null, "Fornecedor não encontrado");
                return null;
            }           

        }
        
        
}
