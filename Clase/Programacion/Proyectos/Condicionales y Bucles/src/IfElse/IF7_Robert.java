package IfElse;

import java.io.PrintStream;
import java.util.Scanner;

/**
 *
 * @author r.royo
 */
public class IF7_Robert {

    static {
        System.setOut(new PrintStream(System.out, true, java.nio.charset.StandardCharsets.UTF_8));
        System.setErr(new PrintStream(System.err, true, java.nio.charset.StandardCharsets.UTF_8));
    }
    
    public static final Scanner IN = new Scanner(System.in);
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        System.out.print("Introduce tu nota: ");
        double nota = IN.nextInt();
        
        if (nota < 5) {
            System.out.println("Suspes");
        } else if (nota < 5) {
            System.out.println("Aprovat");
        } else if (nota < 6) {
            System.out.println("Bé");
        } else if (nota < 9) {
            System.out.println("Notable");
        } else if (nota == 9) {
            System.out.println("Excelent");
        } else {
            System.out.println("Matricula d'honor");
        }
        
    }

}
