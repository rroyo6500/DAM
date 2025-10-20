package While;

import java.util.Scanner;

/**
 *
 * @author r.royo
 */
public class WHILE2_Robert {

    public static final Scanner IN = new Scanner(System.in);
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        System.out.print("introduce un numero indicando la cantidad de '-' que quieres: ");
        int n = IN.nextInt();
        
        int c = 0;
        while (c < n) {
            System.out.print("-");
            c++;
        }
        
    }

}
