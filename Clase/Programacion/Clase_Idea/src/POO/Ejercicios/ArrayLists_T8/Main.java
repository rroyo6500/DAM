package POO.Ejercicios.ArrayLists_T8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<Libro> libros = new ArrayList<>(
                Arrays.asList(
                        new Libro("The Midnight Library", "Matt Haig", 2020),
                        new Libro("Educated", "Tara Westover", 2018),
                        new Libro("The Catcher in the Rye", "J.D. Salinger", 1951)
                )
        );

        for (Libro libro : libros) {
            if (libro.getAnio() > 2000) {
                System.out.println(libro);
            }
        }

    }

}
