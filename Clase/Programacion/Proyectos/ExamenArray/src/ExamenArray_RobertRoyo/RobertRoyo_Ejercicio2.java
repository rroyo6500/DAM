package ExamenArray_RobertRoyo;

/**
 *
 * @author r.royo
 */
public class RobertRoyo_Ejercicio2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int[] nums = {1, -2, -6, -6, 7, 1, 2, -3, 7, -9, 15, -18};
        String[] pos_neg = new String[nums.length];

        for (int i = 0; i < nums.length; i++) {
            pos_neg[i] = nums[i] < 0 ? "Negatiu" : "Positiu" ;
        }
        
        for (int i = 0; i < pos_neg.length; i++) {
            System.out.println(nums[i] + " -> " + pos_neg[i]);
        }
        
    }

}
