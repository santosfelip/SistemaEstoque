
package controle;

import entidade.Produto;
import interfaces.JanelaCadastroProduto;

public class ControladorCadastroProduto {
    
    public ControladorCadastroProduto(){
        new JanelaCadastroProduto(this).setVisible(true);
    }
    
    public String inserirItem(Produto item) {
        Produto item1 = item.buscarItem(item.getSequencial());
        if (item1 == null) {
            return Produto.inserirItem (item);
        } else {
            return "Sequencial já informado";
        }
    }
    
    public String alterarItem (Produto item) {
        Produto item1 = Produto.buscarItem (item.getSequencial());
        if (item1 != null) {
            return Produto.alterarItem (item);
        } else {
            return "Produto não existe no BD";
        }
    }
    
    
    public String removerItem (int sequencial) {
        Produto item1 = Produto.buscarItem (sequencial);
        if (item1 != null) {
            return Produto.removerItem(sequencial);
        } else {
            return "Produto não existe no BD";
        }
    }
}
