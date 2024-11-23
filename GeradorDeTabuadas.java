// 30 days of code - dia 2: Gerador de Tabuadas.
import java.util.Scanner;

public class GeradorDeTabuadas {
    public static void main(String [] args){
        Scanner scanner = new Scanner(System.in);
        int continuar;

        do {
        // Solicita um número.
            System.out.println("Digite um número para gerar a tabuada:");
            int numero = scanner.nextInt();

        // Gera e exibe a tabuada do número escolhido.
            System.out.println("Tabuada do " + numero + ":");
            for (int i = 0; i<=10; i++) {
                int resultado = numero * i;
                System.out.println(numero + " x " + i + " = " + resultado);
            }

        System.out.println("Deseja gerar outra tabuada? (s/n)");
        continuar = scanner.next().charAt(0);

        } while (continuar == 's');
        System.out.println("Obrigado por usar o Gerador de Tabuada!");
        scanner.close();
    }
    
}
