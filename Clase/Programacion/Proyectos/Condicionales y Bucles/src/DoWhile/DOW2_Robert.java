package DoWhile;

import java.io.PrintStream;
import java.util.Scanner;

/**
 *
 * @author r.royo
 */
public class DOW2_Robert {

    static {
        System.setOut(new PrintStream(System.out, true, java.nio.charset.StandardCharsets.UTF_8));
        System.setErr(new PrintStream(System.err, true, java.nio.charset.StandardCharsets.UTF_8));
    }
    
    public static final Scanner IN = new Scanner(System.in);
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        char letra;
        
        do {
            System.out.print("Introduce una letra: ");
            letra = IN.next().charAt(0);
            
            if (letra != 'c' && letra != 'C') System.err.println("Letra incorrecta");
        } while (letra != 'c' && letra != 'C');
        
        System.out.println("Gracies");
        
    }

}
