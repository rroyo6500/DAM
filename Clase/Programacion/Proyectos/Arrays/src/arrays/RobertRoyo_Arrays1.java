package arrays;

import java.io.PrintStream;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author r.royo
 */
public class RobertRoyo_Arrays1 {

    static {
        System.setOut(new PrintStream(System.out, true, java.nio.charset.StandardCharsets.UTF_8));
        System.setErr(new PrintStream(System.err, true, java.nio.charset.StandardCharsets.UTF_8));
    }

    public static final Scanner IN = new Scanner(System.in);

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        double[] temperaturas = {10.5, 12.3, 18.4, 22.3, 17.5};

        System.out.println("Posicion 1: " + temperaturas[1]);
        System.out.println("Posicion 4: " + temperaturas[4]);

        try {
            System.out.print("Introduce una posicion: ");
            System.out.println(temperaturas[IN.nextInt()]);
        } catch (InputMismatchException ime) {
            System.err.println("Error: Debes introducir un numero.");
        } catch (IndexOutOfBoundsException ioobe) {
            System.err.println("Error: La posicion debe ser un numeri entre 0 y 5");
        }

    }

}
