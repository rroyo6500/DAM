package ExamenArray_RobertRoyo;

/**
 *
 * @author r.royo
 */
public class RobertRoyo_Ejercicio1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int[] numeros = {12, 3, 15, 7, 1, 14, 9, 4, 11, 6, 2, 13, 5, 8, 10};
        int[] numeros2 = new int[numeros.length];
        
        for (int i = 0; i < numeros.length; i++) {
            numeros2[i] = numeros[i]*4;
        }
        
        System.out.println("Numeros:");
        for (int i = 0; i < numeros.length; i++) {
            System.out.print(numeros[i] + "  ");
        }
        
        System.out.println("\nNumeros2:  (x4)");
        for (int i = 0; i < numeros2.length; i++) {
            System.out.print(numeros2[i] + "  ");
        }
        System.out.println("");
        
    }

}
