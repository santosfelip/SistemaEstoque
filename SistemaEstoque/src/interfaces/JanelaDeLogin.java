
package interfaces;

import entidade.Usuario;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import persistência.BD;


public class JanelaDeLogin extends javax.swing.JFrame {

    
    public JanelaDeLogin() throws ClassNotFoundException, InstantiationException, IllegalAccessException, UnsupportedLookAndFeelException {
        BD.criaConexão();
        initComponents();
        UIManager.setLookAndFeel("javax.swing.plaf.metal.MetalLookAndFeel");
        this.setExtendedState(MAXIMIZED_BOTH); this.show();
        this.setLocationRelativeTo(null); 
    }
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        loginTextField = new javax.swing.JTextField();
        EntrarButton = new javax.swing.JButton();
        senhaPasswordField = new javax.swing.JPasswordField();
        ImagemLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Tela de Login");
        setBackground(java.awt.Color.white);
        getContentPane().setLayout(new java.awt.GridBagLayout());

        loginTextField.setDebugGraphicsOptions(javax.swing.DebugGraphics.NONE_OPTION);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.ipadx = 245;
        gridBagConstraints.ipady = 6;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(26, 20, 0, 20);
        getContentPane().add(loginTextField, gridBagConstraints);

        EntrarButton.setBackground(java.awt.Color.white);
        EntrarButton.setForeground(java.awt.Color.black);
        EntrarButton.setText("Entrar");
        EntrarButton.setBorderPainted(false);
        EntrarButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        EntrarButton.setDebugGraphicsOptions(javax.swing.DebugGraphics.NONE_OPTION);
        EntrarButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EntrarButtonActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.ipadx = 200;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(6, 20, 20, 20);
        getContentPane().add(EntrarButton, gridBagConstraints);

        senhaPasswordField.setToolTipText("");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.ipadx = 245;
        gridBagConstraints.ipady = 6;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(12, 20, 0, 20);
        getContentPane().add(senhaPasswordField, gridBagConstraints);

        ImagemLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ImagemLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/login.png"))); // NOI18N
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(20, 20, 0, 20);
        getContentPane().add(ImagemLabel, gridBagConstraints);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void EntrarButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EntrarButtonActionPerformed
        if(Usuario.verificaLogin(loginTextField.getText(),senhaPasswordField.getText()))
        {           
            new JanelaPrincipal(Usuario.criarUsuario(loginTextField.getText(), senhaPasswordField.getText())).
                    setVisible(true);
            this.dispose();
        }else
        JOptionPane.showMessageDialog(this, "Usuário/Senha Inválido", "ERRO", JOptionPane.ERROR_MESSAGE);

    }//GEN-LAST:event_EntrarButtonActionPerformed

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
            java.util.logging.Logger.getLogger(JanelaDeLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JanelaDeLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JanelaDeLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JanelaDeLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new JanelaDeLogin().setVisible(true);
                } catch (ClassNotFoundException ex) {
                    Logger.getLogger(JanelaDeLogin.class.getName()).log(Level.SEVERE, null, ex);
                } catch (InstantiationException ex) {
                    Logger.getLogger(JanelaDeLogin.class.getName()).log(Level.SEVERE, null, ex);
                } catch (IllegalAccessException ex) {
                    Logger.getLogger(JanelaDeLogin.class.getName()).log(Level.SEVERE, null, ex);
                } catch (UnsupportedLookAndFeelException ex) {
                    Logger.getLogger(JanelaDeLogin.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton EntrarButton;
    private javax.swing.JLabel ImagemLabel;
    private javax.swing.JTextField loginTextField;
    private javax.swing.JPasswordField senhaPasswordField;
    // End of variables declaration//GEN-END:variables
}
