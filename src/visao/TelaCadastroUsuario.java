/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package visao;

import ClassesDAO.UsuarioDAO;
import classes.Usuario;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;


/**
 *
 * @author marcos
 */
public class TelaCadastroUsuario extends javax.swing.JFrame {

    /**
     * Creates new form TelaCadastroUsuario
     */
    UsuarioDAO usuarioDAO = new UsuarioDAO();
    Usuario usuario = new Usuario();
    
    public TelaCadastroUsuario() {
        initComponents();
    }
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
   
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        TituloCadastro = new javax.swing.JLabel();
        jLabelLoginCadastro = new javax.swing.JLabel();
        jLabelSenhaCadastro = new javax.swing.JLabel();
        jButtonCadastrar = new javax.swing.JButton();
        jTextFieldCadastrar = new javax.swing.JTextField();
        jLabelLogoIcompCadastrar = new javax.swing.JLabel();
        jPasswordFieldSenha = new javax.swing.JPasswordField();
        jLabelFundoCadastro = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(null);

        TituloCadastro.setFont(new java.awt.Font("Noto Sans", 0, 20)); // NOI18N
        TituloCadastro.setForeground(java.awt.Color.white);
        TituloCadastro.setText("Cadastro de Usuário");
        getContentPane().add(TituloCadastro);
        TituloCadastro.setBounds(40, 10, 230, 70);

        jLabelLoginCadastro.setFont(new java.awt.Font("Noto Sans", 0, 14)); // NOI18N
        jLabelLoginCadastro.setForeground(java.awt.Color.white);
        jLabelLoginCadastro.setText("Login:");
        getContentPane().add(jLabelLoginCadastro);
        jLabelLoginCadastro.setBounds(50, 100, 110, 30);

        jLabelSenhaCadastro.setFont(new java.awt.Font("Noto Sans", 0, 14)); // NOI18N
        jLabelSenhaCadastro.setForeground(java.awt.Color.white);
        jLabelSenhaCadastro.setText("Senha:");
        getContentPane().add(jLabelSenhaCadastro);
        jLabelSenhaCadastro.setBounds(50, 160, 60, 40);

        jButtonCadastrar.setText("Cadastrar");
        jButtonCadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCadastrarActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonCadastrar);
        jButtonCadastrar.setBounds(300, 280, 130, 40);
        getContentPane().add(jTextFieldCadastrar);
        jTextFieldCadastrar.setBounds(110, 100, 160, 29);

        jLabelLogoIcompCadastrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/icompp.jpg"))); // NOI18N
        getContentPane().add(jLabelLogoIcompCadastrar);
        jLabelLogoIcompCadastrar.setBounds(500, 20, 140, 70);
        getContentPane().add(jPasswordFieldSenha);
        jPasswordFieldSenha.setBounds(120, 170, 140, 29);

        jLabelFundoCadastro.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/fundoficial.png"))); // NOI18N
        getContentPane().add(jLabelFundoCadastro);
        jLabelFundoCadastro.setBounds(0, 0, 690, 380);

        jMenu1.setText("Opções");

        jMenuItem1.setText("Voltar");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem1);

        jMenuBar1.add(jMenu1);

        setJMenuBar(jMenuBar1);

        setSize(new java.awt.Dimension(693, 431));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCadastrarActionPerformed
        if (jTextFieldCadastrar.getText().equals("")){
            JOptionPane.showMessageDialog(null, "Digite seu login!");
        }else if(new String(jPasswordFieldSenha.getPassword()).equals("")){
            JOptionPane.showMessageDialog(null, "Digite sua senha!");
        }else{
            usuario.setLogin(jTextFieldCadastrar.getText());
            usuario.setSenha(new String (jPasswordFieldSenha.getPassword()));
            usuarioDAO.salvarusuario(usuario);
            
            TelaPrincipal tela = new TelaPrincipal();
            tela.setVisible(true);
            dispose();
        }          
            
    }//GEN-LAST:event_jButtonCadastrarActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        TelaLogin tela4 = new TelaLogin ();
        tela4.setVisible(true);
        dispose();
    }//GEN-LAST:event_jMenuItem1ActionPerformed

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
            java.util.logging.Logger.getLogger(TelaCadastroUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaCadastroUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaCadastroUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaCadastroUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaCadastroUsuario().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel TituloCadastro;
    private javax.swing.JButton jButtonCadastrar;
    private javax.swing.JLabel jLabelFundoCadastro;
    private javax.swing.JLabel jLabelLoginCadastro;
    private javax.swing.JLabel jLabelLogoIcompCadastrar;
    private javax.swing.JLabel jLabelSenhaCadastro;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JPasswordField jPasswordFieldSenha;
    private javax.swing.JTextField jTextFieldCadastrar;
    // End of variables declaration//GEN-END:variables
}