package excepciones;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author r.royo
 */
public class Exc0_Robert {

    public static final Scanner IN = new Scanner(System.in);

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        try {
            System.out.print("Introduce un numero: ");
            int num = IN.nextInt();
            System.out.println("El numero es: " + num);
        } catch (InputMismatchException ime) {
            System.out.println("ERROR: Debes introducir solo numeros");
        }

    }

}
