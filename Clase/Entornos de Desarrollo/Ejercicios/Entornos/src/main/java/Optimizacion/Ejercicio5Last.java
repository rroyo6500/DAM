package Optimizacion;

import java.io.PrintStream;
import java.util.Scanner;

public class Ejercicio5Last {

    static {
        System.setOut(new PrintStream(System.out, true, java.nio.charset.StandardCharsets.UTF_8));
        System.setErr(new PrintStream(System.err, true, java.nio.charset.StandardCharsets.UTF_8));
    }

    public static final Scanner IN = new Scanner(System.in);

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        String[][] countries = {
                {"Denmark", "Copenhagen"},
                {"France", "Paris"},
                {"Italy", "Rome"},
                {"Germany", "Berlin"},
                {"United Kingdom", "London"}
        };

        while (true) {
            try {

                for (int i = 0; i < countries.length; i++) {
                    System.out.println(countries[i][0]);
                }
                System.out.print("\nIntroduce el nombre de un pais de entre los anteriores: ");
                String pais = IN.nextLine();

                int c = 0;
                for (int i = 0; i < countries.length; i++) {
                    if (!countries[i][0].toLowerCase().equals(pais.toLowerCase())) {
                        c++;
                    } else {
                        break;
                    }
                }
                if (c == countries.length) {
                    throw new IllegalArgumentException("ERROR: Pais no encontrado.");
                }

                for (int i = 0; i < countries.length; i++) {
                    if (pais.toLowerCase().equals(countries[i][0].toLowerCase())) {
                        System.out.println("Pais: " + countries[i][0] + " | Capital: " + countries[i][1]);
                        break;
                    }
                }

                break;
            } catch (IllegalArgumentException iae) {
                System.err.println(iae.getMessage());
            }

        }

    }

}
