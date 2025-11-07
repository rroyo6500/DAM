package ExamenRobertRoyo;

import java.io.PrintStream;
import java.util.Scanner;
import java.util.InputMismatchException;

/**
 *
 * @author r.royo
 */
public class Ex3 {

    static {
        System.setOut(new PrintStream(System.out, true, java.nio.charset.StandardCharsets.UTF_8));
        System.setErr(new PrintStream(System.err, true, java.nio.charset.StandardCharsets.UTF_8));
    }

    public static final Scanner IN = new Scanner(System.in);

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        try {
            System.out.print("Introdueix un numero positiu: ");
            int numero = IN.nextInt();

            if (numero < 0) {
                throw new IllegalArgumentException("Tens que introduir un numero positiu");
            }
            
            String resultat = "";
            int c = 0;
            for (int i = 1; i <= numero; i++) {
                if ((i % 4) == 0) {
                    resultat += i + "  ";
                    c++;
                }
            }
            System.out.println("Múltiples de 4: " + TStyle.cyan(resultat));
            System.out.println("Total de múltiples de 4: " + TStyle.green(c));
        } catch (InputMismatchException ime) {
            System.err.println("Tens que introduir un numero");
        } catch (IllegalArgumentException iae) {
            System.err.println(iae.getMessage());
        }

    }

}
