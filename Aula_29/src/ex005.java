import java.util.Scanner;

public class ex005 {
    public static void main(String[] args) {
        /*
         * Fazer um programa para ler o código de uma peça 1, o número de peças 1, o
         * valor unitário de cada peça 1, o
         * código de uma peça 2, o número de peças 2 e o valor unitário de cada peça 2.
         * Calcule e mostre o valor a ser pago
         * 
         */

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite os dados da peça 1:");
        System.out.print("Código da peça 1: ");
        int codigo_peca1 = scanner.nextInt();
        System.out.print("Número de peças da peça 1: ");
        int numero_peca1 = scanner.nextInt();
        System.out.print("Valor unitário da peça 1: ");
        double valor_unitario_peca1 = scanner.nextDouble();

        System.out.println("\nDigite os dados da peça 2:");
        System.out.print("Código da peça 2: ");
        int codigo_peca2 = scanner.nextInt();
        System.out.print("Número de peças da peça 2: ");
        int numero_peca2 = scanner.nextInt();
        System.out.print("Valor unitário da peça 2: ");
        double valor_unitario_peca2 = scanner.nextDouble();

        double valor_total_peca1 = numero_peca1 * valor_unitario_peca1;
        double valor_total_peca2 = numero_peca2 * valor_unitario_peca2;
        double valor_total = valor_total_peca1 + valor_total_peca2;

        System.out.println("\nValor total a ser pago: R$ " + valor_total);
    }
}