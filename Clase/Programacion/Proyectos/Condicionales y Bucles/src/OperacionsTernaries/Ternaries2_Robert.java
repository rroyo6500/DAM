package OperacionsTernaries;

import java.io.PrintStream;
import java.util.Scanner;

/**
 *
 * @author r.royo
 */
public class Ternaries2_Robert {

    static {
        System.setOut(new PrintStream(System.out, true, java.nio.charset.StandardCharsets.UTF_8));
        System.setErr(new PrintStream(System.err, true, java.nio.charset.StandardCharsets.UTF_8));
    }
    
    public static final Scanner IN = new Scanner(System.in);
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        System.out.print("Introdueix el primer numero: ");
        int n1 = IN.nextInt();
        
        System.out.print("Introdueix el segon numero: ");
        int n2 = IN.nextInt();
        
        int mesGran = (n1 > n2) ? n1 : n2;
        
        System.out.println(mesGran);
        
    }

}
