package RA7_ExamenPOO_RobertRoyo;

import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

/**
 *
 * @author r.royo
 */
public class MainExamenPOO {

    static {
        System.setOut(new PrintStream(System.out, true, java.nio.charset.StandardCharsets.UTF_8));
        System.setErr(new PrintStream(System.err, true, java.nio.charset.StandardCharsets.UTF_8));
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        ArrayList<FilmoMetraje> lista = new ArrayList<>(Arrays.asList(
                // Peliculas
                new Pelicula("Spiderman: No way home", "Jon Watts", false, 148, "Tom Holland"),
                new Pelicula("Aves de presa", "Cathy yan", false, 109, "Margot Robbie"),
                new Pelicula("El irlandés", "Martin Scorsese", true, 209, "Robert de Niro", "Joe Pesci"),
                
                // Series
                new Serie("The Blacklist", "Jon Bokenkamp", false, 9),
                new Serie("Stranger Things", "Matt duffer", true, 3),
                new Serie("Fleabag", "Phobe Wall-Bridge", false, 2)
        ));
        Collections.shuffle(lista);
        
        for (FilmoMetraje fm : lista) {
            System.out.println(fm);
            if (fm instanceof Pelicula p && p.getDuracion() > 120) {
                p.reproducir();
            } else if (fm instanceof Serie s && !s.isFromNetflix && s.getTemporadas() < 4) {
                s.reproducir();
            }
        }
        
    }

}
