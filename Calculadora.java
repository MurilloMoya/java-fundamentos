import java.util.Scanner;

public class Calculadora {

    static Scanner entrada = new Scanner(System.in);

    public static void main(String[] args) {

        int opcao = 0, n1 = 0, n2 = 0;

        while (opcao != 5) {
            System.out.println();
            System.out.println("1 - Adição");
            System.out.println("2 - Subtração");
            System.out.println("3 - Multiplicação");
            System.out.println("4 - Divisão");
            System.out.println("5 - Sair");

            System.out.println("Digite a opção desejada:");
            opcao = entrada.nextInt();

            if (opcao > 0 && opcao < 5) {
                System.out.println("Digite o n1:");
                n1 = entrada.nextInt();
                System.out.println("Digite o n2:");
                n2 = entrada.nextInt();
            }

            switch (opcao) {
                case 1:
                    adicao(n1, n2);
                    break;
                case 2:
                    subtracao(n1, n2);
                    break;
                case 3:
                    multiplicacao(n1, n2);
                    break;
                case 4:
                    divisao(n1, n2);
                    break;
                case 5:
                    System.exit(0);
                default:
                    System.out.println("Opção inválida");
            }
        }
    }

    public static void adicao(int n1, int n2) {
        System.out.println("Resultado: " + (n1 + n2));
    }

    public static void subtracao(int n1, int n2) {
        System.out.println("Resultado: " + (n1 - n2));
    }

    public static void multiplicacao(int n1, int n2) {
        System.out.println("Resultado: " + (n1 * n2));
    }

    public static void divisao(int n1, int n2) {
        if (n2 == 0) {
            System.out.println("Não é possível dividir por zero");
        } else {
            System.out.println("Resultado: " + (n1 / n2));
        }


    }
}




