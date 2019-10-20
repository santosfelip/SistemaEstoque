
package entidade;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Vector;
import persistência.BD;


public class ItemEstoque {

    private int sequencial;
    private Produto produto;
    private Fornecedor fornecedor;
    
    public ItemEstoque(int sequencial, Produto produto, Fornecedor fornecedor)
    {
        this.sequencial = sequencial;
        this.produto = produto;
        this.fornecedor = fornecedor;
    }
    
    //Getter And Setter's
    public int getSequencial() {
        return sequencial;
    }

    public void setSequencial(int sequencial) {
        this.sequencial = sequencial;
    }

    public Produto getProduto() {
        return produto;
    }

    public void setProduto(Produto produto) {
        this.produto = produto;
    }

    public Fornecedor getFornecedor() {
        return fornecedor;
    }

    public void setFornecedor(Fornecedor fornecedor) {
        this.fornecedor = fornecedor;
    }
    
    public Visão<Integer> getVisão() {
        return new Visão<Integer>(sequencial, sequencial + " - "+ fornecedor.getCnpj()+ " - " + fornecedor.getNome()
                + " Fornece o produto com ID " + produto.getSequencial() + " - " + produto.getNome());
    }
    
    //Inserir e remover no BD
    public static String inserirEstoque(ItemEstoque estoque) {
        String sql = "INSERT INTO estoque(FornecedorId, ProdutoId) VALUES(?,?)";
        try {
            PreparedStatement comando = BD.conexão.prepareStatement(sql);
            comando.setString(1, estoque.getFornecedor().getCnpj());
            comando.setString(2, estoque.getProduto().getSequencial() + "");
            comando.executeUpdate();
            comando.close();
        } catch (SQLException exceção_sql) {
            exceção_sql.printStackTrace();
            return "Erro ao inserir estoque no banco de dados";
        }
        //pegar o ID no Banco
        sql = "SELECT MAX(Sequencial) AS Sequencial FROM estoque";
        ResultSet lista_resultados;
        int sequencial_estoque = -1;
        try {
            PreparedStatement comando = BD.conexão.prepareStatement(sql);
            lista_resultados = comando.executeQuery();
            while (lista_resultados.next()) {
                sequencial_estoque = lista_resultados.getInt("Sequencial");
            }
            lista_resultados.close();
            comando.close();
        } catch (SQLException exceção_sql) {
            exceção_sql.printStackTrace();
            return "Erro ao buscar sequencial da estoque no banco de dados";
        }
        if (sequencial_estoque > -1) {
            estoque.setSequencial(sequencial_estoque);
        }

        return null;
    }
    
    public static ItemEstoque consultarEstoque(int sequencial_estoque) {
        String sql = "SELECT FornecedorId,ProdutoId FROM estoque WHERE Sequencial = ?";
        String cnpj = "";
        int sequencial_produtos = -1;
        ResultSet lista_resultados;
        try {
            PreparedStatement comando = BD.conexão.prepareStatement(sql);
            comando.setString(1, sequencial_estoque + "");
            lista_resultados = comando.executeQuery();
            while (lista_resultados.next()) {
                cnpj = lista_resultados.getString("FornecedorId");
                sequencial_produtos = lista_resultados.getInt("ProdutoId");
            }
            lista_resultados.close();   
            comando.close();
        } catch (SQLException exceção_sql) {
            exceção_sql.printStackTrace();
            return null;
        }
        
        //Verifica se o produto e o fornecedor existe no BD
        if("".equals(cnpj) || sequencial_produtos==-1)return null;

        //buscar o Fornecedor do BD
        sql = "SELECT nome, tipoContrato from fornecedor WHERE cnpj = ?";
        Fornecedor fornecedor = null;
        
        try {
            PreparedStatement comando = BD.conexão.prepareStatement(sql);
            comando.setString(1, cnpj);
            lista_resultados = comando.executeQuery();
            while (lista_resultados.next()) {
                fornecedor = new Fornecedor(cnpj, lista_resultados.getString("nome"),lista_resultados.getString("tipoContrato"));
            }
            lista_resultados.close();
            comando.close();
        } catch (SQLException exceção_sql) {
            exceção_sql.printStackTrace();
            return null;
        }
        
        //Pegando Produto
        sql = "SELECT codigo_barras,nome, quantidade, marca,valorUnitario,valorTotal,Categoria,Comprar FROM produto WHERE Sequencial = ?";
        Produto produto = null;
        try {
            PreparedStatement comando = BD.conexão.prepareStatement(sql);
            comando.setString(1, sequencial_produtos + "");
            lista_resultados = comando.executeQuery();
            while (lista_resultados.next()) {
                produto = new Produto (sequencial_produtos,
                lista_resultados.getString("codigo_barras"),
                lista_resultados.getString("nome"),
                Produto.Categoria.values()[lista_resultados.getInt("Categoria")],
                lista_resultados.getString("marca"),
                lista_resultados.getInt("quantidade"),
                lista_resultados.getFloat("valorUnitario"),
                lista_resultados.getFloat("valorTotal"),
                 lista_resultados.getBoolean("Comprar"));
            }
            lista_resultados.close();
            comando.close();
        } catch (SQLException exceção_sql) {
            exceção_sql.printStackTrace();
            return null;
        }
        return new ItemEstoque(sequencial_estoque, produto, fornecedor);
    }
    
    public static String alterarEstoque(ItemEstoque estoque) {
        //Busca se o produto já está cadastrado no estoque
        String sql1 = "SELECT ProdutoID from estoque WHERE ProdutoID = ?";
        int sequencial_produtos = -1;
        ResultSet lista_resultados;
        try {
            PreparedStatement comando = BD.conexão.prepareStatement(sql1);
            comando.setString(1, estoque.getProduto().getSequencial()+ "");
            lista_resultados = comando.executeQuery();
            while (lista_resultados.next()) {
                sequencial_produtos = lista_resultados.getInt("ProdutoId");
            }
            lista_resultados.close();   
            comando.close();
        } catch (SQLException exceção_sql) {
            exceção_sql.printStackTrace();
            return null;
        }
        
        if(sequencial_produtos!=-1)return "Produto foi fornecido por um CNPJ";
        
        
        
        
        
        String sql = "UPDATE estoque SET ProdutoId = ?,FornecedorID = ? "
                + "WHERE Sequencial = ?";
        try {
            PreparedStatement comando = BD.conexão.prepareStatement(sql);
            comando.setString(1, estoque.getProduto().getSequencial()+"");
            comando.setString(2, estoque.getFornecedor().getCnpj()); 
            comando.setString(3, estoque.getSequencial() + "");
            comando.executeUpdate();
            comando.close();
        } catch (SQLException exceção_sql) {
            exceção_sql.printStackTrace();
            return "Erro ao tentar alterar estoque no banco de dados";
        }
        return null;
    }
    
    public static String removerEstoque(int sequencial_estoque) {
        String sql = "DELETE FROM estoque WHERE Sequencial = ?";
        try {
            PreparedStatement comando = BD.conexão.prepareStatement(sql);
            comando.setString(1, sequencial_estoque + "");
            comando.executeUpdate();
            comando.close();
        } catch (SQLException exceção_sql) {
            exceção_sql.printStackTrace();
            return "Erro ao tentar excluir estoque do banco de dados";
        }
        return null;
    }
    
    //Verifica se o produto não está em nenhum estoque
    public static Boolean foiEstocado(int sequencial_produto) {
        String sql = "SELECT ProdutoId FROM estoque";
        ResultSet lista_resultados;
        try {
            PreparedStatement comando = BD.conexão.prepareStatement(sql);
            lista_resultados = comando.executeQuery();
            while (lista_resultados.next()) {
                if (lista_resultados.getInt("ProdutoId") == sequencial_produto) {
                    return true;
                }
            }
            lista_resultados.close();
            comando.close();
        } catch (SQLException exceção_sql) {
            exceção_sql.printStackTrace();
        }
        return false;
    }
    
    
    
    //Método GetVisao
    public static Vector<Visão<Integer>> getVisões() {   
        String sql = "SELECT estoque.Sequencial, estoque.ProdutoId,estoque.FornecedorId,"+
                " fornecedor.cnpj, fornecedor.nome," + 
                " produto.Sequencial, produto.codigo_barras, produto.nome"+
                " FROM estoque,fornecedor,produto"+
                " WHERE estoque.ProdutoId = produto.Sequencial AND estoque.FornecedorId = fornecedor.cnpj";
        Vector<Visão<Integer>> visões = new Vector<Visão<Integer>>();
        ResultSet lista_resultados = null;
        try {
            PreparedStatement comando = BD.conexão.prepareStatement(sql);
            lista_resultados = comando.executeQuery();
            while (lista_resultados.next()) {
                
                visões.addElement(new Visão<Integer>(
                        lista_resultados.getInt("estoque.Sequencial"),
                        + lista_resultados.getInt("estoque.Sequencial") + " - "
                        + lista_resultados.getString("fornecedor.cnpj") + " - "
                        + lista_resultados.getString("fornecedor.nome")     
                        + " Fornece o produto com ID " + lista_resultados.getString("produto.Sequencial") + " - "
                        + lista_resultados.getString("produto.nome") 
                ));
            }
            lista_resultados.close();
            comando.close();
        } catch (SQLException exceção_sql) {
            exceção_sql.printStackTrace();
        }
        return visões;
    }
    
    
    //metodo do filtro
    public static Vector<Visão<Integer>> getVisõesFiltradas(int comprar, int categoria, String nome_fornecedor, int contrato){
        String sql = "SELECT produto.Sequencial, produto.codigo_barras, produto.nome, produto.quantidade, produto.marca, produto.valorUnitario, produto.valorTotal, produto.Categoria, produto.Comprar," + 
                " fornecedor.cnpj, fornecedor.nome, fornecedor.tipoContrato,"+
                " estoque.Sequencial, estoque.ProdutoId, estoque.FornecedorId"+
                " FROM produto,fornecedor,estoque"
                +" WHERE estoque.ProdutoID = produto.Sequencial AND estoque.FornecedorID = fornecedor.cnpj";
        
        Vector<Visão<Integer>> visões = new Vector<Visão<Integer>>();
        ResultSet lista_resultados;
        
        String contrato_bd = null;
        String mensagem_comprar = null;
        String mensagem_categoria = null;
        if(contrato == 0){
            contrato_bd = "Contrato";
            sql += " AND fornecedor.tipoContrato = 'c'";
        }else{
            if(contrato == 1){
                contrato_bd = "Licitação";
                sql += " AND fornecedor.tipoContrato = 'l'";
            }
        }
        
        if(categoria>-1){
            sql += " AND produto.Categoria = '"+categoria+"'"; 
        }
        
        if(!nome_fornecedor.isEmpty())
        {
            sql += " AND fornecedor.nome LIKE '"+ nome_fornecedor + "%'";
        }
        
        if(comprar == 1)
        {
            sql+= " AND produto.comprar = 1";
        }
        if(comprar == 0)
             sql+= " AND produto.comprar = 0";
        
        

        try
        {
             PreparedStatement comando = BD.conexão.prepareStatement(sql);
             lista_resultados = comando.executeQuery();
                while (lista_resultados.next()) {
                        if(lista_resultados.getString("fornecedor.tipoContrato").equals("c"))
                            contrato_bd = "Contrato";
                        else
                            contrato_bd = "Licitação";       
                        //verifica se precisa comprar
                        if(lista_resultados.getInt("produto.comprar")==1)
                            mensagem_comprar = " Precisa Comprar ";
                        else
                            mensagem_comprar = " Não Precisa Comprar";
                        
                        //verifica categoria        
                            if(lista_resultados.getString("produto.Categoria").equals("0")) mensagem_categoria = "Alimentício";
                            if(lista_resultados.getString("produto.Categoria").equals("1")) mensagem_categoria = "Limpeza";
                            if(lista_resultados.getString("produto.Categoria").equals("2")) mensagem_categoria = "Embalagem";
                            if(lista_resultados.getString("produto.Categoria").equals("3")) mensagem_categoria = "Higiene";
                            if(lista_resultados.getString("produto.Categoria").equals("4")) mensagem_categoria = "Informática";
                        
                    visões.addElement(new Visão<Integer>(                     
                            lista_resultados.getInt("estoque.Sequencial"), 
                            lista_resultados.getInt("estoque.Sequencial") +  " - "
                            + lista_resultados.getString("produto.nome")+ " - "        
                            +lista_resultados.getString("fornecedor.nome")+
                                    " - "
                            + contrato_bd + " - "
                            + mensagem_comprar + " - " 
                            + mensagem_categoria ) 
                    );
                }
            lista_resultados.close();
            comando.close();
        }catch(SQLException exceção_sql){
            exceção_sql.printStackTrace();
        }
        
        
        
        return visões;
    
    }
}
