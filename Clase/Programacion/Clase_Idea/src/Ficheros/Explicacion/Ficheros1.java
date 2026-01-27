package Ficheros.Explicacion;

import TStyle.TStyle;

import java.io.File;
import java.util.List;

public class Ficheros1 {

    public static void main(String[] args) {

        infoArxiu("src\\Ficheros\\Explicacion\\prova2.txt");
        infoArxiu("src\\Ficheros\\Explicacion");
        infoArxiu("src\\Ficheros\\Explicacion\\prova.txt");

    }

    public static void infoArxiu(String path) {
        File fichero = new File(path);

        if (!fichero.exists()) System.out.println("No s'ha trobat el fitxer");
        else {
            if (fichero.isDirectory()) System.out.println("Es un directori");
            else System.out.println(fichero.getAbsolutePath());
        }
    }

}