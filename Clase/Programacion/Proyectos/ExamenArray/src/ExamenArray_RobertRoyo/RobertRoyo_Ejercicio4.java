package ExamenArray_RobertRoyo;

/**
 *
 * @author r.royo
 */
public class RobertRoyo_Ejercicio4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        char[][] lletres = {{'a', 'b', 'i', 'e'}, {'i', 'a', 'u', 'o'}, {'g', 'h', 'i', 'u'}};
        
        int a = 0, e = 0, i = 0, o = 0, u = 0;
        for (int j = 0; j < lletres.length; j++) {
            for (int k = 0; k < lletres[j].length; k++) {
                switch (Character.toLowerCase(lletres[j][k])) {
                    case 'a' -> a++;
                    case 'e' -> e++;
                    case 'i' -> i++;
                    case 'o' -> o++;
                    case 'u' -> u++;
                }
            }
        }
        
        System.out.println(String.format("A: %d \nE: %d \nI: %d \nO: %d \nU: %d", a, e, i, o, u)
        );
        
    }

}
