package Optimizacion;

public class CalcularImportTrucada {

    public static void main(String[] args) {
        calculaImportFactura(23, 28, 17);
    }

    public static double calculaImportFactura(int minTarifa1, int minTarifa2, int minTarifa3) {

        double importTarifa1 = minTarifa1 * 0.04;
        System.out.println("El número de minuts de tarifa 1 és:" + minTarifa1);
        System.out.println("El preu total per a tarifa 1 (sense IVA) és:" + importTarifa1 + "€");

        double importTarifa2 = minTarifa2 * 0.07;
        System.out.println("El número de minuts de tarifa 2 és:" + minTarifa2);
        System.out.println("El preu total per a tarifa 2 (sense IVA) és:" + importTarifa2 + "€");

        double importTarifa3 = minTarifa3 * 0.17;
        System.out.println("El número de minuts de tarifa 3 és:" + minTarifa3);
        System.out.println("El preu total per a tarifa 3 (sense IVA) és:" + importTarifa3 + "€");

        double importTotal = minTarifa1 * 0.04 + minTarifa2 * 0.07 + minTarifa3 * 0.17;
        System.out.println("El preu total (sense IVA) és :" + importTotal + "€");

        double importTotalIVA = importTotal + importTotal / 100 * 21;
        System.out.println("El preu total (amb IVA) és :" + importTotalIVA + "€");

        return importTotalIVA;
    }
}

