package Conversiones;

/**
 *
 * @author r.royo
 */
public class Conversiones1_robert {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        int e = 500;
        int tiempoC1 = 6;
        int tiempoC2 = 7;

        double velocidadC1 = (double) e / (double) tiempoC1;
        double velocidadC2 = (double) e / (double) tiempoC2;

        System.out.println("Velocidad coche 1: " + String.format("%.1f", velocidadC1));
        System.out.println("Velocidad coche 2: " + String.format("%.1f", velocidadC2));

    }
}
