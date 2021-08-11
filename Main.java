import java.sql.ResultSet;
import java.sql.SQLException;

public class Main{
    public static void main(String[] args) {
        cone con = new cone();
        //String create = "INSERT into aluno (idaluno,nome)"+
                    // " values(5,'Lars Dash')";
        //int res_c = con.executa(create);

        String read = "SELECT * from aluno";
        ResultSet rs = con.busca(read);
        //String nome = rs.getString("nome");
        //String delete = "DELETE FROM aluno WHERE idaluno=4";
        //int res_d = con.executa(delete);

        //String update = "UPDATE aluno SET nome = 'Marcos Castro' WHERE idaluno = 2";
        //int res_u = con.executa(update);

        System.out.println( rs );
        try {
            while (rs.next()){
                int id = rs.getInt("idaluno");
                String nome = rs.getString("nome");
                System.out.println(nome);
            }
        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

        if( rs != null ){
            System.out.println("Massa dmais!!!");
        
        }else{
            System.out.println("Paia dmais!!");
        }
    }
}