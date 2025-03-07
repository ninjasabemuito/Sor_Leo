/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package projetoLogin;

import java.sql.Connection;
import java.sql.PreparedStatement;

/**
 *
 * @author ALEXANDRELEMOSALVESF
 */
public class InserirUsuario {
    public static boolean inserirUsuario(Connection conexao, Usuario usr){
    //A string contém o comando SQL que será executado no banco de dados.
    //O comando INSERT INTO vai inserir um novo  registro na tabela "usuarios" com os valores de "nome" e "email".
String sql = "INSERT INTO  usuarios (nome, senha) VALUES(?, ?)";

//O bloco try é ultilizado para garantir que o recurso (PreparedStatement)
//Seja fexhadi automaticamente após o uso.
try(PreparedStatement pstmt = conexao.prepareStatement(sql)){
// O método setString substitui os "?" no comando SQL pelos valores passados como parâmetros para o método.
//O primeiro parâmetro é a posição do "?", e o segundo é o valor a ser atribuido.
pstmt.setString(1,usr.getNome());//Substitui o primeiro? por 'nome'
pstmt.setString(2, usr.getSenha());//Substitui o segundo '?' por 'email'

//O método executeUpdate executa o comando SQL no banco de dados.
//No caso, ele insere o usuário na tabela.
pstmt.executeUpdate();

System.out.println("Usuários inseridos com sucesso");
return true;

}catch(Exception e){
System.out.println("Erro ao inserir usuario" + e.getMessage());
}
return false;
    }
}
