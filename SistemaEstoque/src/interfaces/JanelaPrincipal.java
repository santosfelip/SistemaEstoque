
package interfaces;

import controle.ControladorCadastroItemEstoque;
import controle.ControladorCadastroFornecedor;
import controle.ControladorCadastroProduto;
import controle.ControladorRelatorioProdutos;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import net.sf.jasperreports.engine.JRException;
import persistência.BD;

public class JanelaPrincipal extends javax.swing.JFrame {

    
    public JanelaPrincipal() {
        BD.criaConexão();
        initComponents();
        this.setExtendedState(MAXIMIZED_BOTH); this.show();
        this.setLocationRelativeTo(null);//<--comando para que a Janela apareça Centralizado na Tela
    }
    

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        JanelaPrincipalPanel = new javax.swing.JPanel();
        imagem = new javax.swing.JLabel();
        JanelaPrincipalMenuBar = new javax.swing.JMenuBar();
        produtoMenu = new javax.swing.JMenu();
        cadastrar_produtoMenuItem = new javax.swing.JMenuItem();
        FornecedorMenu = new javax.swing.JMenu();
        cadastrar_fornecedorMenuItem = new javax.swing.JMenuItem();
        estoqueMenu = new javax.swing.JMenu();
        cadastrar_itemEstoqueMenuItem = new javax.swing.JMenuItem();
        pesquisarMenuItem = new javax.swing.JMenuItem();
        relatorioMenu = new javax.swing.JMenu();
        gerar_relatorioMenuItem = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Sistema Estoque");
        setForeground(new java.awt.Color(0, 0, 0));
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosed(java.awt.event.WindowEvent evt) {
                terminarSistema(evt);
            }
        });

        JanelaPrincipalPanel.setBackground(java.awt.Color.white);
        JanelaPrincipalPanel.setForeground(new java.awt.Color(204, 204, 204));
        JanelaPrincipalPanel.setToolTipText("");
        JanelaPrincipalPanel.setName(""); // NOI18N
        JanelaPrincipalPanel.setLayout(new java.awt.GridBagLayout());

        imagem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/PREVID.png"))); // NOI18N
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(75, 100, 91, 100);
        JanelaPrincipalPanel.add(imagem, gridBagConstraints);

        JanelaPrincipalMenuBar.setBackground(java.awt.Color.black);
        JanelaPrincipalMenuBar.setBorder(null);
        JanelaPrincipalMenuBar.setForeground(new java.awt.Color(255, 255, 255));
        JanelaPrincipalMenuBar.setBorderPainted(false);
        JanelaPrincipalMenuBar.setDoubleBuffered(true);
        JanelaPrincipalMenuBar.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        JanelaPrincipalMenuBar.setRequestFocusEnabled(false);
        JanelaPrincipalMenuBar.setVerifyInputWhenFocusTarget(false);

        produtoMenu.setBackground(new java.awt.Color(204, 204, 204));
        produtoMenu.setForeground(java.awt.Color.white);
        produtoMenu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/produto.png"))); // NOI18N
        produtoMenu.setText("Produto");
        produtoMenu.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        produtoMenu.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);

        cadastrar_produtoMenuItem.setText("Cadastrar");
        cadastrar_produtoMenuItem.setActionCommand("");
        cadastrar_produtoMenuItem.setAlignmentX(0.0F);
        cadastrar_produtoMenuItem.setAlignmentY(0.0F);
        cadastrar_produtoMenuItem.setBorderPainted(true);
        cadastrar_produtoMenuItem.setContentAreaFilled(false);
        cadastrar_produtoMenuItem.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        cadastrar_produtoMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cadastrar_produtoMenuItemActionPerformed(evt);
            }
        });
        produtoMenu.add(cadastrar_produtoMenuItem);

        JanelaPrincipalMenuBar.add(produtoMenu);

        FornecedorMenu.setForeground(java.awt.Color.white);
        FornecedorMenu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/fornecedor.png"))); // NOI18N
        FornecedorMenu.setText("Fornecedor");
        FornecedorMenu.setToolTipText("");
        FornecedorMenu.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        cadastrar_fornecedorMenuItem.setText("Cadastrar");
        cadastrar_fornecedorMenuItem.setActionCommand("");
        cadastrar_fornecedorMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cadastrar_fornecedorMenuItemActionPerformed(evt);
            }
        });
        FornecedorMenu.add(cadastrar_fornecedorMenuItem);

        JanelaPrincipalMenuBar.add(FornecedorMenu);

        estoqueMenu.setBackground(new java.awt.Color(0, 0, 0));
        estoqueMenu.setForeground(java.awt.Color.white);
        estoqueMenu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/compra.png"))); // NOI18N
        estoqueMenu.setText("ItemEstoque");
        estoqueMenu.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        cadastrar_itemEstoqueMenuItem.setText("Cadastrar");
        cadastrar_itemEstoqueMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cadastrar_itemEstoqueMenuItemActionPerformed(evt);
            }
        });
        estoqueMenu.add(cadastrar_itemEstoqueMenuItem);

        pesquisarMenuItem.setText("Pesquisar");
        pesquisarMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Filtro(evt);
            }
        });
        estoqueMenu.add(pesquisarMenuItem);

        JanelaPrincipalMenuBar.add(estoqueMenu);

        relatorioMenu.setForeground(java.awt.Color.white);
        relatorioMenu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/buscar.png"))); // NOI18N
        relatorioMenu.setText("Relatório");
        relatorioMenu.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        gerar_relatorioMenuItem.setText("Gerar Relatório de Produtos");
        gerar_relatorioMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                gerarRelatorioProdutos(evt);
            }
        });
        relatorioMenu.add(gerar_relatorioMenuItem);

        JanelaPrincipalMenuBar.add(relatorioMenu);

        setJMenuBar(JanelaPrincipalMenuBar);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(JanelaPrincipalPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(JanelaPrincipalPanel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        JanelaPrincipalPanel.getAccessibleContext().setAccessibleName("Sistema");
        JanelaPrincipalPanel.getAccessibleContext().setAccessibleDescription("S");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cadastrar_produtoMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cadastrar_produtoMenuItemActionPerformed

        new ControladorCadastroProduto();
    }//GEN-LAST:event_cadastrar_produtoMenuItemActionPerformed

    private void cadastrar_fornecedorMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cadastrar_fornecedorMenuItemActionPerformed
        new ControladorCadastroFornecedor();
    }//GEN-LAST:event_cadastrar_fornecedorMenuItemActionPerformed

    private void cadastrar_itemEstoqueMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cadastrar_itemEstoqueMenuItemActionPerformed
        new ControladorCadastroItemEstoque();
    }//GEN-LAST:event_cadastrar_itemEstoqueMenuItemActionPerformed

    private void terminarSistema(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_terminarSistema
        BD.fechaConexão();
        System.exit(0);
    }//GEN-LAST:event_terminarSistema

    private void Filtro(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Filtro
        new JanelaPesquisarItemEstoque().setVisible(true);
    }//GEN-LAST:event_Filtro

    private void gerarRelatorioProdutos(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_gerarRelatorioProdutos
        new ControladorRelatorioProdutos();
    }//GEN-LAST:event_gerarRelatorioProdutos

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new JanelaPrincipal().setVisible(true);
            }
        });
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu FornecedorMenu;
    private javax.swing.JMenuBar JanelaPrincipalMenuBar;
    private javax.swing.JPanel JanelaPrincipalPanel;
    private javax.swing.JMenuItem cadastrar_fornecedorMenuItem;
    private javax.swing.JMenuItem cadastrar_itemEstoqueMenuItem;
    private javax.swing.JMenuItem cadastrar_produtoMenuItem;
    private javax.swing.JMenu estoqueMenu;
    private javax.swing.JMenuItem gerar_relatorioMenuItem;
    private javax.swing.JLabel imagem;
    private javax.swing.JMenuItem pesquisarMenuItem;
    private javax.swing.JMenu produtoMenu;
    private javax.swing.JMenu relatorioMenu;
    // End of variables declaration//GEN-END:variables
}
