/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ClassesDAO;

import ConexaoBancoDeDados.BancoDeDados;
import classes.Descricao;
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
public class DescricaoDAO extends BancoDeDados {

    public DescricaoDAO() {
        BancoDeDados.conecta();
    }

    public boolean salvarDescricao(Descricao descricao) {
        try {
            Statement st = conexao.createStatement();
            st.executeUpdate("INSERT INTO descricao VALUES(NULL, '" + descricao.getTipoDeOrientacao() + "' ,'" + descricao.getNomeDoArtigo() + "', '" + descricao.getDescricaoCoordenacao() + "'," + descricao.getCodigo() + ")");

            JOptionPane.showMessageDialog(null, "Cadastro realizado com sucesso!");

            return true;
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao inserir dados" + ex);
            return false;
        }

    }

    public Vector<Descricao> mostrarDescricao() {

        try {
            Statement st = conexao.createStatement();
            ResultSet resultado = st.executeQuery("SELECT nome,tipodeorientacao,nomedoartigo,descricaocoordenacao from disciplinas,descricao where disciplinas.iddisciplina= descricao.codigoDisciplina;");

            Vector listaNomes = new Vector();
            while (resultado.next()) {
                // int codigo = resultado.getInt("id_siape");
                String nome = resultado.getString("nome");
                String nomeArtigo = resultado.getString("nomedoartigo");
                String tipoOrientacao = resultado.getString("tipodeorientacao");
                String descricao = resultado.getString("descricaocoordenacao");

                Descricao descricao1 = new Descricao(tipoOrientacao, nomeArtigo, descricao, nome);

                listaNomes.add(descricao1);
            }
            return listaNomes;
        } catch (SQLException ex) {
            throw new RuntimeException(ex);
        }
    }

}
