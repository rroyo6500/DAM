package POO.Practicas.PR1;

import java.io.PrintStream;
import java.nio.charset.StandardCharsets;

public class MainEstudiants {

    static {
        System.setOut(new PrintStream(System.out, true, StandardCharsets.UTF_8));
        System.setErr(new PrintStream(System.err, true, StandardCharsets.UTF_8));
    }

    public static Estudiant[] estudiants = {
        new Estudiant("12345678Z", "Carles", "Rodríguez Pérez", "19/02/2004", "Administració i Finances", 2, 515),
        new Estudiant("87654321A", "Noel", "Espinosa Alonso", "02/05/2005", "Educació infantil", 2, 432),
        new Estudiant("12312312H", "Nerea", "López Ruiz", "21/12/2008", "Sistemes microinformàtics i xarxes", 1, 123)
    };

    public static void main(String[] args) {



    }

}
