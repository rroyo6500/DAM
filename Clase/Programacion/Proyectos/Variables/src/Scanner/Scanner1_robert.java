package Scanner;

import java.util.Scanner;

/**
 *
 * @author r.royo
 */
public class Scanner1_robert {

    public static final Scanner IN = new Scanner(System.in);
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        System.out.print("Introdueix el teu nom: ");
        String nom = IN.nextLine();
        
        System.out.println("El meu nom es " + nom);
        
    }

}
