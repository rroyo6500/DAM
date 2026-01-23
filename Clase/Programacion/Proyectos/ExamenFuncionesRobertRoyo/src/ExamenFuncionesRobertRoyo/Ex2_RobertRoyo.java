package ExamenFuncionesRobertRoyo;

import java.io.PrintStream;

/**
 *
 * @author r.royo
 */
public class Ex2_RobertRoyo {

    static {
        System.setOut(new PrintStream(System.out, true, java.nio.charset.StandardCharsets.UTF_8));
        System.setErr(new PrintStream(System.err, true, java.nio.charset.StandardCharsets.UTF_8));
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int n1 = 100;
        int n2 = 10;
        
        if(esMultiple(n1, n2)) System.out.println("Els numeros son multiples"); 
        else System.out.println("Els numeros no son multiples");
        
    }
    
    public static boolean esMultiple(int n1, int n2) {
        if (n2 == 0) throw new IllegalArgumentException("El segon numero no pot ser 0 o negatiu");
        
        return n1 % n2 == 0;
    }

}
