
package entidade;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Vector;
import persistência.BD;

public class Fornecedor {

    private String nome;
    private String cnpj;

    public Fornecedor(String cnpj, String nome) {
        this.nome = nome;
        this.cnpj = cnpj;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    @Override
    public String toString() {
        return getNome();
    }
    
    public static String removerFornecedor(String cnpj)
    {
        //Conferindo de Esse fornecedor não existe no Estoque
        String sql = "SELECT FornecedorId FROM estoque WHERE FornecedorId = ?";
        ResultSet lista_resultado;
        try {
            PreparedStatement comando = BD.conexão.prepareStatement(sql);
            comando.setString(1, cnpj);
            lista_resultado = comando.executeQuery();
            while (lista_resultado.next()) {
                if (lista_resultado.getString("FornecedorId").equals(cnpj)) {
                    return "Não é possível remover, pois existe um produto fornecido com esse CNPJ";
                }
            }
            lista_resultado.close();
            comando.close();
        } catch (SQLException exceção_sql) {
            exceção_sql.printStackTrace();
            return "Erro ao tentar conferir se existe produtos fornecidos por esse CNPJ";
        }
        
        //Após a verificação acima, podemos deletá-lo
        sql = "DELETE FROM fornecedor WHERE cnpj = ?";
        try {
            PreparedStatement comando = BD.conexão.prepareStatement(sql);
            comando.setString(1, cnpj);
            comando.executeUpdate();
            comando.close();
        } catch (SQLException exceção_sql) {
            exceção_sql.printStackTrace();
            return "Erro ao tentar deletar Fornecedor do banco de dados";
        }
        return null;
    }
    
    public static Fornecedor buscarFornecedor(String cnpj){
    String sql = "SELECT cnpj,nome FROM fornecedor WHERE cnpj = ?";
    ResultSet lista_resultados = null;
    Fornecedor f1 = null;
    try {
        PreparedStatement comando = BD.conexão.prepareStatement(sql);
        comando.setString(1, cnpj);
        lista_resultados = comando.executeQuery();
        while (lista_resultados.next()) {
            f1 = new Fornecedor(cnpj,
            lista_resultados.getString("nome"));
        }
        lista_resultados.close();
        comando.close();
    } catch (SQLException exceção_sql) {
        exceção_sql.printStackTrace ();
        f1 = null;
    }
    return f1;
 }
    
    public static String inserirFornecedor (Fornecedor f1) {
         String sql = "INSERT INTO fornecedor(cnpj,nome)"
         + " VALUES (?,?)";
         try {
             PreparedStatement comando = BD.conexão.prepareStatement(sql);
             comando.setString(1, f1.getCnpj());
             comando.setString(2, f1.getNome());
             comando.executeUpdate();
             comando.close();
             return null;
         } catch (SQLException exceção_sql) {
             exceção_sql.printStackTrace ();
             return "Erro na Inserção do Fornecedor no BD";
         }
         
         
         
    }
    
    public static String alterarFornecedor (Fornecedor f1) {
        String sql = "UPDATE fornecedor SET nome = ?"
        + " WHERE cnpj = ?";
        try {
            PreparedStatement comando = BD.conexão.prepareStatement(sql);
            comando.setString(1, f1.getNome());
            comando.setString(2, f1.getCnpj());
            comando.executeUpdate();
            comando.close();
            return null;
        } catch (SQLException exceção_sql) {
            exceção_sql.printStackTrace ();
            return "Erro na Alteração do Fornecedor no BD";
        }
    }
    
    public static Vector<Visão<String>> getVisões () {
        String sql = "SELECT cnpj, nome FROM fornecedor";
        ResultSet lista_resultados = null;
        Vector<Visão<String>> visões = new Vector<Visão<String>> ();
        String codigo;
        try {
            PreparedStatement comando = BD.conexão.prepareStatement(sql);
            lista_resultados = comando.executeQuery();
            while (lista_resultados.next()) {
                codigo = lista_resultados.getString("cnpj");
                visões.addElement(new Visão<String> (codigo,
                lista_resultados.getString("nome") + " - " + codigo));
            }
            lista_resultados.close();
            comando.close();
        } catch (SQLException exceção_sql) {exceção_sql.printStackTrace ();}
        return visões;
    }
    
    public Visão<String> getVisão () {
        return new Visão<String> (cnpj, nome + " - " + cnpj);
    }
}

