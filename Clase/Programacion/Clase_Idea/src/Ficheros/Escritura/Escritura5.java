package Ficheros.Escritura;

import Utils.FileC;

public class Escritura5 {

    public static void main(String[] args) {
        String src = "src\\Ficheros\\Escritura\\";

        String msg = FileC.readFile(src + "text.txt").replace(".", "").replace(",", "");
        String[] palabras = msg.split(" ");
        for (String palabra : palabras) {
            if (palabra.endsWith("ment"))
                FileC.writeFile(src + "resultado.txt", palabra + "\n", true);
        }

    }

}
