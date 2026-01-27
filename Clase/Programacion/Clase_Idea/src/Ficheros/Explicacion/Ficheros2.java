package Ficheros.Explicacion;

import java.io.File;
import java.util.Date;

public class Ficheros2 {

    public static void main(String[] args) {

        infoArxiu("src\\Ficheros\\Explicacion\\prova.txt");

    }

    public static void infoArxiu(String path) {
        File fichero = new File(path);

        if (!fichero.exists()) System.out.print("No s'ha trobat el fitxer");
        else {
            if (fichero.isDirectory()) System.out.print("Es un directori");
            else {
                System.out.println(fichero.getAbsolutePath());
                dataModificacio(fichero);
            }
        }
    }

    public static void dataModificacio(File fichero) {
        System.out.print(String.format("""
                        Longitud del fichero: %d bytes
                        Ultima decha de modificacion: %s
                        """,
                fichero.length(), new Date(fichero.lastModified())
        ));
    }

}
