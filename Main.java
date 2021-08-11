//Esse é o Main
import java.sql.ResultSet;
import java.sql.SQLException;

public class Main{
    public static void main(String[] args) {
        //Iniciei uma nova conexão, agora vou mostrar exemplos executando o codigo.
        cone con = new cone();
        String create = "INSERT into aprovados_conc (id,nome)"+
                    " values(3,'José')";
        int res_c = con.executa(create);

        String update = "UPDATE aprovados_conc SET nome ='Mario' WHERE id = 1";
        int res_u = con.executa(update);

        //Na hora da busca vou imprimir através de um WHILE os resultados requisitados
        String read = "SELECT * from profissao";
        ResultSet rs = con.busca(read);

        //String delete = "DELETE FROM aluno WHERE idaluno=4";
        //int res_d = con.executa(delete);

        try {
          while (rs.next()){
               int id = rs.getInt("id");
               String cargo = rs.getString("cargo");
               System.out.println(cargo);
               
            }
        } catch (SQLException e) {

            e.printStackTrace();
        }

        System.out.println(update);

    }
}