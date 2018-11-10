/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package visao;

import ClassesDAO.UsuarioDAO;
import classes.Usuario;
import javax.swing.JOptionPane;

/**
 *
 * @author MARCOS
 */
public class TelaLogin extends javax.swing.JFrame {

    Usuario usuario = new Usuario();
    UsuarioDAO usuarioDAO = new UsuarioDAO();

    /**
     * Creates new form TelaLogin
     */
    public TelaLogin() {
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

        jLabelUsuario = new javax.swing.JLabel();
        jLabelSenha = new javax.swing.JLabel();
        jButtonEntrar = new javax.swing.JButton();
        jTextFieldUsuario = new javax.swing.JTextField();
        jPasswordField1 = new javax.swing.JPasswordField();
        jLabelLogoIcomp = new javax.swing.JLabel();
        jLabelLogoUsuario = new javax.swing.JLabel();
        jButtonCadastrarUsuario = new javax.swing.JButton();
        jLabelFundoTelaLogin = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(null);

        jLabelUsuario.setText("Usuário:");
        getContentPane().add(jLabelUsuario);
        jLabelUsuario.setBounds(170, 110, 70, 17);

        jLabelSenha.setText("Senha:");
        getContentPane().add(jLabelSenha);
        jLabelSenha.setBounds(170, 150, 60, 17);

        jButtonEntrar.setText("Entrar");
        jButtonEntrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonEntrarActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonEntrar);
        jButtonEntrar.setBounds(230, 190, 73, 31);

        jTextFieldUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldUsuarioActionPerformed(evt);
            }
        });
        getContentPane().add(jTextFieldUsuario);
        jTextFieldUsuario.setBounds(250, 100, 130, 30);

        jPasswordField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jPasswordField1ActionPerformed(evt);
            }
        });
        getContentPane().add(jPasswordField1);
        jPasswordField1.setBounds(250, 140, 130, 30);

        jLabelLogoIcomp.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/icompp.jpg"))); // NOI18N
        getContentPane().add(jLabelLogoIcomp);
        jLabelLogoIcomp.setBounds(10, 10, 120, 60);

        jLabelLogoUsuario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/usuario.png"))); // NOI18N
        getContentPane().add(jLabelLogoUsuario);
        jLabelLogoUsuario.setBounds(280, 10, 70, 70);

        jButtonCadastrarUsuario.setText("Cadastrar");
        jButtonCadastrarUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCadastrarUsuarioActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonCadastrarUsuario);
        jButtonCadastrarUsuario.setBounds(310, 190, 90, 31);

        jLabelFundoTelaLogin.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/fundo.jpg"))); // NOI18N
        getContentPane().add(jLabelFundoTelaLogin);
        jLabelFundoTelaLogin.setBounds(0, 0, 410, 300);

        setSize(new java.awt.Dimension(418, 330));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jPasswordField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jPasswordField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jPasswordField1ActionPerformed

    private void jButtonEntrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonEntrarActionPerformed

        if (jTextFieldUsuario.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Digite o seu login!");
            jTextFieldUsuario.requestFocus();
        } else if (new String(jPasswordField1.getPassword()).equals("")) {
            JOptionPane.showMessageDialog(null, "Digite a sua senha!");
            jPasswordField1.requestFocus();

        } else {
            usuario.setLogin(jTextFieldUsuario.getText());
            usuario.setSenha(new String(jPasswordField1.getPassword()));
            if (usuarioDAO.acessar(usuario) == true) {
                new TelaPrincipal().setVisible(true);
                dispose();
            } else {
                new TelaLogin().setVisible(true);
                dispose();
                jTextFieldUsuario.requestFocus();
            }

        }
    }//GEN-LAST:event_jButtonEntrarActionPerformed

    private void jTextFieldUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldUsuarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldUsuarioActionPerformed

    private void jButtonCadastrarUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCadastrarUsuarioActionPerformed
        TelaCadastroUsuario tela2 = new TelaCadastroUsuario();
        tela2.setVisible(true);
        dispose();
    }//GEN-LAST:event_jButtonCadastrarUsuarioActionPerformed

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
            java.util.logging.Logger.getLogger(TelaLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaLogin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonCadastrarUsuario;
    private javax.swing.JButton jButtonEntrar;
    private javax.swing.JLabel jLabelFundoTelaLogin;
    private javax.swing.JLabel jLabelLogoIcomp;
    private javax.swing.JLabel jLabelLogoUsuario;
    private javax.swing.JLabel jLabelSenha;
    private javax.swing.JLabel jLabelUsuario;
    private javax.swing.JPasswordField jPasswordField1;
    private javax.swing.JTextField jTextFieldUsuario;
    // End of variables declaration//GEN-END:variables
}
