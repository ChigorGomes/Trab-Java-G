/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ClassesDAO;

import ConexaoBancoDeDados.BancoDeDados;
import classes.Usuario;
import java.sql.*;
import javax.swing.JOptionPane;

/**
 *
 * @author marcos
 */
public class UsuarioDAO extends BancoDeDados {

    public UsuarioDAO() {
        BancoDeDados.conecta();
    }

    public boolean salvarusuario(Usuario usuario) {
        try {
            Statement st = conexao.createStatement();
            ResultSet resultado = st.executeQuery("SELECT * FROM usuario WHERE login='" + usuario.getLogin() + "'");

            if (resultado.first() == true) {
                JOptionPane.showMessageDialog(null, "Usuário já existente no sistema!");
                return false;

            } else {
                st.executeUpdate("INSERT INTO usuario VALUES(NULL, '" + usuario.getLogin() + "' , '" + usuario.getSenha() + "')");
                JOptionPane.showMessageDialog(null, "Cadastro realizado com sucesso!");

                return true;
            }

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao inserir dados" + ex);
            return false;
        }

    }

    public boolean acessar(Usuario usu) {
        try {
            Statement st = conexao.createStatement();
            ResultSet resultado = st.executeQuery("SELECT * FROM usuario WHERE login= '" + usu.getLogin() + "' and senha='" + usu.getSenha() + "'");
            if (resultado.first()) {
                JOptionPane.showMessageDialog(null, "Acessado com sucesso! ");
                return true;
            } else {
                JOptionPane.showMessageDialog(null, "Acessado negado!");
            }

            return false;
        } catch (SQLException e) {

            JOptionPane.showMessageDialog(null, e);

            return false;
        }
    }
}
