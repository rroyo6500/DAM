package Ficheros.Escritura;

import Utils.FileC;

public class Escritura4 {

    public static void main(String[] args) {
        String src = "src\\Ficheros\\Escritura\\";

        FileC.writeFile(src + "Ex4.txt", FileC.readFile(src + "Ex3.txt").toUpperCase());

    }

}
