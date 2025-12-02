package arrays2d;

import java.io.PrintStream;
import java.util.Scanner;

/**
 *
 * @author r.royo
 */
public class RobertRoyo_Arr2d7 {

    static {
        System.setOut(new PrintStream(System.out, true, java.nio.charset.StandardCharsets.UTF_8));
        System.setErr(new PrintStream(System.err, true, java.nio.charset.StandardCharsets.UTF_8));
    }
    
    public static final Scanner IN = new Scanner(System.in);
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        String[][] frutas = new String[2][3];
        
        for (int i = 0; i < frutas.length; i++) {
            for (int j = 0; j < frutas[i].length; j++) {
                System.out.print("Introduce ina fruta para añadir a la lista: ");
                frutas[i][j] = IN.nextLine();
            }
        }
        
        for (int i = 0; i < frutas.length; i++) {
            for (int j = 0; j < frutas[i].length; j++) {
                System.out.print("\t" + frutas[i][j]);
                if (j != (frutas[i].length - 1)) {
                    System.out.print("\t|");
                }
            }
            System.out.println("");
        }
        
    }

}
