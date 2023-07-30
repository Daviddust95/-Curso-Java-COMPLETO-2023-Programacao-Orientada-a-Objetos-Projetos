import java.util.Scanner;

public class ex004 {
    public static void main(String[] args) {
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
