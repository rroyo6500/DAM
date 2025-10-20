package While;

import java.util.Scanner;

/**
 *
 * @author r.royo
 */
public class WHILE5_Robert {

    public static final Scanner IN = new Scanner(System.in);
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int numeroSecreto = (int) (Math.random() * 10)+1;
        
        System.out.println("Adivina el numero secreto. (1 - 10)");
        while (true) {
            System.out.print("Introduce un numero: ");
            int n = IN.nextInt();
            
            if (n == numeroSecreto) {
                System.out.println("Has adivinado el numero secreto.");
                break;
            }
            
            System.out.println("Intentalo de nuevo.");
        }
        
    }

}
