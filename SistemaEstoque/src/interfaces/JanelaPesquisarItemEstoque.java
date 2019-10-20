
package interfaces;

import entidade.ItemEstoque;
import entidade.Produto;
import entidade.Visão;
import java.util.Vector;
import javax.swing.DefaultComboBoxModel;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;


public class JanelaPesquisarItemEstoque extends javax.swing.JFrame {

    private DefaultListModel filtro;
    private DefaultListModel geral;
    public JanelaPesquisarItemEstoque() {
        initComponents();
        inicializarFiltro();
        contratoComboBox.setSelectedIndex(-1);
        categoriaComboBox.setSelectedIndex(-1);
        this.setLocationRelativeTo(null);//<--comando para que a Janela apareça Centralizado na Tela  
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        radionbuttonGroup = new javax.swing.ButtonGroup();
        pesuisaPanel = new javax.swing.JPanel();
        contratoLabel = new javax.swing.JLabel();
        contratoComboBox = new javax.swing.JComboBox<>();
        fornecedorLabel = new javax.swing.JLabel();
        nome_fornecedorTextField = new javax.swing.JTextField();
        precisa_comprarRadioButton = new javax.swing.JRadioButton();
        nao_comprarRadioButton = new javax.swing.JRadioButton();
        categoriaLabel = new javax.swing.JLabel();
        categoriaComboBox = new javax.swing.JComboBox<>();
        botoesPanel = new javax.swing.JPanel();
        pesquisar_geralButton = new javax.swing.JButton();
        pesquisarButton = new javax.swing.JButton();
        limparButton = new javax.swing.JButton();
        filtroScrollPane = new javax.swing.JScrollPane();
        filtroList = new javax.swing.JList<>();
        filtro_geralScrollPane = new javax.swing.JScrollPane();
        geralList = new javax.swing.JList<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Pesquisa");
        setResizable(false);

        pesuisaPanel.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Pesquisa", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Dialog", 0, 12), java.awt.Color.blue)); // NOI18N

        contratoLabel.setText("Tipo de Contrato:");

        contratoComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Contrato", "Licitação" }));

        fornecedorLabel.setText("Nome do Fornecedor: ");

        radionbuttonGroup.add(precisa_comprarRadioButton);
        precisa_comprarRadioButton.setText("Precisa Comprar");

        radionbuttonGroup.add(nao_comprarRadioButton);
        nao_comprarRadioButton.setText("Não Precisa Comprar");

        categoriaLabel.setText("Categoria do Produto: ");

        categoriaComboBox.setModel(new DefaultComboBoxModel (Produto.categorias));

        javax.swing.GroupLayout pesuisaPanelLayout = new javax.swing.GroupLayout(pesuisaPanel);
        pesuisaPanel.setLayout(pesuisaPanelLayout);
        pesuisaPanelLayout.setHorizontalGroup(
            pesuisaPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pesuisaPanelLayout.createSequentialGroup()
                .addContainerGap(152, Short.MAX_VALUE)
                .addGroup(pesuisaPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pesuisaPanelLayout.createSequentialGroup()
                        .addComponent(precisa_comprarRadioButton)
                        .addGap(12, 12, 12)
                        .addComponent(nao_comprarRadioButton))
                    .addGroup(pesuisaPanelLayout.createSequentialGroup()
                        .addComponent(contratoLabel)
                        .addGap(44, 44, 44)
                        .addComponent(contratoComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pesuisaPanelLayout.createSequentialGroup()
                        .addGroup(pesuisaPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(fornecedorLabel)
                            .addComponent(categoriaLabel))
                        .addGap(8, 8, 8)
                        .addGroup(pesuisaPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(categoriaComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 235, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(nome_fornecedorTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 432, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(71, 71, 71))
        );
        pesuisaPanelLayout.setVerticalGroup(
            pesuisaPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pesuisaPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pesuisaPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(precisa_comprarRadioButton)
                    .addComponent(nao_comprarRadioButton))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pesuisaPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(categoriaLabel)
                    .addComponent(categoriaComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addGroup(pesuisaPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pesuisaPanelLayout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(fornecedorLabel))
                    .addComponent(nome_fornecedorTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(6, 6, 6)
                .addGroup(pesuisaPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pesuisaPanelLayout.createSequentialGroup()
                        .addGap(5, 5, 5)
                        .addComponent(contratoLabel))
                    .addComponent(contratoComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        botoesPanel.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Botões", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Dialog", 0, 12), java.awt.Color.blue)); // NOI18N

        pesquisar_geralButton.setText("Mostrar Todos os Itens");
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
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(pesquisar_geralButton)
                .addContainerGap())
        );
        botoesPanelLayout.setVerticalGroup(
            botoesPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(botoesPanelLayout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addGroup(botoesPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pesquisarButton)
                    .addGroup(botoesPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(limparButton)
                        .addComponent(pesquisar_geralButton)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        filtroList.setModel(new DefaultListModel());
        filtroScrollPane.setViewportView(filtroList);

        geralList.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Todos os Produtos", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Dialog", 0, 12), new java.awt.Color(0, 96, 255))); // NOI18N
        geralList.setModel(new DefaultListModel());
        filtro_geralScrollPane.setViewportView(geralList);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(filtroScrollPane)
                    .addComponent(botoesPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(filtro_geralScrollPane)
                    .addComponent(pesuisaPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pesuisaPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(filtroScrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(botoesPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(filtro_geralScrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void pesquisarButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pesquisarButtonActionPerformed
        Vector<Visão<Integer>> visões = new Vector<Visão<Integer>>();
        int precisa_comprar = -1;
        if(precisa_comprarRadioButton.isSelected()) precisa_comprar = 1;
        if(nao_comprarRadioButton.isSelected()) precisa_comprar = 0;
        
        int categoria1 = -1;

        if (categoriaComboBox.getSelectedIndex()>=0) 
             categoria1 = categoriaComboBox.getSelectedIndex();

        
            visões = ItemEstoque.getVisõesFiltradas(precisa_comprar,categoria1,
                    nome_fornecedorTextField.getText(),contratoComboBox.getSelectedIndex());
            if(visões!=null){
                filtro.removeAllElements();
                for (Visão<Integer> visão : visões){
                    filtro.addElement(visão);
                    filtro.addElement("\n");
                }
            }else{
                JOptionPane.showMessageDialog(this, "Erro ao buscar visão", "ERRO", JOptionPane.ERROR_MESSAGE);
            }
    }//GEN-LAST:event_pesquisarButtonActionPerformed

    private void pesquisar_geralButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pesquisar_geralButtonActionPerformed
        //filtro.removeAllElements();
        Vector<Visão<Integer>> visões = null;
        visões = ItemEstoque.getVisõesFiltradas(-1,-1,"",3);
       
        if (visões == null) {
            geral.removeAllElements();
        } else {
            geral.removeAllElements();
            for (Visão<Integer> visão : visões) {
                geral.addElement(visão);
                geral.addElement("\n");
            }  
        }
    }//GEN-LAST:event_pesquisar_geralButtonActionPerformed

    private void limparButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_limparButtonActionPerformed
        nome_fornecedorTextField.setText("");
        contratoComboBox.setSelectedIndex(-1);
        precisa_comprarRadioButton.setSelected(false);
        nao_comprarRadioButton.setSelected(false);
        filtro.removeAllElements();
        geral.removeAllElements();
        radionbuttonGroup.clearSelection();
        categoriaComboBox.setSelectedIndex(-1);
    }//GEN-LAST:event_limparButtonActionPerformed
    
    
    private void inicializarFiltro() {
        geral = (DefaultListModel) geralList.getModel();
        filtro = (DefaultListModel) filtroList.getModel();
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel botoesPanel;
    private javax.swing.JComboBox<String> categoriaComboBox;
    private javax.swing.JLabel categoriaLabel;
    private javax.swing.JComboBox<String> contratoComboBox;
    private javax.swing.JLabel contratoLabel;
    private javax.swing.JList<String> filtroList;
    private javax.swing.JScrollPane filtroScrollPane;
    private javax.swing.JScrollPane filtro_geralScrollPane;
    private javax.swing.JLabel fornecedorLabel;
    private javax.swing.JList<String> geralList;
    private javax.swing.JButton limparButton;
    private javax.swing.JRadioButton nao_comprarRadioButton;
    private javax.swing.JTextField nome_fornecedorTextField;
    private javax.swing.JButton pesquisarButton;
    private javax.swing.JButton pesquisar_geralButton;
    private javax.swing.JPanel pesuisaPanel;
    private javax.swing.JRadioButton precisa_comprarRadioButton;
    private javax.swing.ButtonGroup radionbuttonGroup;
    // End of variables declaration//GEN-END:variables

}
