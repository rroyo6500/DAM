package IfElse;

import java.io.PrintStream;
import java.util.Scanner;

/**
 *
 * @author r.royo
 */
public class IF2_Robert {
    
    static {
        System.setOut(new PrintStream(System.out, true, java.nio.charset.StandardCharsets.UTF_8));
        System.setErr(new PrintStream(System.err, true, java.nio.charset.StandardCharsets.UTF_8));
    }
    
    public static final Scanner IN = new Scanner(System.in);

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        System.out.print("Introduce un numero: ");
        int numero = IN.nextInt();
        
        if (numero % 10 == 0) {
            System.out.println("El numero " + numero + " es multiple de 10.");
        } else {
            System.out.println("El numero " + numero + " no es multiple de 10.");
        }
        
    }

}
