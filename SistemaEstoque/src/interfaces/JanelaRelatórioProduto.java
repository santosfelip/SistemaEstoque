

package interfaces;

import controle.ControladorRelatorioProdutos;


public class JanelaRelatórioProduto extends javax.swing.JFrame {
    ControladorRelatorioProdutos controlador;
 
    public JanelaRelatórioProduto(ControladorRelatorioProdutos controlador) {
        this.controlador = controlador;
        initComponents();
        this.setLocationRelativeTo(null);
        categoriaComboBox.setSelectedIndex(-1);
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        relatorioPanel = new javax.swing.JPanel();
        categoriaComboBox = new javax.swing.JComboBox<>();
        categoriaLabel = new javax.swing.JLabel();
        comprarRadioButton = new javax.swing.JRadioButton();
        nomeLabel = new javax.swing.JLabel();
        nomeTextField = new javax.swing.JTextField();
        codigoLabel = new javax.swing.JLabel();
        codigoTextField = new javax.swing.JTextField();
        marcaLabel = new javax.swing.JLabel();
        marcaTextField = new javax.swing.JTextField();
        botoesPanel = new javax.swing.JPanel();
        gerarButton = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        SairButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Relatório");

        relatorioPanel.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Personalizar", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Dialog", 0, 12), new java.awt.Color(25, 107, 223))); // NOI18N

        categoriaComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Alimentício", "Limpeza", "Embalagem", "Higiene", "Informática" }));
        categoriaComboBox.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        categoriaLabel.setText("Categoria:");

        comprarRadioButton.setText("Produtos que precisam comprar");
        comprarRadioButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        nomeLabel.setText("Nome:");

        codigoLabel.setText("Código de Barras:");

        marcaLabel.setText("Marca:");

        javax.swing.GroupLayout relatorioPanelLayout = new javax.swing.GroupLayout(relatorioPanel);
        relatorioPanel.setLayout(relatorioPanelLayout);
        relatorioPanelLayout.setHorizontalGroup(
            relatorioPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(relatorioPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(relatorioPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(relatorioPanelLayout.createSequentialGroup()
                        .addComponent(comprarRadioButton)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(relatorioPanelLayout.createSequentialGroup()
                        .addGroup(relatorioPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(relatorioPanelLayout.createSequentialGroup()
                                .addComponent(nomeLabel)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(nomeTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(relatorioPanelLayout.createSequentialGroup()
                                .addComponent(marcaLabel)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(marcaTextField)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(relatorioPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(relatorioPanelLayout.createSequentialGroup()
                                .addComponent(categoriaLabel)
                                .addGap(3, 3, 3)
                                .addComponent(categoriaComboBox, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(relatorioPanelLayout.createSequentialGroup()
                                .addComponent(codigoLabel)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(codigoTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap())
        );
        relatorioPanelLayout.setVerticalGroup(
            relatorioPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(relatorioPanelLayout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addGroup(relatorioPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nomeLabel)
                    .addComponent(nomeTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(codigoLabel)
                    .addComponent(codigoTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(relatorioPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(categoriaLabel)
                    .addComponent(categoriaComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(marcaLabel)
                    .addComponent(marcaTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 54, Short.MAX_VALUE)
                .addComponent(comprarRadioButton)
                .addContainerGap())
        );

        botoesPanel.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        gerarButton.setText("Gerar");
        gerarButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        gerarButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                gerarRelatorio(evt);
            }
        });

        jLabel1.setText("*Você pode gerar um relatório completo se não preencher os campos");

        javax.swing.GroupLayout botoesPanelLayout = new javax.swing.GroupLayout(botoesPanel);
        botoesPanel.setLayout(botoesPanelLayout);
        botoesPanelLayout.setHorizontalGroup(
            botoesPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, botoesPanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(gerarButton, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(botoesPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 490, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        botoesPanelLayout.setVerticalGroup(
            botoesPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, botoesPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 28, Short.MAX_VALUE)
                .addComponent(gerarButton)
                .addContainerGap())
        );

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
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(SairButton))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(relatorioPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(botoesPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addGap(22, 22, 22))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(SairButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(relatorioPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(botoesPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void SairButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SairButtonActionPerformed
        this.dispose();
    }//GEN-LAST:event_SairButtonActionPerformed

    private void gerarRelatorio(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_gerarRelatorio
        String mensagem_erro = ObterRelatorioInformafo();
        if(mensagem_erro==null) controlador.gerarRelatorioGeral();
    }//GEN-LAST:event_gerarRelatorio
    
    private String ObterRelatorioInformafo() {
      String mensagem_erro = null;
      String nome = nomeTextField.getText(),marca=marcaTextField.getText(),
              codigo = codigoTextField.getText();
      Boolean iscomprar = comprarRadioButton.isSelected();
      int categoria = categoriaComboBox.getSelectedIndex();
        
      if(nome.isEmpty() && codigo.isEmpty() && categoria<0 && marca.isEmpty() && iscomprar==false)
          return mensagem_erro;
      if(!(nome.isEmpty() && codigo.isEmpty() && categoria<0 && marca.isEmpty() && iscomprar==false)) return "tudo";
      
      if(nome.isEmpty() && codigo.isEmpty() && categoria<0 && marca.isEmpty() && iscomprar==true) return "comprar";
          
          
      return mensagem_erro;
    }
  
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton SairButton;
    private javax.swing.JPanel botoesPanel;
    private javax.swing.JComboBox<String> categoriaComboBox;
    private javax.swing.JLabel categoriaLabel;
    private javax.swing.JLabel codigoLabel;
    private javax.swing.JTextField codigoTextField;
    private javax.swing.JRadioButton comprarRadioButton;
    private javax.swing.JButton gerarButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel marcaLabel;
    private javax.swing.JTextField marcaTextField;
    private javax.swing.JLabel nomeLabel;
    private javax.swing.JTextField nomeTextField;
    private javax.swing.JPanel relatorioPanel;
    // End of variables declaration//GEN-END:variables

}
