package Optimizacion;

public class CalcularImportTrucada {

    private static final double TARIFA1 = 0.04;
    private static final double TARIFA2 = 0.07;
    private static final double TARIFA3 = 0.17;
    private static final double IVA = 0.21;

    public static void main(String[] args) {
        calculaImportFactura(23, 28, 17);
    }

    public static double calculaImportFactura(int min1, int min2, int min3) {

        double total = 0;

        total += calcularTarifa("Tarifa 1", min1, TARIFA1);
        total += calcularTarifa("Tarifa 2", min2, TARIFA2);
        total += calcularTarifa("Tarifa 3", min3, TARIFA3);

        System.out.println("Preu total (sense IVA): " + total + "€");

        double totalIVA = total * (1 + IVA);
        System.out.println("Preu total (amb IVA): " + totalIVA + "€");

        return totalIVA;
    }

    private static double calcularTarifa(String nombre, int minutos, double precioMinuto) {
        double importe = minutos * precioMinuto;

        System.out.println(nombre + " - Minuts: " + minutos);
        System.out.println(nombre + " - Import (sense IVA): " + importe + "€");

        return importe;
    }
}
