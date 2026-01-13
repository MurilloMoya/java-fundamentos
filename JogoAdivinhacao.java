import java.util.Random;
import java.util.Scanner;

public class JogoAdivinhacao {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        Random random = new Random();

        int numeroSecreto = random.nextInt(100) + 1;
        int tentativa;
        int tentativas = 0;

        System.out.println("Bem-vindo ao Jogo da Adivinhação!");
        System.out.println("Escolha um número de 1 a 100.");

        do {
            System.out.print("Digite seu chute: ");
            tentativa = entrada.nextInt();
            tentativas++;

            if (tentativa > numeroSecreto) {
                System.out.println("Seu chute é MAIOR que o número secreto.");
            }
            else if (tentativa < numeroSecreto) {
                System.out.println("Seu chute é MENOR que o número secreto.");
            }
            else {
                System.out.println(
                        "Parabéns! Você acertou o número (" + numeroSecreto + ") em "
                                + tentativas + " tentativas!"
                );
            }

        } while (tentativa != numeroSecreto);

        entrada.close();
    }
}
