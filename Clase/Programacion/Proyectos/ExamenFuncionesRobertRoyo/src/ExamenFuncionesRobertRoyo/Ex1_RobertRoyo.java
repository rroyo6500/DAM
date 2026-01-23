package ExamenFuncionesRobertRoyo;

import java.io.PrintStream;

/**
 *
 * @author r.royo
 */
public class Ex1_RobertRoyo {

    static {
        System.setOut(new PrintStream(System.out, true, java.nio.charset.StandardCharsets.UTF_8));
        System.setErr(new PrintStream(System.err, true, java.nio.charset.StandardCharsets.UTF_8));
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        verificarContingut("informatica", "info");
        
    }
    
    public static void verificarContingut(String texto1, String texto2) {
        if (texto1.toLowerCase().contains(texto2.toLowerCase()) || texto2.toLowerCase().contains(texto1.toLowerCase())) System.out.println("Un String conté l'altre");
        else System.out.println("Els Strings són completament infependents");
    }

}
