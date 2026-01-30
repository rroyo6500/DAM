package Ficheros.Lectura;

import Utils.FileC;

import java.io.PrintStream;
import java.nio.charset.StandardCharsets;

public class Lectura3 {

    static {
        System.setOut(new PrintStream(System.out, true, StandardCharsets.UTF_8));
        System.setErr(new PrintStream(System.err, true, StandardCharsets.UTF_8));
    }

    public static void main(String[] args) {

        System.out.println(contarParaules(FileC.readFile("src\\Ficheros\\Lectura\\Archivo.txt")));

    }

    public static int contarParaules(String msg) {
        return msg.replace("\n", " ").split(" +").length;
    }

}
