package excepciones;

import java.util.Scanner;

/**
 *
 * @author r.royo
 */
public class Exc1_Robert {
    
    public static final Scanner IN = new Scanner(System.in);

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        String str = "";
        try {
            System.out.print("Introduce un String: ");
            str = IN.nextLine();
            int num = Integer.parseInt(str);
            
            System.out.println("El numero introducido es: " + num);
            
        } catch (NumberFormatException nfe) {
            System.out.println("El texto introducido es: " + str);
        }
        
    }

}
