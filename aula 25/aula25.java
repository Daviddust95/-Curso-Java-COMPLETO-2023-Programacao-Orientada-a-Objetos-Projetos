import java.util.Scanner;

public class aula25 {
    public static void main(String[] args) {

        Scanner sc = new Scanner (System.in);

            String x;
            x = sc.next ();
            System.out.println("Você digitou: " + x);

            sc.close();
    
    
        /* Para fazer entrada de dados, nós vamos
         * criar um objeto do tipo "Scanner" da seguinte forma:
         * Scarnner sc = new Scanner (System.in);
         * precisa informar no começo do programa 
         * import java.util.Scanner;
         * fazer sc.close() quado não precisar mais
         * do objeto sc
         * suponha uma variável tipo String declarada:
         * String x;
         * x = sc.next();
         */

}
}