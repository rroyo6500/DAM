package Ficheros.Escritura;

import Utils.Auxiliar;
import Utils.FileC;

public class Escritura3 {

    public static void main(String[] args) {
        FileC.log = false;

        String msg;
        while (!(msg = Auxiliar.inputString("Introduce una Frase").replace("\n", ""))
                .equalsIgnoreCase("fi")) {
            FileC.writeFile("src\\Ficheros\\Escritura\\Ex3.txt", msg + "\n", true);
        }

    }

}
