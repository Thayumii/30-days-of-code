// 30 days of code - dia 1: Simulador de Dados
import java.util.Random;
import java.util.Scanner;

public class SimuladorDeDados{
    public static void main (String [] args){
    Scanner scanner = new Scanner(System.in);
    char resposta;

    do {
    // Gera um número aleatório entre 1 e 6.    
        Random random = new Random();
        int numero = random.nextInt(6) + 1;
        System.out.println("Número sorteado:" + numero);

        System.out.println("Deseja lançar o dado novamente?(s/n)");
        resposta = scanner.nextLine().charAt(0);
    
    // Continua enquanto a resposta for 's'.
    }while(resposta =='s'); {
        System.out.println("Obrigada por jogar!");
        scanner.close();
    } 
}  
}