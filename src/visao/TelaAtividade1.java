/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package visao;

import ClassesDAO.DescricaoDAO;
import ClassesDAO.DisciplinasDAO;
import classes.Descricao;
import classes.Disciplinas;
import java.util.Vector;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;

/**
 *
 * @author MARCOS
 */
public class TelaAtividade1 extends javax.swing.JFrame {

    Descricao descricao = new Descricao();
    DescricaoDAO descricaoDAO = new DescricaoDAO();
    DisciplinasDAO disciplinasDAO = new DisciplinasDAO();
    Disciplinas disciplinas = new Disciplinas();
    int codigoDisciplina = 0;
    Vector<Disciplinas> listaDisciplinas = null;

    /**
     * Creates new form TelaAtividade1
     */
    public TelaAtividade1() {
        initComponents();
        listaDisciplinas = disciplinasDAO.mostrarDocente();
        DefaultComboBoxModel modeloCombo = new DefaultComboBoxModel(listaDisciplinas);
        jComboBoxDisciplina.setModel(modeloCombo);
        jComboBoxDisciplina.setSelectedIndex(-1);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPasswordField1 = new javax.swing.JPasswordField();
        jLabelTituloAtv = new javax.swing.JLabel();
        jLabelDisciplinas = new javax.swing.JLabel();
        jComboBoxDisciplina = new javax.swing.JComboBox<>();
        jTextFieldNomeDoArtigo = new javax.swing.JTextField();
        jComboBoxTipoOrientacao = new javax.swing.JComboBox<>();
        jLabelAlunosOrientados = new javax.swing.JLabel();
        jLabelArtigosPub = new javax.swing.JLabel();
        jLabelAtivCoord = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextAreaDescricao = new javax.swing.JTextArea();
        jButtonVoltar = new javax.swing.JButton();
        jButtonSalvar = new javax.swing.JButton();
        jLabelFundoDescricao = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenuAjudaProf = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuSairProf = new javax.swing.JMenu();
        jMenuItemSair = new javax.swing.JMenuItem();

        jPasswordField1.setText("jPasswordField1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(null);

        jLabelTituloAtv.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        jLabelTituloAtv.setForeground(new java.awt.Color(255, 255, 255));
        jLabelTituloAtv.setText("Descrição de Atividade");
        getContentPane().add(jLabelTituloAtv);
        jLabelTituloAtv.setBounds(20, 10, 230, 50);
        jLabelTituloAtv.getAccessibleContext().setAccessibleName("Atividade 1 ");

        jLabelDisciplinas.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabelDisciplinas.setForeground(new java.awt.Color(255, 255, 255));
        jLabelDisciplinas.setText("Disciplina:");
        getContentPane().add(jLabelDisciplinas);
        jLabelDisciplinas.setBounds(20, 70, 90, 40);

        jComboBoxDisciplina.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jComboBoxDisciplinaItemStateChanged(evt);
            }
        });
        jComboBoxDisciplina.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jComboBoxDisciplinaMouseClicked(evt);
            }
        });
        getContentPane().add(jComboBoxDisciplina);
        jComboBoxDisciplina.setBounds(130, 80, 310, 24);
        getContentPane().add(jTextFieldNomeDoArtigo);
        jTextFieldNomeDoArtigo.setBounds(170, 210, 330, 30);

        jComboBoxTipoOrientacao.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Alunos de Graduação - TCC", "Alunos de Graduação - Iniciação Científica", "Alunos de Mestrado", "Alunos de Doutorado" }));
        jComboBoxTipoOrientacao.setSelectedIndex(-1);
        getContentPane().add(jComboBoxTipoOrientacao);
        jComboBoxTipoOrientacao.setBounds(170, 140, 330, 30);

        jLabelAlunosOrientados.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabelAlunosOrientados.setForeground(new java.awt.Color(255, 255, 255));
        jLabelAlunosOrientados.setText("Tipo orientação:");
        getContentPane().add(jLabelAlunosOrientados);
        jLabelAlunosOrientados.setBounds(20, 140, 140, 30);

        jLabelArtigosPub.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabelArtigosPub.setForeground(new java.awt.Color(255, 255, 255));
        jLabelArtigosPub.setText("Nome do Artigo:");
        getContentPane().add(jLabelArtigosPub);
        jLabelArtigosPub.setBounds(20, 210, 140, 30);

        jLabelAtivCoord.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabelAtivCoord.setForeground(new java.awt.Color(255, 255, 255));
        jLabelAtivCoord.setText("Atividades de Coordenação:");
        getContentPane().add(jLabelAtivCoord);
        jLabelAtivCoord.setBounds(20, 300, 230, 20);

        jTextAreaDescricao.setColumns(20);
        jTextAreaDescricao.setRows(5);
        jScrollPane2.setViewportView(jTextAreaDescricao);

        getContentPane().add(jScrollPane2);
        jScrollPane2.setBounds(230, 300, 270, 110);

        jButtonVoltar.setBackground(new java.awt.Color(255, 102, 0));
        jButtonVoltar.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jButtonVoltar.setText("Voltar");
        jButtonVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonVoltarActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonVoltar);
        jButtonVoltar.setBounds(160, 430, 110, 40);

        jButtonSalvar.setBackground(new java.awt.Color(0, 153, 0));
        jButtonSalvar.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jButtonSalvar.setText("Salvar");
        jButtonSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSalvarActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonSalvar);
        jButtonSalvar.setBounds(380, 430, 120, 40);

        jLabelFundoDescricao.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/fundoficial.png"))); // NOI18N
        jLabelFundoDescricao.setMaximumSize(new java.awt.Dimension(100, 956));
        jLabelFundoDescricao.setPreferredSize(new java.awt.Dimension(1000, 956));
        getContentPane().add(jLabelFundoDescricao);
        jLabelFundoDescricao.setBounds(-20, -50, 710, 930);

        jMenuAjudaProf.setText("Opções");

        jMenuItem1.setText("Voltar");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenuAjudaProf.add(jMenuItem1);

        jMenuBar1.add(jMenuAjudaProf);

        jMenuSairProf.setText("Sair");

        jMenuItemSair.setText("Sair");
        jMenuItemSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemSairActionPerformed(evt);
            }
        });
        jMenuSairProf.add(jMenuItemSair);

        jMenuBar1.add(jMenuSairProf);

        setJMenuBar(jMenuBar1);

        setSize(new java.awt.Dimension(712, 651));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed

    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jMenuItemSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemSairActionPerformed
        TelaLogin telasair1 = new TelaLogin();
        telasair1.setVisible(true);
        dispose();
    }//GEN-LAST:event_jMenuItemSairActionPerformed

    private void jButtonSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSalvarActionPerformed
        if (codigoDisciplina <= 0) {
            JOptionPane.showMessageDialog(null, "Selecione a disciplina!");
        } else if (jComboBoxTipoOrientacao.getSelectedIndex() == -1) {
            JOptionPane.showMessageDialog(null, "Selecione o tipo de orientação!");

        } else if (jTextFieldNomeDoArtigo.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Preencha o nome do artigo!");

        } else if (jTextAreaDescricao.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Preencha a descrição do artigo!");

        } else {
            descricao.setTipoDeOrientacao(String.valueOf(jComboBoxTipoOrientacao.getSelectedItem()));
            descricao.setNomeDoArtigo(jTextFieldNomeDoArtigo.getText());
            descricao.setDescricaoCoordenacao(jTextAreaDescricao.getText());
            descricao.setCodigo(codigoDisciplina);
            if (descricaoDAO.salvarDescricao(descricao) == true) {
                new TelaPrincipal().setVisible(true);
                dispose();
            }

        }
    }//GEN-LAST:event_jButtonSalvarActionPerformed

    private void jComboBoxDisciplinaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jComboBoxDisciplinaMouseClicked
        // TODO add your handling code here:
        // TODO add your handling code here:
        if (jComboBoxDisciplina.getSelectedIndex() >= 0) {
            String nome = "" + jComboBoxDisciplina.getModel().getSelectedItem();
            codigoDisciplina = disciplinasDAO.buscarDisciplina(nome);
            System.out.println(codigoDisciplina);

        }
    }//GEN-LAST:event_jComboBoxDisciplinaMouseClicked

    private void jComboBoxDisciplinaItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jComboBoxDisciplinaItemStateChanged
        // TODO add your handling code here:
        if (jComboBoxDisciplina.getSelectedIndex() >= 0) {
            String nome = "" + jComboBoxDisciplina.getModel().getSelectedItem();
            codigoDisciplina = disciplinasDAO.buscarDisciplina(nome);
            System.out.println(codigoDisciplina);

        }
    }//GEN-LAST:event_jComboBoxDisciplinaItemStateChanged

    private void jButtonVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonVoltarActionPerformed
        TelaPrincipal telaVoltar = new TelaPrincipal();
        telaVoltar.setVisible(true);
        dispose();
    }//GEN-LAST:event_jButtonVoltarActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(TelaAtividade1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaAtividade1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaAtividade1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaAtividade1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaAtividade1().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonSalvar;
    private javax.swing.JButton jButtonVoltar;
    private javax.swing.JComboBox<String> jComboBoxDisciplina;
    private javax.swing.JComboBox<String> jComboBoxTipoOrientacao;
    private javax.swing.JLabel jLabelAlunosOrientados;
    private javax.swing.JLabel jLabelArtigosPub;
    private javax.swing.JLabel jLabelAtivCoord;
    private javax.swing.JLabel jLabelDisciplinas;
    private javax.swing.JLabel jLabelFundoDescricao;
    private javax.swing.JLabel jLabelTituloAtv;
    private javax.swing.JMenu jMenuAjudaProf;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItemSair;
    private javax.swing.JMenu jMenuSairProf;
    private javax.swing.JPasswordField jPasswordField1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextArea jTextAreaDescricao;
    private javax.swing.JTextField jTextFieldNomeDoArtigo;
    // End of variables declaration//GEN-END:variables
}
