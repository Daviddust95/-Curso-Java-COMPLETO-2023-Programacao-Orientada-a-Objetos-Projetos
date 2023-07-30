import java.util.Scanner;

public class ex006 {
    public static void main(String[] args) {
        /*
         * Fazer um programa que leia três valores com ponto flutuante de dupla
         * precisão: A, B e C. Em seguida, calcule e
         * mostre:
         * a) a área do triângulo retângulo que tem A por base e C por altura.
         * b) a área do círculo de raio C. (pi = 3.14159)
         * c) a área do trapézio que tem A e B por bases e C por altura.
         * d) a área do quadrado que tem lado B.
         * e) a área do retângulo que tem lados A e B.
         */

        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o valor de A: ");
        double A = scanner.nextDouble();

        System.out.print("Digite o valor de B: ");
        double B = scanner.nextDouble();

        System.out.print("Digite o valor de C: ");
        double C = scanner.nextDouble();

        double areaTrianguloRetangulo = (A * C) / 2.0;
        double areaCirculo = 3.14159 * C * C;
        double areaTrapezio = ((A + B) * C) / 2.0;
        double areaQuadrado = B * B;
        double areaRetangulo = A * B;

        System.out.println("\nÁrea do triângulo retângulo: " + areaTrianguloRetangulo);
        System.out.println("Área do círculo: " + areaCirculo);
        System.out.println("Área do trapézio: " + areaTrapezio);
        System.out.println("Área do quadrado: " + areaQuadrado);
        System.out.println("Área do retângulo: " + areaRetangulo);
    }
}