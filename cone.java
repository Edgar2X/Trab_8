import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class cone {
    private String url;
    private String user;
    private String password;
    private Connection con;

    cone(){
        url = "jdbc:postgresql://localhost:5433/escola";
        user = "postgres";
        password = "postgres";

        try{
            Class.forName("org.postgresql.Driver");
            con = DriverManager.getConnection(url, user, password);
            System.out.println("Iruuuuuu!!!!");
        }catch(Exception e){
            e.printStackTrace();
        }
    }    

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


