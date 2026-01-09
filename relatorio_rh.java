import java.util.Scanner;

public class relatorio_rh {

    static Scanner entrada = new Scanner(System.in);

    public static void main(String[] args) {

        String[] nomes = new String[4];
        int[] tempo = new int[4];
        double[] salario = new double[4];

        for (int i = 0; i < 4; i++) {
            System.out.println("Digite o nome dos funcionários: ");
            nomes[i] = entrada.next();

            System.out.println("Digite o tempo de empresa: ");
            tempo[i] = entrada.nextInt();

            System.out.println("Digite o salário: ");
            salario[i] = entrada.nextDouble();
        }

        String[] analise = verifica(tempo, salario);
        relatorio(nomes, analise);
    }

    public static String[] verifica(int[] tempo, double[] salario) {
        String[] analise = new String[4];

        for (int i = 0; i < 4; i++) {
            if (tempo[i] > 3 || salario[i] < 700) {
                analise[i] = "Reajuste";
            } else {
                analise[i] = "Não Reajuste";
            }
        }
        return analise;
    }

    public static void relatorio(String[] nomes, String[] analise) {
        System.out.println("Relatório RH");
        for (int i = 0; i < 4; i++) {
            System.out.println(nomes[i] + " - " + analise[i]);
        }
    }
}
