package For;

import java.io.PrintStream;
import java.util.Scanner;

/**
 *
 * @author r.royo
 */
public class FORExtra_Robert {
    
    static {
        System.setOut(new PrintStream(System.out, true, java.nio.charset.StandardCharsets.UTF_8));
        System.setErr(new PrintStream(System.err, true, java.nio.charset.StandardCharsets.UTF_8));
    }

    public static final Scanner IN = new Scanner(System.in);
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        System.out.print("Introduce un numero de usuarios para añadir: ");
        int cantUsers = IN.nextInt();
        
        String users = "";
        for (int i = 1; i <= cantUsers; i++) {
            
            System.out.print("\nIntroduce la edad del usuario " + i + ": ");
            int edat = IN.nextInt();
            IN.nextLine();
            
            System.out.print("Introduce la categoria del usuario " + i + ": ");
            String cat = IN.nextLine();
            
            users += (i + " -> " + cat + " ( " + edat + " ) " + "\n");
        }
        
        System.out.println("""
                           \n----------------------------------------\n
                           Usuarios: \n
                           ID_Usuario -> Categoria (edad)
                           """ + users);
        
    }

}
