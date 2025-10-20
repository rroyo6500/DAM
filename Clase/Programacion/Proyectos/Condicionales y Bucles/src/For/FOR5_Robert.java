package For;

import java.util.Scanner;

/**
 *
 * @author r.royo
 */
public class FOR5_Robert {

    public static final Scanner IN = new Scanner(System.in);
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        System.out.println("Introduce 5 numeros para la media: ");
        double media = 0;
        for (int i = 0; i < 5; i++) {
            
            System.out.print("    - ");
            double numero = IN.nextDouble();
            
            media += numero;
            
        }
        System.out.println("La media es: " + (media / 5));
        
    }

}
