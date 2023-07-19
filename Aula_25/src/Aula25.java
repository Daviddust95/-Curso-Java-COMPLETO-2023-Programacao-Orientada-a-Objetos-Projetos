import java.util.Locale;
import java.util.Scanner;

public class aula25 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int y;
        String s1, s2, s3;

        x = sc.nextInt();
        sc.nextLine();
        s1 = sc.nextLine();
        s2 = sc.nextLine();
        s3 = sc.nextLine();

        System.out.println("Você digitou: ");

        System.out.println(y);
        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);
        sc.close();

        /*
         * Para Ler vários dados na mesma linha
         * 
         * double x;
         * x = sc.nextDouble();
         * System.out.printf("Você digitou: " + x);
         * 
         * sc.close();
         * 
         * Para fazer entrada de dados, nós vamos
         * criar um objeto do tipo "Scanner" da seguinte forma:
         * Scarnner sc = new Scanner (System.in);
         * precisa informar no começo do programa
         * import java.util.Scanner;
         * fazer sc.close() quado não precisar mais
         * do objeto sc
         * suponha uma variável tipo String declarada:
         * String x;
         * x = sc.next();
         * 
         * Para ler um caractere
         * 
         * Suponha uma variável tipo char declarada:
         * 
         * char x;
         * 
         * x = sc.nex().charAT(0)
         */

    }
}