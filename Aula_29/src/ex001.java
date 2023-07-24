
import java.util.Scanner;

public class ex001 {

    /*
     * Curso Java Completo
     * http://educandoweb.com.br
     * Prof. Dr. Nelio Alves
     * Capítulo: Apresentação da linguagem Java e tópicos básicos
     * Exercícios sobre Estrutura Sequencial (entrada, processamento, saída)
     * Exercícios obtidos do URI Online Judge: www.urionlinejudge.com.br
     * Atenção! Esses exercícios são:
     *  OPCIONAIS para quem já sabe Lógica de Programação em qualquer linguagem
     *  NECESSÁRIOS para alunos iniciantes
     * Exercício 01 Faça um programa para ler dois valores inteiros, e depois
     * mostrar na tela a soma desses números com uma
     * mensagem explicativa, conforme exemplos.
     */

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Leitura dos valores inteiros
        System.out.print("Digite o primeiro valor inteiro: ");
        int num1 = scanner.nextInt();

        System.out.print("Digite o segundo valor inteiro: ");
        int num2 = scanner.nextInt();

        // Cálculo da soma
        int soma = num1 + num2;

        // Exibição do resultado
        System.out.println(" Soma = " + soma);

        scanner.close();
    }
}
