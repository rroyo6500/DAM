package DoWhile;

import java.io.PrintStream;
import java.util.Scanner;

/**
 *
 * @author r.royo
 */
public class DOW4_Robert {

    static {
        System.setOut(new PrintStream(System.out, true, java.nio.charset.StandardCharsets.UTF_8));
        System.setErr(new PrintStream(System.err, true, java.nio.charset.StandardCharsets.UTF_8));
    }
    
    public static final Scanner IN = new Scanner(System.in);
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        do {
            
            System.out.print("Introduce un nombre de usuario: ");
            String userName = IN.nextLine();
            
            System.out.print("El nombre de usuario '" + userName + "' es correcto (S | N)? ");
            char c = IN.next().charAt(0);
            IN.nextLine();
            if (c == 'S' || c == 's') {
                break;
            }
        } while (true);
        
        System.out.println("Nombre de usuario creado correctamente");
        
    }

}
