/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projeto09;

/**
 *
 * @author aluno
 */
public class Cliente {
    //Atributos que podem Private ou public(modificador)
    //Por definição no JAVA os atributos serão private
    private String RG;
    private String nome;
    private String cpf; 
    private String cidade; 
    private String estado; 
    //Métodos podem ser Public ou Private (modificador)
    //Por definição no Java ou métodos serão Public
    //construtores 
    //Vazio
    public Cliente(){
    
    }
    //Cheio
    public Cliente(String RG, String nome, String CPF, String cidade, String estado){
    this.RG = RG;
    this.nome = nome;
    this.cpf = cpf;
    this.cidade = cidade;
    this.estado = estado;
    }
    //GETTERS e SETTERS 

    public String getRG() {
        return this.RG;
    }

    public void setRG(String RG) {
        this.RG = RG;
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return this.cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getCidade() {
        return this.cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getEstado() {
        return this.estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }
    
    
}
