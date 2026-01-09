import java.util.Scanner;

public class pontuacao_f1 {
    static Scanner entrada = new Scanner(System.in);

    static String[] pilotos = {"Max", "Lando", "Charles", "Lewis", "George"};
    static String[] nomePilotos = new String[5];

    public static void main(String[] args) {
        String[] paises = {"Bélgica", "Itália", "Cingapura", "Malásia", "Japão"};
        relatorio(paises);
    }

    public static void relatorio(String[] paises) {
        int[][] pontuacao = pontuacao(paises);

        int[] somaPontos = somaPontos(pontuacao);
        System.out.println("Pontuação por Piloto");
        for (int i = 0; i < 5; i++) {
            System.out.println(pilotos[i] + " - " + somaPontos[i]);
        }

        int[] vencedorGP = vencedorGP(pontuacao);
        for (int i = 0; i < 5; i++) {
            System.out.println("Piloto vencedor " + nomePilotos[i] + " no país: " + paises[i] + " com a pontuação: " + vencedorGP[i]);
        }

        vencedor(somaPontos);
    }

    public static int[][] pontuacao(String[] paises) {
        int[][] pontuacao = new int[5][5];
        for (int piloto = 0; piloto < 5; piloto++) {
            for (int pais = 0; pais < 5; pais++) {
                System.out.println("Pontuação GP " + paises[pais] + ": ");
                pontuacao[piloto][pais] = entrada.nextInt();
            }
        }
        return pontuacao;
    }

    public static int[] somaPontos(int[][] pontuacao) {
        int[] somaPontos = new int[5];
        for (int piloto = 0; piloto < 5; piloto++) {
            for (int pais = 0; pais < 5; pais++) {
                somaPontos[piloto] += pontuacao[piloto][pais];
            }
        }
        return somaPontos;
    }

    public static int[] vencedorGP(int[][] pontuacao) {
        int[] vencedorGP = new int[5];
        for (int pais = 0; pais < 5; pais++) {
            for (int piloto = 0; piloto < 5; piloto++) {
                if (pontuacao[piloto][pais] > vencedorGP[pais]) {
                    vencedorGP[pais] = pontuacao[piloto][pais];
                    nomePilotos[pais] = pilotos[piloto];
                }
            }
        }
        return vencedorGP;
    }

    public static void vencedor(int[] somaPontos) {
        int maiorPontuacao = 0;
        String vencedor = "";
        for (int i = 0; i < 5; i++) {
            if (somaPontos[i] > maiorPontuacao) {
                maiorPontuacao = somaPontos[i];
                vencedor = pilotos[i];
            }
        }
        System.out.println("Piloto: " + vencedor + " | Pontuação: " + maiorPontuacao);
    }
}
