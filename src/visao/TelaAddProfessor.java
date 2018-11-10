/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package visao;

import ClassesDAO.DocenteDAO;
import classes.Docente;
import javax.swing.JOptionPane;

/**
 *
 * @author MARCOS
 */
public class TelaAddProfessor extends javax.swing.JFrame {

    Docente docente= new Docente();
    DocenteDAO docenteDAO= new DocenteDAO();
    /**
     * Creates new form TelaDadosProfessor
     */
    public TelaAddProfessor() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabelTituloDadosProf = new javax.swing.JLabel();
        jFormattedTextFieldTelefone = new javax.swing.JFormattedTextField();
        jLabelSexoProf = new javax.swing.JLabel();
        jLabelAddEmailProf = new javax.swing.JLabel();
        jComboBoxSexo = new javax.swing.JComboBox<>();
        jLabelAddTelefoneProf = new javax.swing.JLabel();
        jTextFieldNome = new javax.swing.JTextField();
        jButtonAddProfessor = new javax.swing.JButton();
        jTextFieldEmail = new javax.swing.JTextField();
        jButtonVoltar = new javax.swing.JButton();
        jLabelNomeProf = new javax.swing.JLabel();
        jTextFieldEndereco = new javax.swing.JTextField();
        jLabelEnderecoProf = new javax.swing.JLabel();
        jLabelFundoDadosProf = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenuSairProf = new javax.swing.JMenu();
        jMenuItemSair = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(null);

        jLabelTituloDadosProf.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        jLabelTituloDadosProf.setForeground(new java.awt.Color(255, 255, 255));
        jLabelTituloDadosProf.setText("Dados");
        getContentPane().add(jLabelTituloDadosProf);
        jLabelTituloDadosProf.setBounds(60, 20, 200, 50);

        try {
            jFormattedTextFieldTelefone.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("(##)####-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        jFormattedTextFieldTelefone.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jFormattedTextFieldTelefoneActionPerformed(evt);
            }
        });
        getContentPane().add(jFormattedTextFieldTelefone);
        jFormattedTextFieldTelefone.setBounds(140, 200, 250, 30);

        jLabelSexoProf.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabelSexoProf.setForeground(new java.awt.Color(255, 255, 255));
        jLabelSexoProf.setText("Sexo:");
        getContentPane().add(jLabelSexoProf);
        jLabelSexoProf.setBounds(500, 80, 50, 30);

        jLabelAddEmailProf.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabelAddEmailProf.setForeground(new java.awt.Color(255, 255, 255));
        jLabelAddEmailProf.setText("E-mail:");
        getContentPane().add(jLabelAddEmailProf);
        jLabelAddEmailProf.setBounds(60, 140, 60, 30);

        jComboBoxSexo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Masculino\t", "Feminino" }));
        jComboBoxSexo.setSelectedIndex(-1);
        getContentPane().add(jComboBoxSexo);
        jComboBoxSexo.setBounds(560, 80, 120, 30);

        jLabelAddTelefoneProf.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabelAddTelefoneProf.setForeground(new java.awt.Color(255, 255, 255));
        jLabelAddTelefoneProf.setText("Telefone:");
        getContentPane().add(jLabelAddTelefoneProf);
        jLabelAddTelefoneProf.setBounds(60, 190, 100, 40);
        getContentPane().add(jTextFieldNome);
        jTextFieldNome.setBounds(140, 80, 330, 30);

        jButtonAddProfessor.setBackground(new java.awt.Color(0, 153, 0));
        jButtonAddProfessor.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jButtonAddProfessor.setText("Salvar");
        jButtonAddProfessor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAddProfessorActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonAddProfessor);
        jButtonAddProfessor.setBounds(400, 370, 110, 40);
        getContentPane().add(jTextFieldEmail);
        jTextFieldEmail.setBounds(140, 140, 250, 30);

        jButtonVoltar.setBackground(new java.awt.Color(255, 102, 0));
        jButtonVoltar.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jButtonVoltar.setText("Voltar");
        jButtonVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonVoltarActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonVoltar);
        jButtonVoltar.setBounds(260, 370, 110, 40);

        jLabelNomeProf.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabelNomeProf.setForeground(new java.awt.Color(255, 255, 255));
        jLabelNomeProf.setText("Nome:");
        getContentPane().add(jLabelNomeProf);
        jLabelNomeProf.setBounds(60, 70, 90, 40);
        getContentPane().add(jTextFieldEndereco);
        jTextFieldEndereco.setBounds(140, 250, 280, 30);

        jLabelEnderecoProf.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabelEnderecoProf.setForeground(new java.awt.Color(255, 255, 255));
        jLabelEnderecoProf.setText("Endereço:");
        getContentPane().add(jLabelEnderecoProf);
        jLabelEnderecoProf.setBounds(60, 250, 90, 40);

        jLabelFundoDadosProf.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/fundoficial.png"))); // NOI18N
        jLabelFundoDadosProf.setPreferredSize(new java.awt.Dimension(1000, 956));
        getContentPane().add(jLabelFundoDadosProf);
        jLabelFundoDadosProf.setBounds(0, 0, 690, 460);

        jMenuSairProf.setText("Sair");

        jMenuItemSair.setText("Sair");
        jMenuSairProf.add(jMenuItemSair);

        jMenuBar1.add(jMenuSairProf);

        setJMenuBar(jMenuBar1);

        setSize(new java.awt.Dimension(700, 513));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonAddProfessorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAddProfessorActionPerformed
        if (jTextFieldNome.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Digite o nome!");
        } else if (jComboBoxSexo.getSelectedIndex() == -1) {
            JOptionPane.showMessageDialog(null, "selecione o sexo!");
        } else if (jTextFieldEmail.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Digite o email!");
        } else if (jFormattedTextFieldTelefone.getText().equalsIgnoreCase("(  )    -    ")) {
            JOptionPane.showMessageDialog(null, "Digite o telefone!");
        } else if (jTextFieldEndereco.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Digite o Endereço!");
        }else {
            docente.setNome(jTextFieldNome.getText());
            docente.setSexo(String.valueOf(jComboBoxSexo.getSelectedItem()));
            docente.setEmail(jTextFieldEmail.getText());
            docente.setTelefone(jFormattedTextFieldTelefone.getText());
            docente.setEndereco(jTextFieldEndereco.getText());
            if(docenteDAO.salvarDocente(docente)==true){
                new TelaPrincipal().setVisible(true);
                dispose();
            }else{
                new TelaAddProfessor().setVisible(true);
                dispose();
                jTextFieldNome.requestFocus();
            }
            
        }
    }//GEN-LAST:event_jButtonAddProfessorActionPerformed

    private void jButtonVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonVoltarActionPerformed
        TelaPrincipal telaVoltar = new TelaPrincipal();
        telaVoltar.setVisible(true);
        dispose();
    }//GEN-LAST:event_jButtonVoltarActionPerformed

    private void jFormattedTextFieldTelefoneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jFormattedTextFieldTelefoneActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jFormattedTextFieldTelefoneActionPerformed

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
            java.util.logging.Logger.getLogger(TelaAddProfessor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaAddProfessor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaAddProfessor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaAddProfessor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaAddProfessor().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonAddProfessor;
    private javax.swing.JButton jButtonVoltar;
    private javax.swing.JComboBox<String> jComboBoxSexo;
    private javax.swing.JFormattedTextField jFormattedTextFieldTelefone;
    private javax.swing.JLabel jLabelAddEmailProf;
    private javax.swing.JLabel jLabelAddTelefoneProf;
    private javax.swing.JLabel jLabelEnderecoProf;
    private javax.swing.JLabel jLabelFundoDadosProf;
    private javax.swing.JLabel jLabelNomeProf;
    private javax.swing.JLabel jLabelSexoProf;
    private javax.swing.JLabel jLabelTituloDadosProf;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItemSair;
    private javax.swing.JMenu jMenuSairProf;
    private javax.swing.JTextField jTextFieldEmail;
    private javax.swing.JTextField jTextFieldEndereco;
    private javax.swing.JTextField jTextFieldNome;
    // End of variables declaration//GEN-END:variables
}
