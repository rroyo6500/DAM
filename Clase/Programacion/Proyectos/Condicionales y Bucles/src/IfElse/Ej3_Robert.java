package IfElse;

import java.io.PrintStream;
import java.util.Scanner;

/**
 *
 * @author r.royo
 */
public class Ej3_Robert {
    
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
        
        if (numero > 50 && numero < 100) {
            System.out.println("El numero " + numero + " esta entre los numeros 50 y 100");
        } else {
            System.out.println("El numero " + numero + " no esta entre los numeros 50 y 100");
        }
        
    }

}
