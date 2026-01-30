package Ficheros.Lectura;

import Utils.Auxiliar;
import Utils.FileC;

import java.io.*;
import java.nio.charset.StandardCharsets;


public class Lectura1 {

    static {
        System.setOut(new PrintStream(System.out, true, StandardCharsets.UTF_8));
        System.setErr(new PrintStream(System.err, true, StandardCharsets.UTF_8));
    }

    public static void main(String[] args) {

        String srcFile = "src\\Ficheros\\Lectura\\" + Auxiliar.inputString("Introduce el nombre del fichero");
        srcFile += Auxiliar.inputString("Introduce la extension del archivo");
        System.out.println(FileC.readFile(new File(srcFile)));

    }

}
