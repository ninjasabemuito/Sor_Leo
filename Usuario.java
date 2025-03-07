/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package projetoLogin;

/**
 *
 * @author ALEXANDRELEMOSALVESF
 */
public class Usuario {
    String nome;
    String senha;
    int id;
    
    public Usuario(String nome, String senha){
        this.nome = nome;
        this.senha = senha;
    }
    public String getNome(){
        return nome;
    }
    public String getSenha(){
    return senha;
    }
    public int getId(int id){
    return id;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public void setSenha(String senha){
        this.senha = senha;
    }
    public void setId(int id){
        this.id = id;
    }
}
