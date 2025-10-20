package While;

import java.util.Scanner;

/**
 *
 * @author r.royo
 */
public class WHILE4_Robert {

    public static final Scanner IN = new Scanner(System.in);
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int i = 1;
        int sum = 0;
        while (i > 0) {
            System.out.print("Introduce un numero: ");
            i = IN.nextInt();
            sum += i;
        }
        System.out.println("Resultado de la suma: " + sum);
        
    }

}
