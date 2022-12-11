package br.com.projeto.dao;

import br.com.projeto.jdbc.ConnectionFactory;
import br.com.projeto.model.Clientes;
import br.com.projeto.model.Funcionario;
import br.com.projeto.view.frmFuncionario;
import br.com.projeto.view.frmLogin;
import br.com.projeto.view.frmMenu;
import br.com.projeto.view.frmVendas;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import static javax.swing.UIManager.getString;

public class FuncionariosDAO {
    //Conexão com banco de dados

    private Connection conexao;

    public FuncionariosDAO() {
        /**
         *
         * @description Manipular o banco de dados através desse método.
         */
        this.conexao = new ConnectionFactory().getConnection();
    }

    //Metodo buscar funcionário pelo nome e me retorna uma lista
    public List<Funcionario> listarFuncionarioPorNome(String nome) {

        try {
            //Criar a lista dos clientes
            List<Funcionario> lista = new ArrayList<>();

            //Comando sql select para encontrar pelo nome aproximado
            String sql = "select * from tb_funcionarios where nome like ?";
            PreparedStatement stmt = conexao.prepareStatement(sql);

            stmt.setString(1, nome);
            ResultSet rs = stmt.executeQuery();

            while (rs.next()) {
                Funcionario funcionario = new Funcionario();

                funcionario.setId(rs.getInt("id"));
                funcionario.setNome(rs.getString("nome"));
                funcionario.setRg(rs.getString("rg"));
                funcionario.setCpf(rs.getString("cpf"));
                funcionario.setEmail(rs.getString("email"));

                funcionario.setSenha(rs.getString("senha"));
                funcionario.setCargo(rs.getString("cargo"));
                funcionario.setNivelAcesso(rs.getString("nivel_acesso"));

                funcionario.setTelefone(rs.getString("telefone"));
                funcionario.setCelular(rs.getString("celular"));
                funcionario.setCep(rs.getString("cep"));
                funcionario.setEndereco(rs.getString("endereco"));
                funcionario.setNumero(rs.getInt("numero"));
                funcionario.setComplemento(rs.getString("complemento"));
                funcionario.setBairro(rs.getString("bairro"));
                funcionario.setCidade(rs.getString("cidade"));
                funcionario.setUf(rs.getString("estado"));

                //Retornar uma lista de clientes setados acima.
                lista.add(funcionario);
            }
            return lista;

        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, "Erro" + erro);
            return null;
        }

    }

    //Consultar funcionário pelo nome
    public Funcionario consultaPorNome(String nome) {
        try {
            //Comando para buscar pelo nome
            String sql = "select * from tb_funcionarios where nome = ?";
            PreparedStatement stmt = conexao.prepareStatement(sql);

            stmt.setString(1, nome);
            ResultSet rs = stmt.executeQuery();
            Funcionario funcionario = new Funcionario();
            if (rs.next()) {

                funcionario.setId(rs.getInt("id"));
                funcionario.setNome(rs.getString("nome"));
                funcionario.setRg(rs.getString("rg"));
                funcionario.setCpf(rs.getString("cpf"));
                funcionario.setEmail(rs.getString("email"));

                funcionario.setSenha(rs.getString("senha"));
                funcionario.setCargo(rs.getString("cargo"));
                funcionario.setNivelAcesso(rs.getString("nivel_acesso"));

                funcionario.setTelefone(rs.getString("telefone"));
                funcionario.setCelular(rs.getString("celular"));
                funcionario.setCep(rs.getString("cep"));
                funcionario.setEndereco(rs.getString("endereco"));
                funcionario.setNumero(rs.getInt("numero"));
                funcionario.setComplemento(rs.getString("complemento"));
                funcionario.setBairro(rs.getString("bairro"));
                funcionario.setCidade(rs.getString("cidade"));
                funcionario.setUf(rs.getString("estado"));

            }
            return funcionario;

        } catch (Exception e) {

            JOptionPane.showMessageDialog(null, "Funcionário não encontrado");
            return null;
        }
    }

    //Método cadastrar funcionário
    public void cadastrarFuncionario(Funcionario funcionario) {
        try {
            // Comando  de inserção sqlna tabela funcionarios.
            String sql = "insert into tb_funcionarios(nome,rg,cpf,email,senha,cargo,nivel_acesso,telefone,"
                    + "celular,endereco,cep,numero,complemento,bairro,cidade,estado)"
                    + "                   values (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
            // Conectar ao banco de dados e organizar o comando sql.
            PreparedStatement stmt = conexao.prepareStatement(sql);
            stmt.setString(1, funcionario.getNome());
            stmt.setString(2, funcionario.getRg());
            stmt.setString(3, funcionario.getCpf());
            stmt.setString(4, funcionario.getEmail());
            stmt.setString(5, funcionario.getSenha());
            stmt.setString(6, funcionario.getCargo());
            stmt.setString(7, funcionario.getNivelAcesso());
            stmt.setString(8, funcionario.getTelefone());
            stmt.setString(9, funcionario.getCelular());
            stmt.setString(10, funcionario.getEndereco());
            stmt.setString(11, funcionario.getCep());
            stmt.setInt(12, funcionario.getNumero());
            stmt.setString(13, funcionario.getComplemento());
            stmt.setString(14, funcionario.getBairro());
            stmt.setString(15, funcionario.getCidade());
            stmt.setString(16, funcionario.getUf());

            // Executar comando sql
            stmt.execute();
            // Fecha a conexão com banco de dados.
            stmt.close();

            JOptionPane.showMessageDialog(null, "Cadastrado com sucesso");

        } catch (SQLException erroSql) {
            JOptionPane.showMessageDialog(null, "Erro" + erroSql);
        }
    }

    //Método alterar funcionário
    public void alterarFuncionario(Funcionario funcionario) {
        try {
            // Comando  de inserção na tabela cliente pelo id.
            String sql = "update tb_funcionarios set nome=?,rg=?, cpf=?, email=?, senha=?, cargo=?"
                    + "   , nivel_acesso=?, telefone=?, celular=?, cep=?"
                    + "   , endereco=?, numero=?, complemento=?, bairro=?, cidade=?, estado=? where id = ?";

            PreparedStatement stmt = conexao.prepareStatement(sql);
            stmt.setString(1, funcionario.getNome());
            stmt.setString(2, funcionario.getRg());
            stmt.setString(3, funcionario.getCpf());
            stmt.setString(4, funcionario.getEmail());

            stmt.setString(5, funcionario.getSenha());
            stmt.setString(6, funcionario.getCargo());
            stmt.setString(7, funcionario.getNivelAcesso());

            stmt.setString(8, funcionario.getTelefone());
            stmt.setString(9, funcionario.getCelular());
            stmt.setString(10, funcionario.getCep());
            stmt.setString(11, funcionario.getEndereco());
            stmt.setInt(12, funcionario.getNumero());
            stmt.setString(13, funcionario.getComplemento());
            stmt.setString(14, funcionario.getBairro());
            stmt.setString(15, funcionario.getCidade());
            stmt.setString(16, funcionario.getUf());

            stmt.setInt(17, funcionario.getId());

            // Executar comando sql
            stmt.execute();
            // Fecha a conexão com banco de dados.
            stmt.close();

            JOptionPane.showMessageDialog(null, "Alterado dados do funcionário com sucesso");

        } catch (SQLException erroSql) {
            JOptionPane.showMessageDialog(null, "Erro" + erroSql);
        }
    }

    //Método excluir funcionário
    public void excluirFuncionario(Funcionario funcionario) {
        try {
            // Comando  de deletar na tabela cliente pelo id.
            String sql = "delete from tb_funcionarios where id = ?";
            // Conectar ao banco de dados e organizar o comando sql.
            PreparedStatement stmt = conexao.prepareStatement(sql);
            stmt.setInt(1, funcionario.getId());

            // Executar comando sql
            stmt.execute();
            // Fecha a conexão com banco de dados.
            stmt.close();

            JOptionPane.showMessageDialog(null, "Excluido dados do funcionário com sucesso");

        } catch (SQLException erroSql) {
            JOptionPane.showMessageDialog(null, "Erro" + erroSql);
        }
    }

    //Método p/ listar todos os funcionários
    public List<Funcionario> listarFuncionarios() {

        try {
            //Criar a lista dos clientes
            List<Funcionario> lista = new ArrayList<>();

            //Comando sql select
            String sql = "select * from tb_funcionarios";
            PreparedStatement stmt = conexao.prepareStatement(sql);

            //
            ResultSet rs = stmt.executeQuery();

            while (rs.next()) {
                Funcionario funcionario = new Funcionario();

                funcionario.setId(rs.getInt("id"));
                funcionario.setNome(rs.getString("nome"));
                funcionario.setRg(rs.getString("rg"));
                funcionario.setCpf(rs.getString("cpf"));
                funcionario.setEmail(rs.getString("email"));

                funcionario.setSenha(rs.getString("senha"));
                funcionario.setCargo(rs.getString("cargo"));
                funcionario.setNivelAcesso(rs.getString("nivel_acesso"));

                funcionario.setTelefone(rs.getString("telefone"));
                funcionario.setCelular(rs.getString("celular"));
                funcionario.setCep(rs.getString("cep"));
                funcionario.setEndereco(rs.getString("endereco"));
                funcionario.setNumero(rs.getInt("numero"));
                funcionario.setComplemento(rs.getString("complemento"));
                funcionario.setBairro(rs.getString("bairro"));
                funcionario.setCidade(rs.getString("cidade"));
                funcionario.setUf(rs.getString("estado"));

                //Retornar uma lista de funcionários setados acima.
                lista.add(funcionario);
            }
            return lista;

        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, "Erro" + erro);
            return null;
        }
    }

    //Método para efetuar login
    public void efetuarLogin(String email, String senha) {
        try {

            //Sql
            String sql = "select * from tb_funcionarios where email=? and senha=?";
            PreparedStatement stmt = conexao.prepareStatement(sql);

            //Organizar em cada ponto de interrogação.
            stmt.setString(1, email);
            stmt.setString(2, senha);

            ResultSet rs = stmt.executeQuery();

            if (rs.next()) {
                //Caso usuário seja administrador
                if (rs.getString("nivel_acesso").equals("Administrador")) {
                    
                    JOptionPane.showMessageDialog(null, "Seja bem vindo ao Sistema!");
                    frmMenu tela = new frmMenu();
                    
                    
                    tela.usuariologado = rs.getString("nome");
                    tela.usuarioCargo = rs.getString("cargo");
                    //Abrir tela menu principal
                    tela.setVisible(true);

                    //Caso usuario seja do tipo limitado a função
                } else if (rs.getString("nivel_acesso").equals("Usuário")) {
                    JOptionPane.showMessageDialog(null, "Seja bem vindo ao Sistema!");
                    frmMenu tela = new frmMenu();
                    tela.usuariologado = rs.getString("nome");
                    tela.usuarioCargo = rs.getString("cargo");
                    //Desabilitar função.
                    tela.telaPosicaoDia.setEnabled(false);
                    tela.telaHistoricoVendas.setEnabled(false);
                    tela.telaControleCliente.setEnabled(false);
                    tela.telaControleFornecedor.setEnabled(false);
                    tela.telaControleFuncionario.setEnabled(false);
                    
                    //Abrir tela menu principal
                    tela.setVisible(true);
                }

            } else {
                //Dados incorretos
                JOptionPane.showMessageDialog(null, "Dados incorretos, solicite suporte!");
                new frmLogin().setVisible(true);
            }

        } catch (SQLException erroSQL) {
            JOptionPane.showMessageDialog(null, "Erro Sql" + erroSQL);
        }
    }

}
