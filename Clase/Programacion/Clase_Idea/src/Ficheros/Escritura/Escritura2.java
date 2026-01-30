package Ficheros.Escritura;

import Utils.FileC;

public class Escritura2 {

    public static void main(String[] args) {

        for (int i = 0; i <= 100; i++) {
            FileC.writeFile("src\\Ficheros\\Escritura\\Ex2.txt", "8 * " + i + " = " + (8*i) + "\n", true);
        }
        
    }

}
