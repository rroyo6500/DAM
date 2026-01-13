package arrays;

import java.io.PrintStream;
import java.util.Scanner;

/**
 *
 * @author r.royo
 */
public class RobertRoyo_Arrays3 {

    static {
        System.setOut(new PrintStream(System.out, true, java.nio.charset.StandardCharsets.UTF_8));
        System.setErr(new PrintStream(System.err, true, java.nio.charset.StandardCharsets.UTF_8));
    }
    
    public static final Scanner IN = new Scanner(System.in);
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        double[] arrayNotes = {3, 5.5, 2, 10, 4.9, 8, 8.5, 7, 6.6, 0.25, 9, 7};
        
        double media = 0;
        for (int i = 0; i < arrayNotes.length; i++) {
            media += arrayNotes[i];
        }
        media /= arrayNotes.length;
        
        System.out.println("Media: " + String.format("%.2f", media));
        
    }

}
