import java.util.Scanner;

public class controle_chamados {

    static Scanner entrada = new Scanner(System.in);

    public static void main(String[] args) {

        int[][] chamados = carregar();

        verificaErros(chamados);

        int[] qtdCriterios = verificaCriterios(chamados);
        System.out.println("Relatório Critérios");
        for (int i = 0; i < 4; i++) {
            System.out.println("Qtd critérios " + (i + 1) + ": " + qtdCriterios[i]);
        }
    }

    public static int[][] carregar() {
        int[][] chamados = new int[5][3];

        for (int linhas = 0; linhas < 5; linhas++) {

            System.out.println("Digite o ID do funcionário: ");
            chamados[linhas][0] = entrada.nextInt();

            System.out.println("Digite o código do erro: ");
            chamados[linhas][1] = entrada.nextInt();
            while (chamados[linhas][1] < 0 || chamados[linhas][1] > 3) {
                System.out.println("Digite o código do erro 1, 2 ou 3: ");
                chamados[linhas][1] = entrada.nextInt();
            }

            System.out.println("Digite o código do critério 1, 2, 3 ou 4: ");
            chamados[linhas][2] = entrada.nextInt();
            while (chamados[linhas][2] < 0 || chamados[linhas][2] > 4) {
                System.out.println("Digite o código do critério 1, 2, 3 ou 4: ");
                chamados[linhas][2] = entrada.nextInt();
            }
        }

        return chamados;
    }

    public static void verificaErros(int[][] chamados) {
        int[] erros = new int[3];

        for (int i = 0; i < 5; i++) {
            if (chamados[i][1] == 1) {
                erros[0]++;
            } else if (chamados[i][1] == 2) {
                erros[1]++;
            } else {
                erros[2]++;
            }
        }

        System.out.println("Relatório de Erros:");
        for (int i = 0; i < 3; i++) {
            System.out.println("Qtd erros " + (i + 1) + ": " + erros[i]);
        }
    }

    public static int[] verificaCriterios(int[][] chamados) {
        int[] qtdCriterios = new int[4];

        for (int linhas = 0; linhas < 5; linhas++) {
            if (chamados[linhas][2] == 1) {
                qtdCriterios[0]++;
            } else if (chamados[linhas][2] == 2) {
                qtdCriterios[1]++;
            } else if (chamados[linhas][2] == 3) {
                qtdCriterios[2]++;
            } else {
                qtdCriterios[3]++;
            }
        }

        return qtdCriterios;
    }
}
