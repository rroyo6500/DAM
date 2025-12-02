package arrays2d;

/**
 *
 * @author r.royo
 */
public class RobertRoyo_Arr2d4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int[][] bidi = {{3,4,5,4},{1,2,3,4},{7,8,6,4}};
        
        int sum = 0;
        int count = 0;
        for (int i = 0; i < bidi.length; i++) {
            for (int j = 0; j < bidi[i].length; j++) {
                sum += bidi[i][j];
                count++;
            }
        }
        double media = (double) sum / (double) count;
        
        System.out.println(media);
        
    }

}
