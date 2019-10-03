
package interfaces;

import controle.ControladorCadastroItemEstoque;
import entidade.ItemEstoque;
import entidade.Fornecedor;
import entidade.Produto;
import entidade.Visão;
import java.util.Vector;
import javax.swing.DefaultComboBoxModel;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;
import persistência.BD;


public class JanelaCadastroItemEstoque extends javax.swing.JFrame {
    private static Vector<Visão<Integer>> produtos_cadastrados = new Vector<Visão<Integer>>();
    private static Vector<Visão<String>> fornecedores_cadastrados = new Vector<Visão<String>>();
    private static DefaultListModel estoques_cadastrados;
    private static ControladorCadastroItemEstoque controlador;
    
    
    public JanelaCadastroItemEstoque(ControladorCadastroItemEstoque controlador) {
        this.controlador = controlador;
        produtos_cadastrados = Produto.getVisões();
        fornecedores_cadastrados = Fornecedor.getVisões();
        initComponents();
        fornecedores_cadastradosComboBox.setSelectedIndex(-1);
        produtos_cadastradosComboBox.setSelectedIndex(-1);
        inicializarEstoquesCadastrados();
        this.setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        BotõesPanel = new javax.swing.JPanel();
        InserirButton = new javax.swing.JButton();
        consultarButton = new javax.swing.JButton();
        AlterarButton = new javax.swing.JButton();
        removerButton = new javax.swing.JButton();
        limparButton = new javax.swing.JButton();
        formulário_EstoquePanel = new javax.swing.JPanel();
        produtosLabel = new javax.swing.JLabel();
        fornecedoresLabel = new javax.swing.JLabel();
        produtos_cadastradosComboBox = new javax.swing.JComboBox();
        fornecedores_cadastradosComboBox = new javax.swing.JComboBox();
        identificador_sequencialLabel = new javax.swing.JLabel();
        identificador_sequencialTextField = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        estoques_cadastradosList = new javax.swing.JList();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        BotõesPanel.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        BotõesPanel.setLayout(new java.awt.GridBagLayout());

        InserirButton.setText("Inserir");
        InserirButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        InserirButton.setFocusPainted(false);
        InserirButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                InserirEstoque(evt);
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
                consultarEstoque(evt);
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
                alterarEstoque(evt);
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
                removerEstoque(evt);
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
                limparEstoque(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 4;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(17, 6, 0, 12);
        BotõesPanel.add(limparButton, gridBagConstraints);

        formulário_EstoquePanel.setBorder(javax.swing.BorderFactory.createTitledBorder("Formulário"));
        formulário_EstoquePanel.setLayout(new java.awt.GridBagLayout());

        produtosLabel.setText("Produtos Cadastrados:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(9, 39, 0, 0);
        formulário_EstoquePanel.add(produtosLabel, gridBagConstraints);

        fornecedoresLabel.setText("Fornecedores Cadastrados:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 5;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(14, 16, 0, 0);
        formulário_EstoquePanel.add(fornecedoresLabel, gridBagConstraints);

        produtos_cadastradosComboBox.setModel(new DefaultComboBoxModel (produtos_cadastrados));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(6, 9, 0, 0);
        formulário_EstoquePanel.add(produtos_cadastradosComboBox, gridBagConstraints);

        fornecedores_cadastradosComboBox.setModel(new DefaultComboBoxModel (fornecedores_cadastrados));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 5;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(11, 9, 31, 0);
        formulário_EstoquePanel.add(fornecedores_cadastradosComboBox, gridBagConstraints);

        identificador_sequencialLabel.setText("Identificador Sequencial");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(9, 36, 0, 0);
        formulário_EstoquePanel.add(identificador_sequencialLabel, gridBagConstraints);

        identificador_sequencialTextField.setEditable(false);
        identificador_sequencialTextField.setColumns(5);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.ipadx = 21;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(6, 10, 0, 0);
        formulário_EstoquePanel.add(identificador_sequencialTextField, gridBagConstraints);

        estoques_cadastradosList.setModel(new DefaultListModel());
        estoques_cadastradosList.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jScrollPane1.setViewportView(estoques_cadastradosList);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridwidth = 4;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.ipadx = 235;
        gridBagConstraints.ipady = 107;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(27, 59, 0, 79);
        formulário_EstoquePanel.add(jScrollPane1, gridBagConstraints);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(BotõesPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(formulário_EstoquePanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(48, 48, 48)
                .addComponent(formulário_EstoquePanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(BotõesPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void InserirEstoque(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_InserirEstoque
        String menssagem_erro = null;
        ItemEstoque estoque = obterEstoqueParaInserir();
        if (estoque != null) {
            menssagem_erro = controlador.inserirEstoque(estoque);
        } else {
            menssagem_erro = "Sequencial já cadastrado";
        }
        if (menssagem_erro == null) {
            Visão<Integer> visão = estoque.getVisão();
            estoques_cadastrados.addElement(visão);
            estoques_cadastradosList.ensureIndexIsVisible(estoques_cadastrados.getSize());
            identificador_sequencialTextField.setText(estoque.getSequencial() + "");
            limparEstoque();
        } else {
            JOptionPane.showMessageDialog(this, menssagem_erro, "ERRO", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_InserirEstoque

    private void consultarEstoque(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_consultarEstoque
        Visão<Integer> visão;
        ItemEstoque estoque = null;
        String mensagem_erro = null;
        if (estoques_cadastradosList.getSelectedValue() != null) {
            visão = (Visão<Integer>) estoques_cadastradosList.getSelectedValue();
            estoque = ItemEstoque.consultarEstoque(visão.getChave());
            if (estoque == null) {
                mensagem_erro = "Estoque não encontrado no banco de dados";
            }
        } else {
            mensagem_erro = "Nenhum Estoque selecionado";
        }
        if (mensagem_erro == null) {
            Visão<String> visão1 = getFornecedoresCadastradosVisão(estoque.getFornecedor().getCnpj());
            visão = getProdutosCadastradosVisão(estoque.getProduto().getSequencial());
            identificador_sequencialTextField.setText(estoque.getSequencial() + "");
            fornecedores_cadastradosComboBox.setSelectedItem(visão1);
            produtos_cadastradosComboBox.setSelectedItem(visão);
        } else {
            JOptionPane.showMessageDialog(this, mensagem_erro, "ERRO", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_consultarEstoque

    private void alterarEstoque(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_alterarEstoque
        String menssagem_erro = null;
        ItemEstoque estoque = obterEstoque();
        if(estoque != null){
            menssagem_erro = controlador.alterarEstoque(estoque);
        } else {
            menssagem_erro = "Algum campo não está preenchido";
        }
        if(menssagem_erro == null){
            Visão<Integer> visão = getEstoquesCadastradosVisão(estoque.getSequencial());
            visão.setInfo(estoque.getVisão().getInfo());
            estoques_cadastradosList.updateUI();
            estoques_cadastradosList.ensureIndexIsVisible(estoques_cadastrados.getSize());            
        } else {
            JOptionPane.showMessageDialog(this,menssagem_erro,"ERRO",JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_alterarEstoque

    private void removerEstoque(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_removerEstoque
        String menssagem_erro = null;
        Visão<Integer> visão = null;
        if (estoques_cadastradosList.getSelectedValue() != null){
            visão = (Visão<Integer>) estoques_cadastradosList.getSelectedValue();
            menssagem_erro = controlador.removerEstoque(visão.getChave());
        } else {
            menssagem_erro = "Nenhum produto foi selecionado";
        }
        if (menssagem_erro == null) {
            estoques_cadastrados.removeElement(visão);
            limparEstoque();
            if (estoques_cadastrados.size() > 0) {
                estoques_cadastradosList.ensureIndexIsVisible(0);
            }
        } else {
            JOptionPane.showMessageDialog(this, menssagem_erro, "ERRO", JOptionPane.ERROR_MESSAGE);
        } 
    }//GEN-LAST:event_removerEstoque

    private void limparEstoque(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_limparEstoque
        identificador_sequencialTextField.setText("");
        produtos_cadastradosComboBox.setSelectedIndex(-1);
        fornecedores_cadastradosComboBox.setSelectedIndex(-1);
    }//GEN-LAST:event_limparEstoque
    
    private void limparEstoque() {                               
        identificador_sequencialTextField.setText("");
        produtos_cadastradosComboBox.setSelectedIndex(-1);
        fornecedores_cadastradosComboBox.setSelectedIndex(-1);
    } 
     
    private ItemEstoque obterEstoque() {
        int identificador_sequencial;
        if (identificador_sequencialTextField.getText().isEmpty()) {
            identificador_sequencial = 0;
            return null;
        } else {
            identificador_sequencial = Integer.parseInt(identificador_sequencialTextField.getText());
        }
        Produto produto = null;
        if (produtos_cadastradosComboBox.getSelectedItem() == null) {
            return null;
        } else {
            Visão<Integer> visão = (Visão<Integer>) produtos_cadastradosComboBox.getSelectedItem();
            produto = Produto.buscarItem(visão.getChave());
        }
       Fornecedor fornecedor = null;
        if (fornecedores_cadastradosComboBox.getSelectedItem() == null) {
            return null;
        } else {
            Visão<String> visão = (Visão<String>) fornecedores_cadastradosComboBox.getSelectedItem();
            fornecedor = Fornecedor.buscarFornecedor(visão.getChave());
        }
        return new ItemEstoque(identificador_sequencial, produto, fornecedor);
    }
    
    private ItemEstoque obterEstoqueParaInserir() {
        int identificador_sequencial;
        if (identificador_sequencialTextField.getText().isEmpty()) {
            identificador_sequencial = 0;
        } else {
            return null;
        }
        Produto produto = null;
        if (produtos_cadastradosComboBox.getSelectedItem() == null) {
            return null;
        } else {
            Visão<Integer> visão = (Visão<Integer>) produtos_cadastradosComboBox.getSelectedItem();
            produto = Produto.buscarItem(visão.getChave());
        }
       Fornecedor fornecedor = null;
        if (fornecedores_cadastradosComboBox.getSelectedItem() == null) {
            return null;
        } else {
            Visão<String> visão = (Visão<String>) fornecedores_cadastradosComboBox.getSelectedItem();
            fornecedor = Fornecedor.buscarFornecedor(visão.getChave());
        }
        return new ItemEstoque(identificador_sequencial, produto, fornecedor);
    }
    
    private void inicializarEstoquesCadastrados() {
        estoques_cadastrados = (DefaultListModel) estoques_cadastradosList.getModel();
        Vector<Visão<Integer>> visões = ItemEstoque.getVisões();
        for (Visão<Integer> visão : visões) {
           estoques_cadastrados.addElement(visão);
        }
    }
    
    private Visão<String> getFornecedoresCadastradosVisão(String cnpj) {
        for (Visão<String> visão : fornecedores_cadastrados) {
            if (visão.getChave().equals(cnpj)) {
                return visão;
            }
        }
        return null;
    }
    
    private Visão<Integer> getProdutosCadastradosVisão(int sequencial_produto) {
        for (Visão<Integer> visão : produtos_cadastrados) {
            if (visão.getChave() == sequencial_produto) {
                return visão;
            }
        }
        return null;
    }
    
    private Visão<Integer> getEstoquesCadastradosVisão(int sequencial) {
        //TODO
        for (int i = 0; i < estoques_cadastrados.getSize(); i++) {
            Visão<Integer> visão = (Visão<Integer>) estoques_cadastrados.getElementAt(i);
            if (visão.getChave() == sequencial) {
                return visão;
            }
        }
        return null;
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AlterarButton;
    private javax.swing.JPanel BotõesPanel;
    private javax.swing.JButton InserirButton;
    private javax.swing.JButton consultarButton;
    private javax.swing.JList estoques_cadastradosList;
    private javax.swing.JPanel formulário_EstoquePanel;
    private javax.swing.JLabel fornecedoresLabel;
    private javax.swing.JComboBox fornecedores_cadastradosComboBox;
    private javax.swing.JLabel identificador_sequencialLabel;
    private javax.swing.JTextField identificador_sequencialTextField;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton limparButton;
    private javax.swing.JLabel produtosLabel;
    private javax.swing.JComboBox produtos_cadastradosComboBox;
    private javax.swing.JButton removerButton;
    // End of variables declaration//GEN-END:variables
}
