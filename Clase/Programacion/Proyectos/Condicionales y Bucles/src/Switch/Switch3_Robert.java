package Switch;

import java.io.PrintStream;
import java.util.Scanner;

/**
 *
 * @author r.royo
 */
public class Switch3_Robert {
    
    static {
        System.setOut(new PrintStream(System.out, true, java.nio.charset.StandardCharsets.UTF_8));
        System.setErr(new PrintStream(System.err, true, java.nio.charset.StandardCharsets.UTF_8));
    }
    
    public static final Scanner IN = new Scanner(System.in);

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        System.out.print("Introdueix la teva edat: ");
        int edat = IN.nextInt();
        
        switch (edat) {
            case 3, 4, 5 -> System.out.println("Infantil");
            case 6, 7, 8, 9, 10, 11 -> System.out.println("Primaria");
            case 12, 13, 14, 15, 16 -> System.out.println("Secundaria");
        }
        
    }

}
