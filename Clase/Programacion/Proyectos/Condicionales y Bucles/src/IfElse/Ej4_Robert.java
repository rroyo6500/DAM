package IfElse;

import java.io.PrintStream;
import java.util.Scanner;

/**
 *
 * @author r.royo
 */
public class Ej4_Robert {

    static {
        System.setOut(new PrintStream(System.out, true, java.nio.charset.StandardCharsets.UTF_8));
        System.setErr(new PrintStream(System.err, true, java.nio.charset.StandardCharsets.UTF_8));
    }

    public static final Scanner IN = new Scanner(System.in);

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        int n1, n2;

        System.out.print("Introduce el numero 1: ");
        n1 = IN.nextInt();

        System.out.print("Introduce el numero 2: ");
        n2 = IN.nextInt();

        if (n1 == n2) {
            System.out.println("Los numeros son iguales.");
        } else {
            System.out.print("Los numeros no son iguales y ");
            if (n1 > n2) {
                System.out.println(n1 + " es mayor que " + n2);
            } else {
                System.out.println(n2 + " es mayor que " + n1);
            }

        }

    }

}
