package arrays2d;

import java.io.PrintStream;

/**
 *
 * @author r.royo
 */
public class RobertRoyo_Arr2d1 {

    static {
        System.setOut(new PrintStream(System.out, true, java.nio.charset.StandardCharsets.UTF_8));
        System.setErr(new PrintStream(System.err, true, java.nio.charset.StandardCharsets.UTF_8));
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int[][] bidi = {{3,4,5,4},{1,2,3,4},{7,8,6,4}};
        
        System.out.println(bidi[2][3]);
        
    }

}
