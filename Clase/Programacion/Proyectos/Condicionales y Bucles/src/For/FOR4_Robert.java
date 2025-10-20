package For;

import java.util.Scanner;

/**
 *
 * @author r.royo
 */
public class FOR4_Robert {

    public static final Scanner IN = new Scanner(System.in);
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        System.out.print("Introduce un numero: ");
        int numero = IN.nextInt();
        
        for (int i = 1; i <= 10; i++) {
            System.out.println(numero + " * " + i + " = " + (numero * i));
        }
        
    }

}
