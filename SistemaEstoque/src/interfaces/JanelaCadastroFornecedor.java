
package interfaces;

import controle.ControladorCadastroFornecedor;
import entidade.Fornecedor;
import entidade.Visão;
import java.util.Vector;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;

public class JanelaCadastroFornecedor extends javax.swing.JFrame {

    ControladorCadastroFornecedor controlador;
    Vector<Visão<String>> fornecedores_cadastrados;
    
    
    public JanelaCadastroFornecedor(ControladorCadastroFornecedor controlador) {
        this.controlador = controlador;
        fornecedores_cadastrados = Fornecedor.getVisões();
        initComponents();
        this.setLocationRelativeTo(null);//comando para que a Janela apareça no meio da Tela
    }
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        FormularioPanel = new javax.swing.JPanel();
        NomeLabel = new javax.swing.JLabel();
        CnpjLabel = new javax.swing.JLabel();
        NomeFornecedorTextField = new javax.swing.JFormattedTextField();
        CnpjTextField = new javax.swing.JFormattedTextField();
        FornecedoresCadastradosLabel = new javax.swing.JLabel();
        fornecedores_cadastradosComboBox = new javax.swing.JComboBox();
        BotõesPanel = new javax.swing.JPanel();
        InserirButton = new javax.swing.JButton();
        consultarButton = new javax.swing.JButton();
        AlterarButton = new javax.swing.JButton();
        removerButton = new javax.swing.JButton();
        limparButton = new javax.swing.JButton();
        SairButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        FormularioPanel.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createEmptyBorder(5, 0, 5, 0), javax.swing.BorderFactory.createTitledBorder(null, "Formulário", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 11), new java.awt.Color(102, 153, 255)))); // NOI18N
        FormularioPanel.setOpaque(false);
        FormularioPanel.setLayout(new java.awt.GridBagLayout());

        NomeLabel.setText("Nome:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(9, 6, 0, 0);
        FormularioPanel.add(NomeLabel, gridBagConstraints);

        CnpjLabel.setText("CNPJ:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(7, 8, 0, 0);
        FormularioPanel.add(CnpjLabel, gridBagConstraints);

        NomeFornecedorTextField.setColumns(25);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.ipadx = 336;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(6, 4, 0, 16);
        FormularioPanel.add(NomeFornecedorTextField, gridBagConstraints);

        CnpjTextField.setColumns(14);
        try {
            CnpjTextField.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##.###.###/####-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        CnpjTextField.setValue(new String());
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.ipadx = 336;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(4, 4, 27, 16);
        FormularioPanel.add(CnpjTextField, gridBagConstraints);

        FornecedoresCadastradosLabel.setText("Fornecedores Cadastrados:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(26, 6, 0, 0);
        FormularioPanel.add(FornecedoresCadastradosLabel, gridBagConstraints);

        fornecedores_cadastradosComboBox.setModel(new DefaultComboBoxModel(fornecedores_cadastrados));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(23, 10, 0, 0);
        FormularioPanel.add(fornecedores_cadastradosComboBox, gridBagConstraints);

        BotõesPanel.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        BotõesPanel.setLayout(new java.awt.GridBagLayout());

        InserirButton.setText("Inserir");
        InserirButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        InserirButton.setFocusPainted(false);
        InserirButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                InserirFornecedor(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(17, 12, 0, 0);
        BotõesPanel.add(InserirButton, gridBagConstraints);

        consultarButton.setText("Consultar");
        consultarButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        consultarButton.setFocusPainted(false);
        consultarButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                consultarFornecedor(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(17, 6, 0, 0);
        BotõesPanel.add(consultarButton, gridBagConstraints);

        AlterarButton.setText("Alterar");
        AlterarButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        AlterarButton.setFocusPainted(false);
        AlterarButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                alterarFornecedor(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(17, 6, 0, 0);
        BotõesPanel.add(AlterarButton, gridBagConstraints);

        removerButton.setText("Remover");
        removerButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                removerFornecedor(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(17, 6, 18, 0);
        BotõesPanel.add(removerButton, gridBagConstraints);

        limparButton.setText("Limpar");
        limparButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        limparButton.setFocusPainted(false);
        limparButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                limparCamposTexto(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 4;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(17, 6, 0, 12);
        BotõesPanel.add(limparButton, gridBagConstraints);

        SairButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/sair.png"))); // NOI18N
        SairButton.setToolTipText("");
        SairButton.setBorderPainted(false);
        SairButton.setContentAreaFilled(false);
        SairButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        SairButton.setFocusPainted(false);
        SairButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SairButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(SairButton)
                        .addGap(10, 10, 10))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(FormularioPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(BotõesPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(0, 10, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(SairButton)
                .addGap(11, 11, 11)
                .addComponent(FormularioPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(BotõesPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void InserirFornecedor(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_InserirFornecedor
        Fornecedor f1 = obterFornecedorInformado();
        String mensagem_erro = null;
        if (f1 != null) mensagem_erro = controlador.inserirFornecedor(f1);
        else mensagem_erro = "Algum atributo do fornecedor não foi informado";
        if (mensagem_erro == null) {
            Visão<String> visão = f1.getVisão();
            fornecedores_cadastradosComboBox.addItem(visão);
            fornecedores_cadastradosComboBox.setSelectedItem(visão);
        } else JOptionPane.showMessageDialog(this, mensagem_erro, "ERRO",
            JOptionPane.ERROR_MESSAGE);
    }//GEN-LAST:event_InserirFornecedor

    private void consultarFornecedor(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_consultarFornecedor
        Visão<String> visão
        = (Visão<String>) fornecedores_cadastradosComboBox.getSelectedItem();
        Fornecedor f1 = null;
        String mensagem_erro = null;
        if (visão != null) {
            f1 = Fornecedor.buscarFornecedor (visão.getChave());
            if (f1 == null) mensagem_erro = "Fornecedor não cadastrado";
        } else mensagem_erro = "Nenhum Fornecedor selecionado";
        if (mensagem_erro == null) {
            CnpjTextField.setText(f1.getCnpj());
            NomeFornecedorTextField.setText (f1.getNome());
        } else JOptionPane.showMessageDialog
        (this, mensagem_erro, "ERRO", JOptionPane.ERROR_MESSAGE);
    }//GEN-LAST:event_consultarFornecedor

    private void alterarFornecedor(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_alterarFornecedor
        Fornecedor f1 = obterFornecedorInformado();
        String mensagem_erro = null;
        if (f1 != null) mensagem_erro = controlador.alterarFornecedor(f1);
        else mensagem_erro = "Algum atributo do fornecedor não foi informado";
        if (mensagem_erro == null) {
            Visão<String> visão = getVisãoFornecedoresCadastrados(f1.getCnpj());
            if (visão != null) {
                visão.setInfo(f1.getVisão().getInfo());
                fornecedores_cadastradosComboBox.updateUI();
                fornecedores_cadastradosComboBox.setSelectedItem(visão);
            }
        } else JOptionPane.showMessageDialog
        (this, mensagem_erro, "ERRO", JOptionPane.ERROR_MESSAGE);
    }//GEN-LAST:event_alterarFornecedor

    private void removerFornecedor(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_removerFornecedor
        Visão<String> visão
        = (Visão<String>) fornecedores_cadastradosComboBox.getSelectedItem();
        String mensagem_erro = null;
        if (visão != null) mensagem_erro = controlador.removerFornecedor(visão.getChave());
        else{
            limparCamposTexto();
            mensagem_erro = "Nenhum fornecedor selecionado";
        }
        if (mensagem_erro == null) {
            fornecedores_cadastrados.remove(visão);
            if (fornecedores_cadastrados.size() >= 1)
            fornecedores_cadastradosComboBox.setSelectedIndex(0);
            else fornecedores_cadastradosComboBox.setSelectedIndex(-1);
            limparCamposTexto();
        } else {
            JOptionPane.showMessageDialog(this, mensagem_erro, "ERRO",
                JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_removerFornecedor

    private void limparCamposTexto(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_limparCamposTexto
        CnpjTextField.setText ("");
        NomeFornecedorTextField.setText("");
    }//GEN-LAST:event_limparCamposTexto
    //polimorfismo de Sobrecarga
    private void limparCamposTexto() {                                   
        CnpjTextField.setText ("");
        NomeFornecedorTextField.setText("");
    }   
    
    private Fornecedor obterFornecedorInformado() {
        //valores tipo String
        String nome = NomeFornecedorTextField.getText();
        if (nome.isEmpty()) return null;
        
        
        String mascara = "  .   .   /    -  ";
        
        String cnpj = CnpjTextField.getText();
        if (cnpj.isEmpty()) return null;
        if(mascara.equals(cnpj)) return null;//verifica se não escreveu nada
        
        //retorno
        return new Fornecedor(cnpj,nome);
    }
    
    //Método para pegar a visão dos Fornecedores
    private Visão<String> getVisãoFornecedoresCadastrados(String chave) {
        for (Visão<String> visão : fornecedores_cadastrados) {
            if (visão.getChave().equals(chave)) return visão;
        }
        return null;
    }

    
    private void SairButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SairButtonActionPerformed
        this.dispose();
    }//GEN-LAST:event_SairButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AlterarButton;
    private javax.swing.JPanel BotõesPanel;
    private javax.swing.JLabel CnpjLabel;
    private javax.swing.JFormattedTextField CnpjTextField;
    private javax.swing.JPanel FormularioPanel;
    private javax.swing.JLabel FornecedoresCadastradosLabel;
    private javax.swing.JButton InserirButton;
    private javax.swing.JFormattedTextField NomeFornecedorTextField;
    private javax.swing.JLabel NomeLabel;
    private javax.swing.JButton SairButton;
    private javax.swing.JButton consultarButton;
    private javax.swing.JComboBox fornecedores_cadastradosComboBox;
    private javax.swing.JButton limparButton;
    private javax.swing.JButton removerButton;
    // End of variables declaration//GEN-END:variables
}
