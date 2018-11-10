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

    public boolean acessaTabela(Docente docente, int codigo) {
        try {
            Statement st = conexao.createStatement();
            ResultSet resultado = st.executeQuery("SELECT * FROM docente WHERE id_siape=" + codigo + "");
            resultado.first();

            docente.setIdSiape(resultado.getInt("id_siape"));

            return true;
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao selecionar dados!" + ex);
            return false;
        }

    }

    public boolean excluir(int idProfessor) {

        try {
            Statement st = conexao.createStatement();
            st.executeUpdate("DELETE FROM docente WHERE id_siape=" + idProfessor + "");
            JOptionPane.showMessageDialog(null, "Excluido com Sucesso!");
            return true;
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao excluir!" + ex);
            return false;
        }

    }

    public Docente recuperaDados(int codigo) {
       Docente docente= new Docente();
        try {
            Statement st = conexao.createStatement();
            ResultSet resultado = st.executeQuery("SELECT * FROM docente WHERE id_siape=" +codigo  + "");
            resultado.first();

            docente.setIdSiape(resultado.getInt("id_siape"));
            docente.setNome(resultado.getString("nome"));
            docente.setSexo(resultado.getString("sexo"));
            docente.setEmail(resultado.getString("email"));
            docente.setTelefone(resultado.getString("telefone"));
            docente.setEndereco(resultado.getString("endereco"));
            

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao buscar!" + ex);

        }
        return docente;
    }
    
     public boolean alterar(Docente docente) {

        try {
            Statement st = conexao.createStatement();

            st.executeUpdate("UPDATE docente SET email='" +docente.getEmail()+"', telefone='"+docente.getTelefone()+"',endereco='"+docente.getEndereco() + "' WHERE id_siape=" + docente.getIdSiape());
            JOptionPane.showMessageDialog(null, "Dados alterados com sucesso!");

            return true;

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Dados não alterados!");
            return false;
        }
    }


}
