package Switch;

import java.io.PrintStream;
import java.util.Scanner;

/**
 *
 * @author r.royo
 */
public class Switch2_Robert {
    
    static {
        System.setOut(new PrintStream(System.out, true, java.nio.charset.StandardCharsets.UTF_8));
        System.setErr(new PrintStream(System.err, true, java.nio.charset.StandardCharsets.UTF_8));
    }
    
    public static final Scanner IN = new Scanner(System.in);

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        System.out.print("Introdueix un numero de mes (1 - 12): ");
        int mes = IN.nextInt();
        
        switch (mes) {
            case 1 -> System.out.println("Gener");
            case 2 -> System.out.println("Febrer");
            case 3 -> System.out.println("Març");
            case 4 -> System.out.println("Abril");
            case 5 -> System.out.println("Maig");
            case 6 -> System.out.println("Juny");
            case 7 -> System.out.println("Juliol");
            case 8 -> System.out.println("Agost");
            case 9 -> System.out.println("Septembre");
            case 10 -> System.out.println("Octubre");
            case 11 -> System.out.println("Novembre");
            case 12 -> System.out.println("Desembre");
            default -> System.err.println("Numero de mes no disponible");
        }
        
    }

}
