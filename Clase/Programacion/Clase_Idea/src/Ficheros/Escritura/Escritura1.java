package Ficheros.Escritura;

import Utils.Auxiliar;
import Utils.FileC;

public class Escritura1 {

    public static void main(String[] args) {

        int n1 = Auxiliar.inputInt("Introduce el primer numero");
        int n2 = Auxiliar.inputInt("Introduce el segundo numero");

        FileC.log = false;
        for (int i = n1; i <= n2; i++) {
            if (i == n1) FileC.writeFile("src\\Ficheros\\Escritura\\Ex1.txt", i + " ");
            else FileC.writeFile("src\\Ficheros\\Escritura\\Ex1.txt", i + " ", true);
        }

    }

}
