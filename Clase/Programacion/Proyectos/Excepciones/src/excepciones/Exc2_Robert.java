package excepciones;

import java.io.PrintStream;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author r.royo
 */
public class Exc2_Robert {

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
            System.out.print("Introduce un numero entro 1 y 10: ");
            int numero = IN.nextInt();

            switch (numero) {
                case 1 ->
                    System.out.println("uno");
                case 2 ->
                    System.out.println("dos");
                case 3 ->
                    System.out.println("tres");
                case 4 ->
                    System.out.println("cuatro");
                case 5 ->
                    System.out.println("cinco");
                case 6 ->
                    System.out.println("seis");
                case 7 ->
                    System.out.println("siete");
                case 8 ->
                    System.out.println("ocho");
                case 9 ->
                    System.out.println("nueve");
                case 10 ->
                    System.out.println("diez");
                default -> {
                    if (numero < 1) {
                        throw new IllegalArgumentException("ERROR: Debes introducir un numero mayor o igual que 1.");
                    } else {
                        throw new IllegalArgumentException("ERROR: Debes introducir un numero menor o igual que 10.");
                    }
                }
            }
            
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        } catch (InputMismatchException ime) {
            System.out.println("ERROR: Solo puedes introducir numeros enteros.");
        }

    }

}
