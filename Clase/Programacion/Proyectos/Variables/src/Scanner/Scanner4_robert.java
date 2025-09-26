package Scanner;

import java.util.Scanner;

/**
 *
 * @author r.royo
 */
public class Scanner4_robert {

    public static final Scanner IN = new Scanner(System.in);
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        System.out.print("Introdueix una paraula: ");
        String paraula = IN.nextLine();
        
        System.out.println("La paraula '" + paraula + "' te " + paraula.length() + " lletres");
        
    }

}
