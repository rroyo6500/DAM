package Strings;

/**
 *
 * @author r.royo
 */
public class Strings9_robert {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        String texto1 = "princep";
        String texto2 = "principal";
        String texto3 = "principi";
        String texto4 = "primer";
        
        System.out.println("El texto '" + texto1 + "' contiene el prefijo 'prin'? " + texto1.contains("prin"));
        System.out.println("El texto '" + texto2 + "' contiene el prefijo 'prin'? " + texto2.contains("prin"));
        System.out.println("El texto '" + texto3 + "' contiene el prefijo 'prin'? " + texto3.contains("prin"));
        System.out.println("El texto '" + texto4 + "' contiene el prefijo 'prin'? " + texto4.contains("prin"));
        
    }

}
