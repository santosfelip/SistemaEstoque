
package controle;

import entidade.Fornecedor;
import interfaces.JanelaCadastroFornecedor;

public class ControladorCadastroFornecedor {
    
    public ControladorCadastroFornecedor(){
        new JanelaCadastroFornecedor(this).setVisible(true);
    }
    
    public String inserirFornecedor(Fornecedor item) {
        Fornecedor item1 = item.buscarFornecedor(item.getCnpj());
        if (item1 == null) {
            return Fornecedor.inserirFornecedor (item);
        } else {
            return "Código de Cnpj já informado";
        }
    }
    
    public String alterarFornecedor (Fornecedor item) {
        Fornecedor item1 = Fornecedor.buscarFornecedor (item.getCnpj());
        if (item1 != null) {
            return Fornecedor.alterarFornecedor (item);
        } else {
            return "Código de Cnpj já cadastrado";
        }
    }
    
    
    public String removerFornecedor (String cnpj) {
        Fornecedor item1 = Fornecedor.buscarFornecedor (cnpj);
        if (item1 != null) {
            return Fornecedor.removerFornecedor(cnpj);
        } else {
            return "Código de Cnpj não cadastrados";
        }
    }
}
