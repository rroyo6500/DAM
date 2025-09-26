package Scanner;

import java.util.Scanner;

/**
 *
 * @author r.royo
 */
public class Scanner5_robert {

    public static final Scanner IN = new Scanner(System.in);
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        String contr = "java123";
        
        System.out.print("Introdueix la contrasenya: ");
        String contrasenya = IN.nextLine();
        
        System.out.println(contr.equals(contrasenya));
        
    }

}
