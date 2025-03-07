/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package projetoLogin;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author ALEXANDRELEMOSALVESF
 */
public class ConexaoSQL {
     //Método para conectar ao banco de dados 
    public static Connection conectar(){
    Connection conexao = null; //Declara uma variavel para armazenar a conexao
    String url = "jdbc:sqlite:usuariosNovos.db"; //Define o camiho do banco de dados SQLite
    try{
    //Tenta estabelecer a conexão com o banco de dados usando a URL fornecida
    conexao = DriverManager.getConnection(url);
    System.out.println("Conexão com SQLite estabelecida!");//Mensagem de sucesso 
    }catch(SQLException e){
    //Caso ocorra um erro, ele será capturado e exibido
    System.out.println("Erro ao conectar ao banco:" + e.getMessage());
    }
    return conexao; //Retorna a conexão estabelecida(ou null se falhou)
    }
    
    //Método para fechar a conexão com o banco de dados 
    public static void desconectar (Connection conexao){
    
    }
}
