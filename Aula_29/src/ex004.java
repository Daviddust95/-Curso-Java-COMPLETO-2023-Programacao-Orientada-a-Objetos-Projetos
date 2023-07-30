import java.util.Scanner;

public class ex004 {
    public static void main(String[] args) {

        /*
         * Fazer um programa para ler o código de uma peça 1, o número de peças 1, o
         * valor unitário de cada peça 1, o
         * código de uma peça 2, o número de peças 2 e o valor unitário de cada peça 2.
         * Calcule e mostre o valor a ser pago.
         * 
         */
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o número do funcionário: ");
        int numeroFuncionario = scanner.nextInt();

        System.out.print("Digite o número de horas trabalhadas: ");
        double horasTrabalhadas = scanner.nextDouble();

        System.out.print("Digite o valor por hora: ");
        double valorPorHora = scanner.nextDouble();

        double salario;

        try {
            salario = horasTrabalhadas * valorPorHora;
        } catch (Exception e) {
            System.out.println("Erro ao calcular o salário.");
            scanner.close();
            return;
        }

        System.out.println("Número do funcionário: " + numeroFuncionario);
        System.out.printf("Salário: %.2f%n", salario);

        scanner.close();
    }
}
