
package interfaces;

import entidade.ItemEstoque;
import entidade.Visão;
import java.util.Vector;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;


public class JanelaPesquisarItemEstoque extends javax.swing.JFrame {

    private DefaultListModel filtro;
    public JanelaPesquisarItemEstoque() {
        initComponents();
        contratoComboBox.setSelectedIndex(-1);
        inicializarFiltro();
        this.setLocationRelativeTo(null);//<--comando para que a Janela apareça Centralizado na Tela  
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        pesuisaPanel = new javax.swing.JPanel();
        comprarCheckBox = new javax.swing.JCheckBox();
        nomeLabel = new javax.swing.JLabel();
        nome_produtoTextField = new javax.swing.JTextField();
        contratoLabel = new javax.swing.JLabel();
        contratoComboBox = new javax.swing.JComboBox<>();
        fornecedorLabel = new javax.swing.JLabel();
        nome_fornecedorTextField = new javax.swing.JTextField();
        botoesPanel = new javax.swing.JPanel();
        pesquisar_geralButton = new javax.swing.JButton();
        pesquisarButton = new javax.swing.JButton();
        limparButton = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        filtroList = new javax.swing.JList<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Pesquisa");
        setResizable(false);

        pesuisaPanel.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Pesquisa", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Dialog", 0, 12), java.awt.Color.blue)); // NOI18N
        pesuisaPanel.setLayout(new java.awt.GridBagLayout());

        comprarCheckBox.setText("Produtos que precisam comprar");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridwidth = 4;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(47, 18, 0, 0);
        pesuisaPanel.add(comprarCheckBox, gridBagConstraints);

        nomeLabel.setText("Nome do Produto:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(17, 18, 0, 0);
        pesuisaPanel.add(nomeLabel, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.gridwidth = 6;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.ipadx = 421;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(12, 12, 0, 18);
        pesuisaPanel.add(nome_produtoTextField, gridBagConstraints);

        contratoLabel.setText("Tipo de Contrato:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(11, 18, 0, 0);
        pesuisaPanel.add(contratoLabel, gridBagConstraints);

        contratoComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Contrato", "Licitação" }));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.gridwidth = 5;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.ipadx = 84;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(6, 12, 21, 0);
        pesuisaPanel.add(contratoComboBox, gridBagConstraints);

        fornecedorLabel.setText("Nome do Fornecedor: ");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(16, 18, 0, 0);
        pesuisaPanel.add(fornecedorLabel, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.gridwidth = 6;
        gridBagConstraints.ipadx = 421;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(6, 12, 0, 18);
        pesuisaPanel.add(nome_fornecedorTextField, gridBagConstraints);

        botoesPanel.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Botões", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Dialog", 0, 12), java.awt.Color.blue)); // NOI18N

        pesquisar_geralButton.setText("Pesquisar todos Itens");
        pesquisar_geralButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        pesquisar_geralButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pesquisar_geralButtonActionPerformed(evt);
            }
        });

        pesquisarButton.setText("Pesquisar");
        pesquisarButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        pesquisarButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pesquisarButtonActionPerformed(evt);
            }
        });

        limparButton.setText("Limpar");
        limparButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        limparButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                limparButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout botoesPanelLayout = new javax.swing.GroupLayout(botoesPanel);
        botoesPanel.setLayout(botoesPanelLayout);
        botoesPanelLayout.setHorizontalGroup(
            botoesPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(botoesPanelLayout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(pesquisarButton)
                .addGap(6, 6, 6)
                .addComponent(limparButton)
                .addGap(303, 303, 303)
                .addComponent(pesquisar_geralButton)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        botoesPanelLayout.setVerticalGroup(
            botoesPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(botoesPanelLayout.createSequentialGroup()
                .addGap(92, 92, 92)
                .addGroup(botoesPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pesquisarButton)
                    .addComponent(limparButton)
                    .addComponent(pesquisar_geralButton))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        filtroList.setModel(new DefaultListModel());
        jScrollPane1.setViewportView(filtroList);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(pesuisaPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane1)
                    .addComponent(botoesPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(50, 50, 50))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addComponent(pesuisaPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(6, 6, 6)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(botoesPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(20, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void pesquisarButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pesquisarButtonActionPerformed
        Vector<Visão<Integer>> visões = new Vector<Visão<Integer>>();
        
        if(!(comprarCheckBox.isSelected()==false && nome_produtoTextField.getText().isEmpty() &&
                nome_fornecedorTextField.getText().isEmpty() && contratoComboBox.getSelectedIndex() == -1))
        {
            visões = ItemEstoque.getVisõesFiltradas(comprarCheckBox.isSelected(),nome_produtoTextField.getText(),
                    nome_fornecedorTextField.getText(),contratoComboBox.getSelectedIndex());
            filtro.removeAllElements();
            if(visões!=null)
            for (Visão<Integer> visão : visões) {
                filtro.addElement(visão);
            }
        }else
            JOptionPane.showMessageDialog(this, "Todos os campos estão vazios, se desejar realizar uma pesquisa"
                    + " geral, por favor clique em 'Pesquisar todos os Itens'", "ALERTA", JOptionPane.ERROR_MESSAGE);
            
            

    }//GEN-LAST:event_pesquisarButtonActionPerformed

    private void pesquisar_geralButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pesquisar_geralButtonActionPerformed
        filtro.removeAllElements();
        Vector<Visão<Integer>> visões = null;
        visões = ItemEstoque.getVisõesFiltradas(comprarCheckBox.isSelected(),nome_produtoTextField.getText(),
                    nome_fornecedorTextField.getText(),contratoComboBox.getSelectedIndex());
       
        if (visões == null) {
            filtro.removeAllElements();
        } else {
            filtro.removeAllElements();
            for (Visão<Integer> visão : visões) {
                filtro.addElement(visão);
            }
        }
    }//GEN-LAST:event_pesquisar_geralButtonActionPerformed

    private void limparButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_limparButtonActionPerformed
        nome_produtoTextField.setText("");
        nome_fornecedorTextField.setText("");
        contratoComboBox.setSelectedIndex(-1);
        comprarCheckBox.setSelected(false);
        filtro.removeAllElements();
    }//GEN-LAST:event_limparButtonActionPerformed
    
    
    private void inicializarFiltro() {
        filtro = (DefaultListModel) filtroList.getModel();
        Vector<Visão<Integer>> visões = ItemEstoque.getVisões();
        for (Visão<Integer> visão : visões) {
            filtro.addElement(visão);
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel botoesPanel;
    private javax.swing.JCheckBox comprarCheckBox;
    private javax.swing.JComboBox<String> contratoComboBox;
    private javax.swing.JLabel contratoLabel;
    private javax.swing.JList<String> filtroList;
    private javax.swing.JLabel fornecedorLabel;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton limparButton;
    private javax.swing.JLabel nomeLabel;
    private javax.swing.JTextField nome_fornecedorTextField;
    private javax.swing.JTextField nome_produtoTextField;
    private javax.swing.JButton pesquisarButton;
    private javax.swing.JButton pesquisar_geralButton;
    private javax.swing.JPanel pesuisaPanel;
    // End of variables declaration//GEN-END:variables

}
