/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ClassesDAO;

import ConexaoBancoDeDados.BancoDeDados;
import classes.Disciplinas;
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
public class DisciplinasDAO extends BancoDeDados {

    int idDisciplina = 0;

    public DisciplinasDAO() {
        BancoDeDados.conecta();
    }

    public boolean salvarDisciplinas(Disciplinas disciplina) {
        try {
            Statement st = conexao.createStatement();
            st.executeUpdate("INSERT INTO disciplinas VALUES(NULL, '" + disciplina.getNome() + "' ," + disciplina.getSiape() + ")");

            JOptionPane.showMessageDialog(null, "Cadastro realizado com sucesso!");

            return true;
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao inserir dados" + ex);
            return false;
        }

    }

    public int buscarDisciplina(String busca) {

        try {
            Statement st = conexao.createStatement();
            ResultSet resultado = st.executeQuery("SELECT iddisciplina FROM disciplinas WHERE nome='" + busca + "'");
            resultado.first();
            idDisciplina = resultado.getInt("iddisciplina");
            return idDisciplina;

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "equipamento não encontrado!");

        }
        return idDisciplina;
    }

    public Vector<Disciplinas> mostrarDocente() {

        try {
            Statement st = conexao.createStatement();
            ResultSet resultado = st.executeQuery("SELECT * FROM disciplinas ORDER BY nome");

            Vector listaDisciplinas = new Vector();
            while (resultado.next()) {
                int codigo = resultado.getInt("iddisciplina");
                String nome = resultado.getString("nome");
                Disciplinas disciplinas = new Disciplinas(codigo, nome);

                listaDisciplinas.add(disciplinas);
            }
            return listaDisciplinas;
        } catch (SQLException ex) {
            throw new RuntimeException(ex);
        }
    }

}
