package proyecto1dam;

/**
 *
 * @author r.royo
 */
public class Ej7_robert {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int seg = 4000;
        
        int hores = seg / 3600;
        seg -= hores * 3600;
        
        int min = seg / 60;
        seg -= min * 60;
        
        System.out.println("Hores: " + hores + " | Minuts: " + min + " | segons: " + seg);
        
        
    }
    
}
