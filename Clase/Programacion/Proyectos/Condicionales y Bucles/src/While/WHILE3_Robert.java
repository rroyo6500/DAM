package While;

import java.util.Scanner;

/**
 *
 * @author r.royo
 */
public class WHILE3_Robert {
    
    public static final Scanner IN = new Scanner(System.in);

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        System.out.print("Introduce un numero: ");
        int n = IN.nextInt();
        
        int c = 0;
        while (c <= n) {
            if ((c % 3) == 0) {
                System.out.println(c);
            }
            c++;
        }
        
    }

}
