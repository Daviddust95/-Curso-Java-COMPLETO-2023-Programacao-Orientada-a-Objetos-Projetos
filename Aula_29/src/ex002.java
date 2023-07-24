import java.util.Scanner;

public class ex002 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double raio, area;
        final double PI = 3.14159;

        // Entrada do raio do círculo
        System.out.println("Qual o valor do raio do círculo ?");
        raio = scanner.nextDouble();

        // Cálculo da área do círculo
        area = PI * raio * raio;

        // Exibir o resultado

        System.out.println("A = %.4f", area);
    }
}