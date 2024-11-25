// 30 days of code - dia 5: Calculadora de IMC.
import java.util.Scanner;
import java.util.Locale;

public class CalculadoraIMC {
    public static void main (String [] args){
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
        
    // Solicita peso e altura.
        System.out.println("Insira o seu peso (kg): ");
        double peso = scanner.nextDouble();

        System.out.println("Insira sua altura (m): ");
        double altura = scanner.nextDouble();

        if (peso <= 0 || altura <= 0) {
            System.out.println("Peso e altura devem ser maiores que zero");
        }else{
            double imc = peso / (altura * altura);
            System.out.printf("Seu IMC é %.2f\n", imc);

            if (imc < 18.5){
            System.out.println("Classificação: Abaixo do peso.");

            } else if (imc < 25) {
            System.out.println("Classificação: Peso normal");

            } else if (imc < 30) {
            System.out.println("Classificação: Sobrepeso");

            } else if (imc < 35) {
            System.out.println("Classificação: Obesidade grau I");

            } else if (imc < 40) {
            System.out.println("Classificação: Obesidade grau II");

            } else {
            System.out.println("Classificação: Obesidade grau III");
            }
        }
            scanner.close();
    }   
}
