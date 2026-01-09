import java.text.DecimalFormat;
import java.util.Scanner;


public class relatorio_vendas {
    static DecimalFormat fMoeda = new DecimalFormat("R$ ##0.00");
    static int [] arrayQuant= new int[5];
    static double totalGeral;
    static Scanner entrada = new Scanner(System.in);
    public static void main(String[] args) {
        String [] arrayCarro=new String[]{"Classic","Cobalt","Onix","Prisma","Cruze"};

        double [] arrayPreco=new double[]{33600,44900,37790,43150,55400};

        double[][] vendas = new double[4][5];

        vendas = qtdVendasTri(arrayCarro,vendas);

        double [] valTotal = calculaValorFinal(vendas,arrayPreco);

        relatorio(arrayCarro,valTotal,vendas);

    }

    public static double[][] qtdVendasTri(String[] arrayCarro,double[][] vendas){
        for (int j = 0; j < 4; j++) {
            System.out.println("VENDAS "+(j+1)+"° TRI");
            for (int i = 0; i < 5; i++) {
                System.out.println("Carro " + arrayCarro[i] + ":");
                vendas[j][i] = entrada.nextDouble();
            }
        }
        return vendas;
    }


    public static double[] calculaValorFinal(double[][] vendas, double[] arrayPreco){
        double[] valTotal = new double[5];
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 5; j++) {
                valTotal[j]+=(vendas[i][j]*arrayPreco[j]);
                System.out.println();
                arrayQuant[j]+=vendas[i][j];
            }

        }
        return valTotal;
    }

    public static void relatorio(String[] arrayCarro, double[] valTotal, double[][] vendas){
        System.out.println("RELATÓRIO GERENCIAL VIGORITO");
        for (int i = 0; i < 5; i++) {
            totalGeral+=valTotal[i];
            System.out.println("Carro:" + arrayCarro[i] + " Quantidade Geral:" + arrayQuant[i]
                    + " Total:" + fMoeda.format(valTotal[i]));
            System.out.println();
        }
        System.out.println("Total geral de vendas 2014:"+fMoeda.format(totalGeral));

    }

}