
package controle;

import entidade.ItemEstoque;
import interfaces.JanelaCadastroItemEstoque;


public class ControladorCadastroItemEstoque {
    

    public ControladorCadastroItemEstoque()
    {
        new JanelaCadastroItemEstoque(this).setVisible(true);
    }
    
    public String inserirEstoque(ItemEstoque estoque) {
        if (ItemEstoque.foiEstocado(estoque.getProduto().getSequencial())) {
            return "Esse produto já foi inserido no estoque";
        } else {
            return ItemEstoque.inserirEstoque(estoque);
        }
    }

    public String alterarEstoque(ItemEstoque estoque) {
        ItemEstoque estoque1 = ItemEstoque.consultarEstoque(estoque.getSequencial());
        if (estoque1 != null) {
            return ItemEstoque.alterarEstoque(estoque);
        } else {
            return "Estoque com o seguinte sequencial nao foi encontrada: " + estoque.getSequencial();
        }
    }

    public String removerEstoque(int sequencial) {
        ItemEstoque estoque = ItemEstoque.consultarEstoque(sequencial);
        if (estoque != null) {
            return ItemEstoque.removerEstoque(sequencial);
        } else {
            return "Estoque não existe no banco de dados";
        }
    }
}
