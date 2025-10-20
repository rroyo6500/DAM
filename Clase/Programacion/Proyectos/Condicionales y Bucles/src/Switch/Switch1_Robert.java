package Switch;

import java.io.PrintStream;
import java.util.Scanner;

/**
 *
 * @author r.royo
 */
public class Switch1_Robert {

    static {
        System.setOut(new PrintStream(System.out, true, java.nio.charset.StandardCharsets.UTF_8));
        System.setErr(new PrintStream(System.err, true, java.nio.charset.StandardCharsets.UTF_8));
    }
    
    public static final Scanner IN = new Scanner(System.in);
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        System.out.print("Introdueix un dia de la setmana (1 - 7): ");
        int dia = IN.nextInt();
        
        switch (dia) {
            case 1, 2, 3, 4, 5 -> System.out.println("Dia Laborable");
            case 6, 7 -> System.out.println("Dia No Laborable");
            default -> System.err.println("Numero de dia no valido");
        }
        
    }

}
