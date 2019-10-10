        
package entidade;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Vector;
import persistência.BD;

public class Produto {
    
    public enum Categoria{
        Alimentício, Limpeza, Embalagem, Higiene, Informática;
    };
    
    public static final Categoria[] categorias = Categoria.values();
    
    private String nome;
    private int quantEstoque;
    private String marca;
    private String código_barras;
    private float valorUnidade;
    private float valorTotal;
    private Categoria categoria;
    private int sequencial;
    private Boolean comprar;
    
    //Construtor
    public Produto(int Sequencial,String código, String nome,Categoria categoria,String marca,
            int quantEstoque,float valorUnidade,float valorTotal, Boolean comprar)
    {
        this.nome = nome;
        this.quantEstoque = quantEstoque;
        this.marca = marca;
        this.código_barras = código;
        this.valorUnidade = valorUnidade;
        this.valorTotal = valorTotal;
        this.categoria = categoria;
        this.sequencial = Sequencial;
        this.comprar = comprar;
        
    }
    
    public static String removerItem(int sequencial)
    {
        //Verifica se já não está no estoque o produto
        String sql = "SELECT ProdutoId FROM estoque WHERE ProdutoId = ?";
        ResultSet lista_resultados = null;
        try {
            PreparedStatement comando = BD.conexão.prepareStatement(sql);
            comando.setString(1, sequencial + "");
            lista_resultados = comando.executeQuery();
            while (lista_resultados.next()) {
                if (lista_resultados.getInt("ProdutoId") == sequencial) {
                    return "Esse produto não pode ser removido, pois existe um registro no estoque";
                }
            }
            lista_resultados.close();
            comando.close();
        } catch (SQLException exceção_sql) {
            exceção_sql.printStackTrace();
            return "Erro ao tentar verificar se existe um produto";
        }
        
        //Depois de verificar se o produto não está no estoque, o produto pode ser retirado
        sql = "DELETE FROM produto WHERE Sequencial = ?";
        try {
            PreparedStatement comando = BD.conexão.prepareStatement(sql);
            comando.setString(1, sequencial + "");
            comando.executeUpdate();
            comando.close();
        } catch (SQLException exceção_sql) {
            exceção_sql.printStackTrace();
            return "Erro ao tentar excluir o produto do banco de dados";
        }
        return null;
    }
    
    public static Produto buscarItem(int sequencial){
    String sql = "SELECT codigo_barras,nome, quantidade, marca,valorUnitario,valorTotal,Categoria,Comprar FROM produto WHERE Sequencial = ?";
    ResultSet lista_resultados = null;
    Produto item = null;
    try {
        PreparedStatement comando = BD.conexão.prepareStatement(sql);
        comando.setString(1, sequencial + "");
        lista_resultados = comando.executeQuery();
        while (lista_resultados.next()) {
            item = new Produto (sequencial,
            lista_resultados.getString("codigo_barras"),
            lista_resultados.getString("nome"),
            Categoria.values()[lista_resultados.getInt("Categoria")],
            lista_resultados.getString("marca"),
            lista_resultados.getInt("quantidade"),
            lista_resultados.getFloat("valorUnitario"),
            lista_resultados.getFloat("valorTotal"),
             lista_resultados.getBoolean("Comprar"));
        }
        lista_resultados.close();
        comando.close();
    } catch (SQLException exceção_sql) {
        exceção_sql.printStackTrace ();
        item = null;
    }
    return item;
 }
    
    public static String inserirItem (Produto item) {
         String sql = "INSERT INTO produto(codigo_barras, nome, quantidade,marca,valorUnitario,ValorTotal,Categoria,Comprar)"
         + " VALUES (?,?,?,?,?,?,?,?)";
         String mensagem_erro = null;
         int comprar = item.getComprar() ? 1 : 0;
         try {
             PreparedStatement comando = BD.conexão.prepareStatement(sql);
             comando.setString(1, item.getCódigo_barras());
             comando.setString(2, item.getNome());
             comando.setInt(3, item.getQuantEstoque());
             comando.setString(4,item.getMarca());
             comando.setDouble(5, item.getValorUnidade());
             comando.setDouble(6, item.getValorTotal());
             comando.setString(7,item.getCategoria().ordinal() + "");
             comando.setInt(8, comprar);
             comando.executeUpdate();
             comando.close();
         } catch (SQLException exceção_sql) {
             exceção_sql.printStackTrace ();
             mensagem_erro =  "Erro na Inserção do Produto no BD";
         }
        //pegar o ID do Banco
        sql = "SELECT MAX(Sequencial) AS Sequencial FROM produto";
        ResultSet lista_resultados;
        int sequencial_produto = -1;
        try {
            PreparedStatement comando = BD.conexão.prepareStatement(sql);
            lista_resultados = comando.executeQuery();
            while (lista_resultados.next()) {
                sequencial_produto = lista_resultados.getInt("Sequencial");
            }
            lista_resultados.close();
            comando.close();
        } catch (SQLException exceção_sql) {
            exceção_sql.printStackTrace();
            mensagem_erro = "Erro ao buscar sequencial do produto no banco de dados";
        }
        if (sequencial_produto> -1) {
            item.setSequencial(sequencial_produto);
        }
        return mensagem_erro;
    }
    
    public static String alterarItem (Produto item) {
        String sql = "UPDATE produto SET codigo_barras = ?, nome = ?, quantidade = ?, marca = ?,valorUnitario = ?, valorTotal = ?, Categoria = ?, Comprar = ?"
        + " WHERE Sequencial = ?";
        int comprar = item.getComprar()?1:0;
        try {
            PreparedStatement comando = BD.conexão.prepareStatement(sql);
            comando.setString(1, item.getCódigo_barras());
            comando.setString(2, item.getNome());
            comando.setInt(3, item.getQuantEstoque());
            comando.setString(4, item.getMarca());
            comando.setDouble(5,item.getValorUnidade());
            comando.setDouble(6,item.getValorTotal());
            comando.setString(7, item.getCategoria().ordinal() + "");
            comando.setInt(8,comprar);
            comando.setInt(9, item.getSequencial());
            comando.executeUpdate();
            comando.close();
            return null;
        } catch (SQLException exceção_sql) {
            exceção_sql.printStackTrace ();
            return "Erro na Alteração do Produto no BD";
        }
    }
    
    public static Vector<Visão<Integer>> getVisões () {
        String sql = "SELECT Sequencial, codigo_barras, nome FROM produto";
        ResultSet lista_resultados = null;
        Vector<Visão<Integer>> visões = new Vector<Visão<Integer>> ();
        String codigo;
        try {
            PreparedStatement comando = BD.conexão.prepareStatement(sql);
            lista_resultados = comando.executeQuery();
            while (lista_resultados.next()) {
                visões.addElement(new Visão<Integer>(
                        lista_resultados.getInt("Sequencial"),
                        lista_resultados.getString("Sequencial") + " - "
                        + lista_resultados.getString("nome")));
            }
            lista_resultados.close();
            comando.close();
        } catch (SQLException exceção_sql) {exceção_sql.printStackTrace ();}
        return visões;
    }
    
    public Visão<Integer> getVisão () {
        return new Visão<Integer> (sequencial, sequencial + " - " + nome);
    }
    
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public int getQuantEstoque() {
        return quantEstoque;
    }
    public void setQuantEstoque(int quantEstoque) {
        this.quantEstoque = quantEstoque;
    }
    public String getMarca() {
        return marca;
    }
    public void setMarca(String marca) {
        this.marca = marca;
    }
    public float getValorUnidade() {
        return valorUnidade;
    }
    public void setValorUnidade(float valorUnidade1) {
        this.valorUnidade = valorUnidade1;
    }
    public float getValorTotal() {
        return valorTotal;
    }
    public void setValorTotal(float valorTotal) {
        this.valorTotal = valorTotal;
    }
    
    public Categoria getCategoria() {
        return categoria;
    }

    public void setCategoria(Categoria categoria) {
        this.categoria = categoria;
    }

    public String getCódigo_barras() {
        return código_barras;
    }

    public void setCódigo_barras(String código_barras) {
        this.código_barras = código_barras;
    }
     public int getSequencial() {
        return sequencial;
    }

    public void setSequencial(int sequencial) {
        this.sequencial = sequencial;
    }
    
    public Boolean getComprar() {
        return comprar;
    }

    public void setComprar(Boolean comprar) {
        this.comprar = comprar;
    }
    @Override
    public String toString(){
        return nome+" - " + código_barras;
    }
    
    
}
