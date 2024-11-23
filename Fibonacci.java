// 30 days of code - dia 4: Sequência da Fibonacci.
// 23/11 - Hoje é considerado o "Fibonacci Day" e por esse motivo o desafio de hoje foi gerar a sequência de Fibonacci com a estrutura de repetição FOR.
import java.util.Scanner;

public class Fibonacci {
    public static void main(String [] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Insira um número para gerar a sequência de Fibonacci:");
        int n = scanner.nextInt();

        if (n <= 0)
            System.out.println("Insira um número maior que zero.");  
        
        else {
            System.out.println("Sequência de Fibonacci:");

            int anterior = 0;
            int atual = 1;

            for (int i = 0; i < n; i++) {
            System.out.println(anterior + " ");

        // Calcula o próximo número.
            int proximo = anterior + atual;
            anterior = atual;
            atual = proximo;
            }
        }
        scanner.close();
    }
}
