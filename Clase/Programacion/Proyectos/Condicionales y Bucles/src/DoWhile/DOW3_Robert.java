package DoWhile;

import java.io.PrintStream;
import java.util.Scanner;

/**
 *
 * @author r.royo
 */
public class DOW3_Robert {

    static {
        System.setOut(new PrintStream(System.out, true, java.nio.charset.StandardCharsets.UTF_8));
        System.setErr(new PrintStream(System.err, true, java.nio.charset.StandardCharsets.UTF_8));
    }
    
    public static final Scanner IN = new Scanner(System.in);
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int numero = 0;
        int tmp;
        
        do {
            System.out.print("Introduce un numero: ");
            tmp = IN.nextInt();
            
            if (tmp > numero) numero = tmp;
        } while (tmp >= 0);
        
        System.out.println("El numero mas grande introducido es: " + numero);
        
    }

}
