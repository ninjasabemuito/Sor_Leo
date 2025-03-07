/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package projetoLogin;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author ALEXANDRELEMOSALVESF
 */
public class ProcurarUsuario {
 public boolean procurarUsuario(Connection conexao, Usuario usuario) {
    String sql = "SELECT * FROM usuarios WHERE nome = ?";
    try (PreparedStatement stmt = conexao.prepareStatement(sql)){
        stmt.setString(1, usuario.getNome());
        ResultSet rs = stmt.executeQuery(sql);
        
        if(rs.next()){
            usuario.setId(rs.getInt("id"));
            usuario.setNome(rs.getString("nome"));
            usuario.setSenha(rs.getString("senha"));
        
            return true;
        }
    } catch(SQLException e){
        System.out.println("Erro ao inserir usuario" + e.getMessage());
    }
    
    return false;
 }
}