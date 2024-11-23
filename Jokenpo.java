// 30 days of code - dia 3: Pedra, Papel e Tesoura.
import java.util.Random;
import java.util.Scanner;

public class Jokenpo {
    public static void main(String [] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        char jogarNovamente;

        do {
        // Exibe as opções para o jogador.
            System.out.println("Escolha uma opção:");
            System.out.println("1 - Pedra");
            System.out.println("2 - Papel");
            System.out.println("3 - Tesoura");
            int escolhaJogador = scanner.nextInt();

            int escolhaComputador = random.nextInt(3) + 1; // Gera a escolha do computador.
            String[] opcoes = {"Pedra", "Papel", "Tesoura"};
            System.out.println("O computador escolheu: " + opcoes[escolhaComputador - 1]);

            if (escolhaJogador == escolhaComputador)
                System.out.println("Empate!");

            else if ((escolhaJogador == 1) && (escolhaComputador == 3) ||
                    ((escolhaJogador == 2) && (escolhaComputador == 2)) ||
                    ((escolhaJogador == 3) && (escolhaComputador == 1))) {
                    System.out.println("Você venceu!");

            } else {
                System.out.println("Você perdeu :(");
                }

            System.out.println("Deseja jogar novamente? (s/n)");
            jogarNovamente = scanner.next().charAt(0);

        } while (jogarNovamente == 's');
            System.out.println("Obrigada por jogar.");
            scanner.close();
    }
    
}