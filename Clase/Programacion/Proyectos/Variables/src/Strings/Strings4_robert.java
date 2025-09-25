package Strings;

/**
 *
 * @author r.royo
 */
public class Strings4_robert {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        String texto = "www.ceroca.cat";
        
        String str1 = texto.substring(0, 6);
        String str2 = texto.substring(6);
        
        System.out.println(str1);
        System.out.println(str2);
        System.out.println(str1.concat(str2));
        
    }

}
