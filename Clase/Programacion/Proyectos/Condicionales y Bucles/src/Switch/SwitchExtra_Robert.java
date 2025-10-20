package Switch;

import java.io.PrintStream;
import java.util.Scanner;

/**
 *
 * @author r.royo
 */
public class SwitchExtra_Robert {

    static {
        System.setOut(new PrintStream(System.out, true, java.nio.charset.StandardCharsets.UTF_8));
        System.setErr(new PrintStream(System.err, true, java.nio.charset.StandardCharsets.UTF_8));
    }
    
    public static final Scanner IN = new Scanner(System.in);
    
    public static final double METRE_A_PEU = 0.3048; // 1 peu = 0.3048 metres
    public static final double METRE_A_POLZADA = 0.0254; // 1 polzada = 0.0254 metres
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        System.out.print("""
                         Introdueix l'operacio que vols: 
                                 1. Pasar de metres a peus
                                 2. Pasar de peus a metres
                                 3. Pasar de metres a polzades
                                 4. Pasar de polzades a metres
                                 5. Sortir
                         
                                 - """);
        int opcio = IN.nextInt();
        
        if (opcio >= 5) System.exit(0);
        
        System.out.print("Introdueix la cuantitat a convertir: ");
        double numero = IN.nextInt();
        
        double resultado = 0;
        
        switch (opcio) {
            case 1 -> resultado = numero / METRE_A_PEU;
            case 2 -> resultado = METRE_A_PEU * numero;
            case 3 -> resultado = numero / METRE_A_POLZADA;
            case 4 -> resultado = METRE_A_POLZADA * numero;
        }
        
        System.out.println("El resultat de la conversio es: " + String.format("%.4f", resultado));
        
    }

}
