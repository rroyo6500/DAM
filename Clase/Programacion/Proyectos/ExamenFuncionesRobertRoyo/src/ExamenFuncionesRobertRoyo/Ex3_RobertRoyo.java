package ExamenFuncionesRobertRoyo;

import java.io.PrintStream;

/**
 *
 * @author r.royo
 */
public class Ex3_RobertRoyo {

    static {
        System.setOut(new PrintStream(System.out, true, java.nio.charset.StandardCharsets.UTF_8));
        System.setErr(new PrintStream(System.err, true, java.nio.charset.StandardCharsets.UTF_8));
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double[] notas = {5.6, 7.45, 8.56, 9.71, 10};
        
        System.out.println(notaMitjana(notas));
        
    }
    
    public static double notaMitjana(double[] notas) {
        double suma = 0;
        for (int i = 0; i < notas.length; i++) {
            suma += notas[i];
        }
        return suma / (double) notas.length;
    }

}
