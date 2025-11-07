package ExamenRobertRoyo;

import java.io.PrintStream;
import java.util.Scanner;

/**
 *
 * @author r.royo
 */
public class Ex4 {

    static {
        System.setOut(new PrintStream(System.out, true, java.nio.charset.StandardCharsets.UTF_8));
        System.setErr(new PrintStream(System.err, true, java.nio.charset.StandardCharsets.UTF_8));
    }

    public static final Scanner IN = new Scanner(System.in);

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        char lletra = ' ';
        do {
            try {

                System.out.print("Introdueix una lletra: ");
                lletra = Character.toLowerCase(IN.next().charAt(0));

                if (!Character.isLetter(lletra)) {
                    throw new IllegalArgumentException("Tens que introduir una lletra");
                }
                
                switch (lletra) {
                    case 'p', 'r', 'o', 'g' ->
                        System.out.println(TStyle.green("Lletra Correcta"));
                    case 's' ->
                        System.out.println(TStyle.yellow("Sortint..."));
                    default -> System.out.println(TStyle.red("Lletra Incorrecta"));
                }

            } catch (IllegalArgumentException iae) {
                System.err.println(iae.getMessage());
            }
        } while (lletra != 's');

    }

}
