import java.util.Scanner;

public class ex003 {
    public static void main(String[] args) {

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