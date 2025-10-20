package IfElse;

import java.io.PrintStream;
import java.util.Scanner;

/**
 *
 * @author r.royo
 */
public class IF6_Robert {

    static {
        System.setOut(new PrintStream(System.out, true, java.nio.charset.StandardCharsets.UTF_8));
        System.setErr(new PrintStream(System.err, true, java.nio.charset.StandardCharsets.UTF_8));
    }
    
    public static final Scanner IN = new Scanner(System.in);
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        System.out.print("Introduce un mes: ");
        int mes = IN.nextInt();
        
        if (mes == 3 || mes == 4 || mes == 5) { 
            System.out.println("Primavera");
        } else if (mes == 6 || mes == 7 || mes == 8) {
            System.out.println("Estiu");
        } else if (mes == 9 || mes == 10 || mes == 11) {
            System.out.println("Tardor");
        } else if (mes == 12 || mes == 1 || mes == 2) {
            System.out.println("Hivern");
        } else  {
            System.err.println("Mes no valido");
        }
        
    }

}
