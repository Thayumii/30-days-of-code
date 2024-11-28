// 30 days of code - dia 6: Validação de senha.
import java.util.Scanner;

public class ValidarSenha {
    public static void main (String [] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.println("Crie uma nova senha: ");
    String senha = scanner.nextLine();

    // Verificação dos critérios.
    boolean tamanhoValido = senha.length() >= 8 && senha.length() <= 20;
    boolean contemMaiuscula = senha.matches(".*[A-Z].*");
    boolean contemMinuscula = senha.matches(".*[a-z].*");
    boolean contemNumero = senha.matches(".*[0-9].*");
    boolean contemEspecial = senha.matches(".*[@ * # $ !].*");

    if (tamanhoValido && contemMaiuscula && contemMinuscula && contemNumero && contemEspecial) {
        System.out.println("Senha válida");
    } else {
        System.out.println("A senha não atende aos seguintes critérios: ");
        if (!tamanhoValido) System.out.println("Deve ter entre 8 e 20 caracteres.");
        if (!contemMaiuscula) System.out.println("Deve conter pelo menos uma letra maiuscula.");
        if (!contemMinuscula) System.out.println("Deve conter pelo menos uma letra minuscula.");
        if (!contemNumero) System.out.println("Deve conter pelo menos um número.");
        if (!contemEspecial) System.out.println("Deve conter pelo menos um caractere especial.");
    }
    scanner.close();
    }
}