package While;

import java.util.Scanner;

/**
 *
 * @author r.royo
 */
public class WHILE6_Robert {

    public static final Scanner IN = new Scanner(System.in);
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int numeroSecreto = (int) (Math.random() * 10)+1;
        
        System.out.println("Adivina el numero secreto en 3 intentos. (1 - 10)");
        
        int i = 0;
        while (i < 3) {
            System.out.print("Introduce un numero: ");
            int n = IN.nextInt();
            
            if (n == numeroSecreto) {
                System.out.println("Has adivinado el numero secreto.");
                break;
            }
            i++;
            
            if (i != 3) System.out.println("Intentalo de nuevo.");
            else System.out.println("Has perdido. Te has quedado sin intentos");
        }
        
    }

}
