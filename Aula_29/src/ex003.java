import java.util.Scanner;

public class ex003 {
    public static void main(String[] args) {

        /*
         * Fazer um programa para ler quatro valores inteiros A, B, C e D. A seguir,
         * calcule e mostre a diferença do produto
         * de A e B pelo produto de C e D segundo a fórmula: DIFERENCA = (A * B - C *
         * D).
         */

        Scanner sc = new Scanner(System.in);
        int A, B, C, D, DIF;

        A = sc.nextInt();
        B = sc.nextInt();
        C = sc.nextInt();
        D = sc.nextInt();
        DIF = A * B - C * D;

        System.out.println("A diferença é igual a = " + DIF);

        sc.close();
    }
}