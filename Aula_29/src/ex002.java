import java.util.Scanner;

public class ex002 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double raio, area;
        final double PI = 3.14159;

        System.out.printf("Qual o valor do raio do círculo ?");
        raio = scanner.nextDouble();

        area = PI * raio * raio;

        System.out.printf("A = %.4f", area);
    }
}