package br.com.projeto.dao;

import br.com.projeto.jdbc.ConnectionFactory;
import br.com.projeto.model.Clientes;
import br.com.projeto.model.WebServiceCep;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

public class ClientesDAO {

    private Connection conexao;

    public ClientesDAO() {
        //Manipular o banco de dados através desse método.
        this.conexao = new ConnectionFactory().getConnection();
    }

    //Método p/ cadastrar  cliente
    public void cadastrarCliente(Clientes cliente) {
        try {
            // Comando  de inserção sqlna tabela clientes.
            String sql = "insert into tb_clientes(nome,rg,cpf,email,telefone,celular,endereco,cep,numero,complemento,bairro,cidade,estado)"
                    + "                   values (?,?,?,?,?,?,?,?,?,?,?,?,?);";
            // Conectar ao banco de dados e organizar o comando sql.
            PreparedStatement stmt = conexao.prepareStatement(sql);
            stmt.setString(1, cliente.getNome());
            stmt.setString(2, cliente.getRg());
            stmt.setString(3, cliente.getCpf());
            stmt.setString(4, cliente.getEmail());
            stmt.setString(5, cliente.getTelefone());
            stmt.setString(6, cliente.getCelular());
            stmt.setString(7, cliente.getEndereco());
            stmt.setString(8, cliente.getCep());
            stmt.setInt(9, cliente.getNumero());
            stmt.setString(10, cliente.getComplemento());
            stmt.setString(11, cliente.getBairro());
            stmt.setString(12, cliente.getCidade());
            stmt.setString(13, cliente.getUf());

            // Executar comando sql
            stmt.execute();
            // Fecha a conexão com banco de dados.
            stmt.close();

            JOptionPane.showMessageDialog(null, "Cadastrado com sucesso");

        } catch (SQLException erroSql) {
            JOptionPane.showMessageDialog(null, "Erro" + erroSql);
        }
    }
    //Método p/ alterar cliente

    public void alterarCliente(Clientes cliente) {
        try {
            // Comando  de inserção na tabela cliente pelo id.
            String sql = "update tb_clientes set nome=?,rg=?, cpf=?, email=?, telefone=?, celular=?, cep=?"
                    + "   , endereco=?, numero=?, complemento=?, bairro=?, cidade=?, estado=? where id = ?";
               

            PreparedStatement stmt = conexao.prepareStatement(sql);
            stmt.setString(1, cliente.getNome());
            stmt.setString(2, cliente.getRg());
            stmt.setString(3, cliente.getCpf());
            stmt.setString(4, cliente.getEmail());
            stmt.setString(5, cliente.getTelefone());
            stmt.setString(6, cliente.getCelular());
            stmt.setString(7, cliente.getCep());
            stmt.setString(8, cliente.getEndereco());
            stmt.setInt(9, cliente.getNumero());
            stmt.setString(10, cliente.getComplemento());
            stmt.setString(11, cliente.getBairro());
            stmt.setString(12, cliente.getCidade());
            stmt.setString(13, cliente.getUf());
            
            stmt.setInt(14, cliente.getId());

            // Executar comando sql
            stmt.execute();
            // Fecha a conexão com banco de dados.
            stmt.close();

            JOptionPane.showMessageDialog(null, "Alterado dados do cliente com sucesso");

        } catch (SQLException erroSql) {
            JOptionPane.showMessageDialog(null, "Erro" + erroSql);
        }

    }
    //Método p/ excluir cliente
    public void excluirCliente(Clientes cliente) {
        try {
            // Comando  de deletar na tabela cliente pelo id.
            String sql = "delete from tb_clientes where id = ?";
            // Conectar ao banco de dados e organizar o comando sql.
            PreparedStatement stmt = conexao.prepareStatement(sql);
            stmt.setInt(1, cliente.getId());

            // Executar comando sql
            stmt.execute();
            // Fecha a conexão com banco de dados.
            stmt.close();

            JOptionPane.showMessageDialog(null, "Excluido dados do cliente com sucesso");

        } catch (SQLException erroSql) {
            JOptionPane.showMessageDialog(null, "Erro" + erroSql);
        }
    }

    //Método p/ listar todos os cliente
    public List<Clientes> listarClientes() {

        try {
            //Criar a lista dos clientes
            List<Clientes> lista = new ArrayList<>();

            //Comando sql select
            String sql = "select * from tb_clientes";
            PreparedStatement stmt = conexao.prepareStatement(sql);

            //
            ResultSet rs = stmt.executeQuery();

            while (rs.next()) {
                Clientes cliente = new Clientes();

                cliente.setId(rs.getInt("id"));
                cliente.setNome(rs.getString("nome"));
                cliente.setRg(rs.getString("rg"));
                cliente.setCpf(rs.getString("cpf"));
                cliente.setEmail(rs.getString("email"));
                cliente.setTelefone(rs.getString("telefone"));
                cliente.setCelular(rs.getString("celular"));
                cliente.setCep(rs.getString("cep"));
                cliente.setEndereco(rs.getString("endereco"));
                cliente.setNumero(rs.getInt("numero"));
                cliente.setComplemento(rs.getString("complemento"));
                cliente.setBairro(rs.getString("bairro"));
                cliente.setCidade(rs.getString("cidade"));
                cliente.setUf(rs.getString("estado"));

                //Retornar uma lista de clientes setados acima.
                lista.add(cliente);
            }
            return lista;

        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, "Erro" + erro);
            return null;
        }
        
        

    }
    
    //Metodo buscar cliente pelo nome e me retorna uma lista
        public List<Clientes> buscaClientePorNome(String nome) {

        try {
            //Criar a lista dos clientes
            List<Clientes> lista = new ArrayList<>();

            //Comando sql select para encontrar pelo nome aproximado
            String sql = "select * from tb_clientes where nome like ?";
            PreparedStatement stmt = conexao.prepareStatement(sql);

            stmt.setString(1, nome);
            ResultSet rs = stmt.executeQuery();

            while (rs.next()) {
                Clientes cliente = new Clientes();

                cliente.setId(rs.getInt("id"));
                cliente.setNome(rs.getString("nome"));
                cliente.setRg(rs.getString("rg"));
                cliente.setCpf(rs.getString("cpf"));
                cliente.setEmail(rs.getString("email"));
                cliente.setTelefone(rs.getString("telefone"));
                cliente.setCelular(rs.getString("celular"));
                cliente.setCep(rs.getString("cep"));
                cliente.setEndereco(rs.getString("endereco"));
                cliente.setNumero(rs.getInt("numero"));
                cliente.setComplemento(rs.getString("complemento"));
                cliente.setBairro(rs.getString("bairro"));
                cliente.setCidade(rs.getString("cidade"));
                cliente.setUf(rs.getString("estado"));

                //Retornar uma lista de clientes setados acima.
                lista.add(cliente);
            }
            return lista;

        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, "Erro" + erro);
            return null;
        }
        
        

    }
        // MEtodo para consultaCliente por nome
        public Clientes consultaClientePorNome(String nome)
        {
            try {
                 //Comando para buscar pelo nome
            String sql = "select * from tb_clientes where nome = ?";
            PreparedStatement stmt = conexao.prepareStatement(sql);
            
            stmt.setString(1, nome);
            ResultSet rs = stmt.executeQuery();
            Clientes cliente = new Clientes();
            if (rs.next()) {

                cliente.setId(rs.getInt("id"));
                cliente.setNome(rs.getString("nome"));
                cliente.setRg(rs.getString("rg"));
                cliente.setCpf(rs.getString("cpf"));
                cliente.setEmail(rs.getString("email"));
                cliente.setTelefone(rs.getString("telefone"));
                cliente.setCelular(rs.getString("celular"));
                cliente.setCep(rs.getString("cep"));
                cliente.setEndereco(rs.getString("endereco"));
                cliente.setNumero(rs.getInt("numero"));
                cliente.setComplemento(rs.getString("complemento"));
                cliente.setBairro(rs.getString("bairro"));
                cliente.setCidade(rs.getString("cidade"));
                cliente.setUf(rs.getString("estado"));

            }
                return cliente;
                
                
            } catch (Exception e) {
                
                JOptionPane.showMessageDialog(null, "Cliente não encontrado");
                return null;
            }
        }
        
          // MEtodo para consultaCliente pelo cpf
        public Clientes consultaClientePorCpf(String cpf)
        {
            try {
                 //Comando para buscar pelo nome
            String sql = "select * from tb_clientes where cpf = ?";
            PreparedStatement stmt = conexao.prepareStatement(sql);
            
            stmt.setString(1, cpf);
            ResultSet rs = stmt.executeQuery();
            Clientes cliente = new Clientes();
            if (rs.next()) {

                cliente.setId(rs.getInt("id"));
                cliente.setNome(rs.getString("nome"));
                cliente.setRg(rs.getString("rg"));
                cliente.setCpf(rs.getString("cpf"));
                cliente.setEmail(rs.getString("email"));
                cliente.setTelefone(rs.getString("telefone"));
                cliente.setCelular(rs.getString("celular"));
                cliente.setCep(rs.getString("cep"));
                cliente.setEndereco(rs.getString("endereco"));
                cliente.setNumero(rs.getInt("numero"));
                cliente.setComplemento(rs.getString("complemento"));
                cliente.setBairro(rs.getString("bairro"));
                cliente.setCidade(rs.getString("cidade"));
                cliente.setUf(rs.getString("estado"));

            }
                return cliente;
                
                
            } catch (Exception e) {
                
                JOptionPane.showMessageDialog(null, "Cliente não encontrado");
                return null;
            }
        }
        
        //Busca CEP 
        public Clientes buscaCep(String cep) {
       
        WebServiceCep webServiceCep = WebServiceCep.searchCep(cep);
       

        Clientes cepCliente = new Clientes();

        if (webServiceCep.wasSuccessful()) {
            cepCliente.setEndereco(webServiceCep.getLogradouroFull());
            cepCliente.setCidade(webServiceCep.getCidade());
            cepCliente.setBairro(webServiceCep.getBairro());
            cepCliente.setUf(webServiceCep.getUf());
            return cepCliente;
        } else {
            JOptionPane.showMessageDialog(null, "Erro numero: " + webServiceCep.getResulCode());
            JOptionPane.showMessageDialog(null, "Descrição do erro: " + webServiceCep.getResultText());
            return null;
        }

    }
        
}
