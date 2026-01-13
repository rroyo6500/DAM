package ExamenRobertRoyo;

import java.io.PrintStream;
import java.util.Scanner;
import java.util.InputMismatchException;

/**
 *
 * @author r.royo
 */
public class Ex2 {

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
            System.out.println("""
                           Seleciona un animal per veure la seva informació:
                           \t1. Lleó
                           \t2. Òs Polar
                           \t3. Pingüí
                           """);
            System.out.print("\t- ");
            int opcion = IN.nextInt();
            
            if (!(opcion >= 1 && opcion <= 3)) {
                throw new IllegalArgumentException("Opció no valida");
            }
            
            String misatge = """
                             ================================
                             Animal: %s
                             ================================
                             Hàbitat: %s
                             Dieta: %s
                             Color: %s
                             ================================
                             """;
            switch (opcion) {
                case 1 -> System.out.println(String.format(misatge, 
                        TStyle.yellow("Lleó"),
                        TStyle.yellow("Sabana"),
                        TStyle.yellow("Carnívor"),
                        TStyle.yellow("Groc")
                ));
                case 2 -> System.out.println(String.format(misatge, 
                        TStyle.yellow("Òs Polar"),
                        TStyle.yellow("Àrtic"),
                        TStyle.yellow("Carnívor"),
                        TStyle.yellow("Blanc")
                ));
                case 3 -> System.out.println(String.format(misatge, 
                        TStyle.yellow("Pingüí"),
                        TStyle.yellow("Hemisferi sud"),
                        TStyle.yellow("Peixos"),
                        TStyle.yellow("Blanc i negre")
                ));
            }
            
        } catch (InputMismatchException ime) {
            System.err.println("Tens que introdüir l'opció com un numero.");
        } catch (IllegalArgumentException iae) {
            System.err.println(iae.getMessage());
        }

    }

}
