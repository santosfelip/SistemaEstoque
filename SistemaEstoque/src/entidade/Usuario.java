
package entidade;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import persistência.BD;


public class Usuario {

    private int seq_usuario;
    private String nome;
    private String login;
    private String senha;
    private int admin;
    
    public Usuario(String nome, String login, String senha,int admin)
    {
        this.nome = nome;
        this.login = login;
        this.senha = senha;
        this.admin = admin;
        this.seq_usuario = 0;
        
    }
    
    public int getSeq_usuario() {
        return seq_usuario;
    }

    public void setSeq_usuario(int seq_usuario) {
        this.seq_usuario = seq_usuario;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }
    public int getAdmin() {
        return admin;
    }

    public void setAdmin(int admin) {
        this.admin = admin;
    }
    
    
    public static String inserirUsuario(Usuario usuario)
    {
        String sql = "INSERT INTO usuario(nome,login,senha,admin) VALUES(?,?,?,?)";
        String mensagem_erro = null;
        try{
            PreparedStatement comando = BD.conexão.prepareStatement(sql);
            comando.setString(1, usuario.getNome());
            comando.setString(2, usuario.getLogin());
            comando.setString(3, usuario.getSenha());
            comando.setInt(4, usuario.getAdmin());
            comando.executeUpdate();
            comando.close();
        }catch(SQLException exceção_sql)
        {
            exceção_sql.printStackTrace();
            mensagem_erro = "Erro ao inserir no BD";
        }
        
        sql = "SELECT MAX(sequencial_usuario) AS sequencial_usuario FROM usuario ";
        ResultSet lista_resultados;
        int sequencial = -1;
        
        try {
            PreparedStatement comando = BD.conexão.prepareStatement(sql);
            lista_resultados = comando.executeQuery();
            while (lista_resultados.next()) {
                sequencial = lista_resultados.getInt("sequencial_usuario");
            }
            lista_resultados.close();
            comando.close();
        } catch (SQLException exceção_sql) {
            exceção_sql.printStackTrace();
            mensagem_erro = "Erro ao buscar sequencial do produto no banco de dados";
        }
        if (sequencial> -1) {
            usuario.setSeq_usuario(sequencial);
        }
        return mensagem_erro;
        
    }
    
    public static boolean verificaLogin(String login, String senha)
    {
        String sql = "SELECT login, senha, admin FROM usuario "
                + "WHERE login = '"+login+"' AND senha = '" + senha+"'";
        String login1 = null, senha1 =null;
        int admin = -1;
        
        ResultSet lista_resultados;
        
        try {
            PreparedStatement comando = BD.conexão.prepareStatement(sql);
            lista_resultados = comando.executeQuery();
            while (lista_resultados.next()) {
                login1 = lista_resultados.getString("login");
                senha1 = lista_resultados.getString("senha");
                admin = lista_resultados.getInt("admin");
            }
            lista_resultados.close();
            comando.close();
        } catch(SQLException exceção_sql) {
                exceção_sql.printStackTrace();
        }
      
        return (login1!=null && senha1!=null && admin!=-1);
    }
            
    public static Usuario criarUsuario(String login, String senha)
    {
        String sql = "SELECT nome,admin FROM usuario WHERE login = '"+ login+"' AND senha = '"+senha+"'";
        ResultSet resultado;
        String nome = null;
        int admin = 0;
        try{
           PreparedStatement comando = BD.conexão.prepareStatement(sql);
           resultado = comando.executeQuery();
           while(resultado.next())
           {
               nome = resultado.getString("nome");
               admin = resultado.getInt("admin");
               return new Usuario(nome,login,senha,admin);
           }
           resultado.close();
           comando.close();
        }catch(SQLException exceção_sql)
        {
            exceção_sql.printStackTrace();
        }
        
        return null;
    }
            
    public void alterarUsuario(Usuario usuario)
    {
        
    }
}
