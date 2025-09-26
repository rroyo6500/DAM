package Scanner;

import java.util.Scanner;

/**
 *
 * @author r.royo
 */
public class Scanner6_robert {

    public static final Scanner IN = new Scanner(System.in);
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int anyActual = 2025;
        
        System.out.print("Introdueix la teva edat: ");
        int edat = IN.nextInt();
        
        int anyDeNaixement = anyActual - edat;
        
        System.out.println("Ets del any " + anyDeNaixement);
        
    }

}
