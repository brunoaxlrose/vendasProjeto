package br.com.projeto.model;

//Herança da classe Clientes "extends"
public class Funcionario extends Clientes{
    //Atributos 
    private String senha;
    private String cargo;
    private String nivelAcesso;

    
    // Getters e Setters
    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public String getNivelAcesso() {
        return nivelAcesso;
    }

    public void setNivelAcesso(String nivelAcesso) {
        this.nivelAcesso = nivelAcesso;
    }
    
    
}
