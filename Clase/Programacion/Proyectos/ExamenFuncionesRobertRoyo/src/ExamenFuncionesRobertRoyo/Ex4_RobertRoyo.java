package ExamenFuncionesRobertRoyo;

import java.io.PrintStream;
import java.util.Scanner;

/**
 *
 * @author r.royo
 */
public class Ex4_RobertRoyo {

    static {
        System.setOut(new PrintStream(System.out, true, java.nio.charset.StandardCharsets.UTF_8));
        System.setErr(new PrintStream(System.err, true, java.nio.charset.StandardCharsets.UTF_8));
    }
    
    public static final Scanner IN = new Scanner(System.in);
    
    public static double ample;
    public static double longitud;
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        System.out.print("Introdueix un ample: ");
        ample = IN.nextDouble();
        
        System.out.print("Introdueix la longitud d'un rectangle: ");
        longitud = IN.nextDouble();
        
        menu();
    }
    
    public static void menu() {
        System.out.println("Vols calcular l'area o el perimetre? (1 - Area | 2 - Perimetre");
        System.out.print("\t- ");
        int opcion = IN.nextInt();
        
        switch (opcion) {
            case 1 -> System.out.println("Area: " + areaRectangle());
            case 2 -> System.out.println("Perimetre: " + perimetreRectangle());
            default -> {
                System.err.println("ERROR: Opcion no valida");
                menu();
            }
        }
    }
    
    public static double areaRectangle() {
        return longitud * ample;
    }
    
    public static double perimetreRectangle() {
        return (double) 2 * (longitud + ample);
    }

}
