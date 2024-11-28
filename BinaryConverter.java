// 30 days of code - dia 7: Conversor de decimal para binário.
import java.util.Scanner;

public class BinaryConverter {
    public static void main(String [] args) {
        Scanner scanner = new Scanner(System.in);
        char resposta;

        do {
            StringBuilder binario = new StringBuilder();
            
            System.out.println("Digite um número (inteiro positivo) para ser convertido: ");
            int numeroDecimal = scanner.nextInt();

        if (numeroDecimal == 0) { 
            System.out.println("O número em binário é: 0");
        } else {
            while(numeroDecimal > 0) {
            int resto = numeroDecimal % 2; // Obtem o resto da divisão (0 ou 1).
            binario.append(resto);
            numeroDecimal /= 2; // Divide o número por 2 pra continuar.
            }
        binario.reverse(); // Os restos da divisão serão lidos de trás pra frente
        System.out.println("O número em binário é: " + binario.toString()); 
    }
        System.out.println("Deseja converter outro número?(s/n)");
        scanner.nextLine();
        resposta = scanner.nextLine().charAt(0);
    
    // Continua enquanto a resposta for 's'.
        }while(resposta =='s');
            System.out.println("Obrigada por usar o conversor!");
            scanner.close();    
    }   
}