package DoWhile;

import java.io.PrintStream;
import java.util.Scanner;

/**
 *
 * @author r.royo
 */
public class DOW1_Robert {

    static {
        System.setOut(new PrintStream(System.out, true, java.nio.charset.StandardCharsets.UTF_8));
        System.setErr(new PrintStream(System.err, true, java.nio.charset.StandardCharsets.UTF_8));
    }
    
    public static final Scanner IN = new Scanner(System.in);
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int numero;
        
        do {
            System.out.print("Introduce un numero: ");
            numero = IN.nextInt();
            
            if (numero < 0) {
                System.err.println("Error: El numero deve ser positivo.");
            }
        } while (numero < 0);
        
        do {
            System.out.println(numero);
            numero--;
        } while (numero >= 0);
        
    }

}
