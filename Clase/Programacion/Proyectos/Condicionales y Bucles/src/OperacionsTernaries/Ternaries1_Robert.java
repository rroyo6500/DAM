package OperacionsTernaries;

import java.io.PrintStream;
import java.util.Scanner;

/**
 *
 * @author r.royo
 */
public class Ternaries1_Robert {
    
    static {
        System.setOut(new PrintStream(System.out, true, java.nio.charset.StandardCharsets.UTF_8));
        System.setErr(new PrintStream(System.err, true, java.nio.charset.StandardCharsets.UTF_8));
    }
    
    public static final Scanner IN = new Scanner(System.in);

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        System.out.print("Introdueix un numero: ");
        int numero = IN.nextInt();
        
        String resultat = (numero % 2 == 0) ? "Parell" : "Senar";
        
        System.out.println(resultat);
        
    }

}
