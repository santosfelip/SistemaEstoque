
package controle;

import entidade.Usuario;
import javax.swing.JOptionPane;

public class ControladorCadastroUsuario {
    private Usuario usuario = null;
    public ControladorCadastroUsuario(){}
    public ControladorCadastroUsuario(Usuario usuario)
    {
        if(usuario!=null)
            this.usuario = usuario;
        else
            JOptionPane.showMessageDialog(null,"Erro ao criar novo usuario","ERRO", JOptionPane.ERROR_MESSAGE);
    }
    
    public Usuario getUsuario()
    {
        return usuario;
    }
}
