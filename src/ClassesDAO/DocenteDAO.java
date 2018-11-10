/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ClassesDAO;

import ConexaoBancoDeDados.BancoDeDados;
import classes.Docente;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Vector;
import javax.swing.JOptionPane;

/**
 *
 * @author marcos
 */
public class DocenteDAO extends BancoDeDados {

    int idDocente = 0;

    public DocenteDAO() {
        BancoDeDados.conecta();
    }

    public boolean salvarDocente(Docente docente) {
        try {
            Statement st = conexao.createStatement();
            ResultSet resultado = st.executeQuery("SELECT * FROM docente WHERE email='" + docente.getEmail() + "'");

            if (resultado.first() == true) {
                JOptionPane.showMessageDialog(null, "Email já existente no sistema!");
                return false;

            } else {
                st.executeUpdate("INSERT INTO docente VALUES(NULL, '" + docente.getNome() + "' , '" + docente.getSexo() + "', '" + docente.getEmail() + "', '" + docente.getTelefone() + "', '" + docente.getEndereco() + "')");
                JOptionPane.showMessageDialog(null, "Cadastro realizado com sucesso!");

                return true;
            }

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao inserir dados" + ex);
            return false;
        }

    }

    public Vector<Docente> mostrarDocente() {

        try {
            Statement st = conexao.createStatement();
            ResultSet resultado = st.executeQuery("SELECT * FROM docente ORDER BY nome");

            Vector listaDocente = new Vector();
            while (resultado.next()) {
                int codigo = resultado.getInt("id_siape");
                String nome = resultado.getString("nome");

                Docente docente = new Docente(codigo, nome);

                listaDocente.add(docente);
            }
            return listaDocente;
        } catch (SQLException ex) {
            throw new RuntimeException(ex);
        }
    }

    public int buscarDocente(String busca) {

        try {
            Statement st = conexao.createStatement();
            ResultSet resultado = st.executeQuery("SELECT id_siape FROM docente WHERE nome='" + busca + "'");
            resultado.first();
            idDocente = resultado.getInt("id_siape");
            return idDocente;

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "equipamento não encontrado!");

        }
        return idDocente;
    }

    public Vector<Docente> mostraTodosProfessores() {

        try {
            Statement st = conexao.createStatement();
            ResultSet resultado = st.executeQuery("SELECT * FROM docente ORDER BY nome");

            Vector listaNomes = new Vector();
            while (resultado.next()) {
                int codigo = resultado.getInt("id_siape");
                String nome = resultado.getString("nome");
                String email = resultado.getString("email");

                Docente docente = new Docente(codigo, nome, email);

                listaNomes.add(docente);
            }
            return listaNomes;
        } catch (SQLException ex) {
            throw new RuntimeException(ex);
        }
    }

}
