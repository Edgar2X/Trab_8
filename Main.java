public class Main{
    public static void main(String[] args) {
        cone con = new cone();
        String create = "INSERT into aluno (idaluno,nome)"+
                     " values(4,'Lars Dash')";
        int res_c = con.executa(create);

        String read = "SELECT * from aluno";
        int res_r = con.executa(read);

        String delete = "DELETE FROM aluno WHERE idaluno=4";
        int res_d = con.executa(delete);

        String update = "UPDATE aluno SET nome = 'Marcos Castro' WHERE idaluno = 2";
        int res_u = con.executa(update);

        if( res_u > 0){
            System.out.println("Massa dmais!!!");
        }else{
            System.out.println("Paia dmais!!");
        }
    }
}