import java.util.Locale;
import java.util.Scanner;

public class aula25 {
    public static void main(String[] args) {

        /*
         * Locale.set.Default(Locale.US);
         * Scanner sc = new Scanner(System.in);
         * 
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

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        String x;
        int y;
        double z;
        x = sc.next();
        y = sc.nextInt();
        z = sc.nexDouble();
        System.out.println("Dados digitados");

        System.out.println(x);
        System.out.println(y);
        system.out.println(z);
        sc.close();

    }
}