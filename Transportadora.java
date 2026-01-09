import java.text.DecimalFormat;
import java.util.Scanner;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Transportadora {

    static Scanner entrada = new Scanner(System.in);

    public static void main(String[] args) {

        DecimalFormat fMoeda = new DecimalFormat("R$ ##0.00");

        System.out.println("-----------------------------------");
        System.out.println("------ TRANSPORTADORA EXPRESS ------");
        System.out.println("-----------------------------------");

        int codigoCarga;
        int codigoEst;
        double carga;

        System.out.println("Digite o código da carga:");
        codigoCarga = entrada.nextInt();

        while (codigoCarga < 1 || codigoCarga > 30) {
            System.out.println("Código da carga inválido. Digite corretamente!");
            codigoCarga = entrada.nextInt();
        }

        System.out.println("Digite a carga do caminhão em toneladas:");
        carga = entrada.nextDouble();

        System.out.println("Digite o código do estado:");
        codigoEst = entrada.nextInt();

        // Preço da carga do caminhão
        double precoCarga = calcula(codigoCarga, carga);
        System.out.println("Preço total: " + fMoeda.format(precoCarga));

        // Preço final com imposto
        double precoFinal = calcImp(codigoEst, precoCarga);
        System.out.println("Preço da carga com imposto: " + fMoeda.format(precoFinal));
    }

    public static double calcula(int codigoCarga, double carga) {

        double precoCarga;

        if (codigoCarga <= 10) {
            precoCarga = (carga * 1000) * 120;
        } else if (codigoCarga <= 20) {
            precoCarga = (carga * 1000) * 200;
        } else {
            precoCarga = (carga * 1000) * 280;
        }

        return precoCarga;
    }

    public static double calcImp(int codigoEst, double precoCarga) {

        double precoFinal = 0;

        switch (codigoEst) {
            case 1:
                precoFinal = precoCarga * 1.25;
                break;
            case 2:
                precoFinal = precoCarga * 1.20;
                break;
            case 3:
                precoFinal = precoCarga * 1.15;
                break;
        }

        return precoFinal;
    }
}
