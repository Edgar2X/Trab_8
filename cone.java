// Esse é o banco de conexão
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class cone {
    private String url;
    private String user;
    private String password;
    private Connection con;

// Estou usando o postgres para o sql
    cone(){
        url = "jdbc:postgresql://localhost:5433/Concurso";
        user = "postgres";
        password = "postgres";

        try{
            Class.forName("org.postgresql.Driver");
            con = DriverManager.getConnection(url, user, password);
            System.out.println("Conexão Estabelecida!");
        }catch(Exception e){
            e.printStackTrace();
        }
    }    

// Codigo de execução do SQL, importando a biblioteca Statement
    public int executa(String sql){
    
        try{
            Statement stm = con.createStatement();
            int res = stm.executeUpdate(sql);
            con.close();
            return res;
        }catch(Exception e){
            e.printStackTrace();
            return 0;
        }
    }
// Codigo de busca do SQL, importando a biblioteca ResultSet

    public ResultSet busca(String sql){
        try {
            Statement stm = con.createStatement();
            ResultSet rs = stm.executeQuery(sql);
            con.close();
            return rs;
        }catch(Exception e){
            e.printStackTrace();
            return null;
        }
    }    
}


