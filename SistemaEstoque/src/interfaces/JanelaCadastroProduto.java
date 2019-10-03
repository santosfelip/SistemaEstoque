
package interfaces;

import controle.ControladorCadastroProduto;
import entidade.Produto;
import entidade.Visão;
import java.util.Vector;
import javax.swing.JOptionPane;
import javax.swing.DefaultComboBoxModel;

public class JanelaCadastroProduto extends javax.swing.JFrame {

    ControladorCadastroProduto controlador;
    Vector<Visão<Integer>> itens_cadastrados;
    
    public JanelaCadastroProduto(ControladorCadastroProduto controlador) {
        this.controlador = controlador;
        itens_cadastrados = Produto.getVisões();
        initComponents();
        this.setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        CadastroItemPanel = new javax.swing.JPanel();
        ProdutosCadastradosLabel = new javax.swing.JLabel();
        itens_cadastradosComboBox = new javax.swing.JComboBox();
        NomeItemLabel = new javax.swing.JLabel();
        códigoBarraLabel = new javax.swing.JLabel();
        EstoqueLabel = new javax.swing.JLabel();
        MarcaLabel = new javax.swing.JLabel();
        Valor_UnitarioLabel = new javax.swing.JLabel();
        categorialLabel = new javax.swing.JLabel();
        NomeItemTextField = new javax.swing.JTextField();
        Código_barrasItemTextField = new javax.swing.JTextField();
        EstoqueItemTextField = new javax.swing.JTextField();
        MarcaTextField = new javax.swing.JTextField();
        valor_unitárioTextField = new javax.swing.JTextField();
        CategoriaItemTextField = new javax.swing.JTextField();
        IdentificadorLabel = new javax.swing.JLabel();
        sequencialTextField = new javax.swing.JTextField();
        valorTotalLabel = new javax.swing.JLabel();
        valorTotalTextField = new javax.swing.JTextField();
        BotõesPanel = new javax.swing.JPanel();
        InserirButton = new javax.swing.JButton();
        consultarButton = new javax.swing.JButton();
        AlterarButton = new javax.swing.JButton();
        removerButton = new javax.swing.JButton();
        limparButton = new javax.swing.JButton();
        SairButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        CadastroItemPanel.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Formulário", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 11), new java.awt.Color(51, 102, 255))); // NOI18N
        CadastroItemPanel.setLayout(new java.awt.GridBagLayout());

        ProdutosCadastradosLabel.setText("Produtos Cadastrados:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(78, 54, 0, 0);
        CadastroItemPanel.add(ProdutosCadastradosLabel, gridBagConstraints);

        itens_cadastradosComboBox.setModel(new DefaultComboBoxModel(itens_cadastrados));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(75, 20, 0, 0);
        CadastroItemPanel.add(itens_cadastradosComboBox, gridBagConstraints);

        NomeItemLabel.setText("Nome do Produto:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(9, 78, 0, 0);
        CadastroItemPanel.add(NomeItemLabel, gridBagConstraints);

        códigoBarraLabel.setText("Código de Barras:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(13, 79, 0, 0);
        CadastroItemPanel.add(códigoBarraLabel, gridBagConstraints);

        EstoqueLabel.setText("Quantidade:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 6;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(9, 105, 0, 0);
        CadastroItemPanel.add(EstoqueLabel, gridBagConstraints);

        MarcaLabel.setText("Marca:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 8;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(9, 132, 0, 0);
        CadastroItemPanel.add(MarcaLabel, gridBagConstraints);

        Valor_UnitarioLabel.setText("Valor Unitário:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 10;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(9, 97, 0, 0);
        CadastroItemPanel.add(Valor_UnitarioLabel, gridBagConstraints);

        categorialLabel.setText("Categoria:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 12;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(9, 114, 0, 0);
        CadastroItemPanel.add(categorialLabel, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.gridwidth = 5;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.ipadx = 315;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(6, 18, 0, 0);
        CadastroItemPanel.add(NomeItemTextField, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.gridwidth = 6;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.ipadx = 315;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(10, 20, 0, 62);
        CadastroItemPanel.add(Código_barrasItemTextField, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 6;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.ipadx = 83;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(6, 20, 0, 0);
        CadastroItemPanel.add(EstoqueItemTextField, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 8;
        gridBagConstraints.gridwidth = 6;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.ipadx = 315;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(6, 20, 0, 62);
        CadastroItemPanel.add(MarcaTextField, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 10;
        gridBagConstraints.gridwidth = 4;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.ipadx = 85;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(6, 20, 0, 0);
        CadastroItemPanel.add(valor_unitárioTextField, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 12;
        gridBagConstraints.gridwidth = 4;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.ipadx = 85;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(6, 20, 0, 0);
        CadastroItemPanel.add(CategoriaItemTextField, gridBagConstraints);

        IdentificadorLabel.setText("Identificador Sequencial: ");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 14;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(9, 43, 0, 0);
        CadastroItemPanel.add(IdentificadorLabel, gridBagConstraints);

        sequencialTextField.setEditable(false);
        sequencialTextField.setColumns(5);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 14;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.ipadx = 80;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(6, 18, 0, 0);
        CadastroItemPanel.add(sequencialTextField, gridBagConstraints);

        valorTotalLabel.setText("Valor Total:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 16;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(9, 110, 0, 0);
        CadastroItemPanel.add(valorTotalLabel, gridBagConstraints);

        valorTotalTextField.setEditable(false);
        valorTotalTextField.setColumns(5);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 16;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.ipadx = 80;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(6, 18, 7, 0);
        CadastroItemPanel.add(valorTotalTextField, gridBagConstraints);

        BotõesPanel.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        BotõesPanel.setLayout(new java.awt.GridBagLayout());

        InserirButton.setText("Inserir");
        InserirButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        InserirButton.setFocusPainted(false);
        InserirButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inserirItem(evt);
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
                consultarItem(evt);
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
                alterarItem(evt);
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
                removerItem(evt);
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
                    .addComponent(BotõesPanel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(CadastroItemPanel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(SairButton)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(SairButton)
                .addGap(3, 3, 3)
                .addComponent(CadastroItemPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(BotõesPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    
    private void inserirItem(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inserirItem
        Produto produto = obterItemInformado();
        String menssagem_erro = null;
        if (produto != null) {
            menssagem_erro = controlador.inserirItem(produto);
        } else {
            menssagem_erro = "Algum campo não foi preenchido";
        }
        if (menssagem_erro == null) {
            Visão<Integer> visão = produto.getVisão();
            itens_cadastrados.addElement(visão);
            itens_cadastradosComboBox.setSelectedItem(visão);
            sequencialTextField.setText(produto.getSequencial()+ "");
            valorTotalTextField.setText(produto.getValorTotal()+ "");    
        } else {
            JOptionPane.showMessageDialog(this, menssagem_erro, "ERRO", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_inserirItem

    private void consultarItem(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_consultarItem
        Visão<Integer> visão = (Visão<Integer>) itens_cadastradosComboBox.getSelectedItem ();
        Produto item = null;
        String mensagem_erro = null;
        if (visão != null) {
            item = Produto.buscarItem (visão.getChave());
            if (item == null) mensagem_erro = "Item não cadastrado";
        } else mensagem_erro = "Nenhum Item selecionado";
        if (mensagem_erro == null) {
            NomeItemTextField.setText (item.getNome());
            Código_barrasItemTextField.setText(item.getCódigo_barras());
            MarcaTextField.setText(item.getMarca());
            CategoriaItemTextField.setText(item.getCentroCusto());
            EstoqueItemTextField.setText(Integer.toString(item.getQuantEstoque()));
            valor_unitárioTextField.setText(Double.toString(item.getValorUnidade()));
            sequencialTextField.setText(item.getSequencial()+ "");
            valorTotalTextField.setText(item.getValorTotal()+ "");
        } else JOptionPane.showMessageDialog
        (this, mensagem_erro, "ERRO", JOptionPane.ERROR_MESSAGE);
    }//GEN-LAST:event_consultarItem

    private void alterarItem(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_alterarItem
        Produto item = obterItemInformado();
        String mensagem_erro = null;
        if (item != null) mensagem_erro = controlador.alterarItem(item);
        else mensagem_erro = "Algum atributo do produto não foi informado";
        if (mensagem_erro == null) {
            Visão<Integer> visão = getVisãoItemCadastrados(item.getSequencial());
            if (visão != null) {
                visão.setInfo(item.getVisão().getInfo());
                itens_cadastradosComboBox.updateUI();
                itens_cadastradosComboBox.setSelectedItem(visão);
                valorTotalTextField.setText(item.getValorTotal()+ "");
            }
        } else JOptionPane.showMessageDialog(this, mensagem_erro, "ERRO", JOptionPane.ERROR_MESSAGE);
    }//GEN-LAST:event_alterarItem

    private void limparCamposTexto(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_limparCamposTexto
        NomeItemTextField.setText ("");
        Código_barrasItemTextField.setText("");
        MarcaTextField.setText("");
        CategoriaItemTextField.setText("");
        EstoqueItemTextField.setText("");
        valor_unitárioTextField.setText("");
        sequencialTextField.setText("");
        valorTotalTextField.setText("");
    }//GEN-LAST:event_limparCamposTexto
    
    //Método criado para limpar todos os campos após a remoção
    private void limparCamposTexto() {                                   
        NomeItemTextField.setText ("");
        Código_barrasItemTextField.setText("");
        MarcaTextField.setText("");
        CategoriaItemTextField.setText("");
        EstoqueItemTextField.setText("");
        valor_unitárioTextField.setText("");
        sequencialTextField.setText("");
        valorTotalTextField.setText("");
    }
    private void removerItem(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_removerItem
        Visão<Integer> visão
        = (Visão<Integer>) itens_cadastradosComboBox.getSelectedItem ();
        String mensagem_erro = null;
        if (visão != null) mensagem_erro = controlador.removerItem(visão.getChave());
        else mensagem_erro = "Nenhum produto selecionado";
        if (mensagem_erro == null) {
            itens_cadastrados.remove(visão);
            if (itens_cadastrados.size() >= 1)
                itens_cadastradosComboBox.setSelectedIndex(0);
            else itens_cadastradosComboBox.setSelectedIndex(-1);
            
            limparCamposTexto();
        } else {
            JOptionPane.showMessageDialog(this, mensagem_erro, "ERRO", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_removerItem

    private void SairButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SairButtonActionPerformed
        this.dispose();
    }//GEN-LAST:event_SairButtonActionPerformed
    
   
    private Produto obterItemInformado() {
        String auxiliar = "";
        //valores tipo String
        String nome = NomeItemTextField.getText();
        if (nome.isEmpty()) return null;
        
        String código_barras = Código_barrasItemTextField.getText();
        if (código_barras.isEmpty()) return null;
        
        String marca = MarcaTextField.getText();
        if(marca.isEmpty())return null;
        
        String categoria = CategoriaItemTextField.getText();
        if(categoria.isEmpty())return null;
        
        
        //Valores numéricos
        auxiliar = valor_unitárioTextField.getText();    
        if(auxiliar.isEmpty()) return null;
        double valorU = 0;
        try{
            valorU = Double.valueOf(auxiliar);
        }catch(Exception ex){
            System.out.println("Erro ao converter valores");
            return null;
        }
        
        auxiliar = EstoqueItemTextField.getText();
        if(auxiliar.isEmpty()) return null;
        int estoque = 0;
        
        
        try{
        estoque = Integer.valueOf(auxiliar);
        }catch(Exception ex){
            System.out.println("Erro ao converter valores");
            return null;
        }
        if(estoque==0) return null;

        double valorTotal = estoque*valorU;
        if(valorTotal==0)return null;
        
        
        int sequencial;
        if (sequencialTextField.getText().isEmpty()) {
            sequencial = 0;
        } else {
            sequencial = Integer.parseInt(sequencialTextField.getText());
        }
        
        //retorno
        return new Produto(sequencial,código_barras, nome,categoria,marca,estoque,valorU,valorTotal);
    }
    
    private Visão<Integer> getVisãoItemCadastrados(int chave) {
        for (Visão<Integer> visão : itens_cadastrados) {
            if (visão.getChave().equals(chave)) return visão;
        }
        return null;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AlterarButton;
    private javax.swing.JPanel BotõesPanel;
    private javax.swing.JPanel CadastroItemPanel;
    private javax.swing.JTextField CategoriaItemTextField;
    private javax.swing.JTextField Código_barrasItemTextField;
    private javax.swing.JTextField EstoqueItemTextField;
    private javax.swing.JLabel EstoqueLabel;
    private javax.swing.JLabel IdentificadorLabel;
    private javax.swing.JButton InserirButton;
    private javax.swing.JLabel MarcaLabel;
    private javax.swing.JTextField MarcaTextField;
    private javax.swing.JLabel NomeItemLabel;
    private javax.swing.JTextField NomeItemTextField;
    private javax.swing.JLabel ProdutosCadastradosLabel;
    private javax.swing.JButton SairButton;
    private javax.swing.JLabel Valor_UnitarioLabel;
    private javax.swing.JLabel categorialLabel;
    private javax.swing.JButton consultarButton;
    private javax.swing.JLabel códigoBarraLabel;
    private javax.swing.JComboBox itens_cadastradosComboBox;
    private javax.swing.JButton limparButton;
    private javax.swing.JButton removerButton;
    private javax.swing.JTextField sequencialTextField;
    private javax.swing.JLabel valorTotalLabel;
    private javax.swing.JTextField valorTotalTextField;
    private javax.swing.JTextField valor_unitárioTextField;
    // End of variables declaration//GEN-END:variables
}
