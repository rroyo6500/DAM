package FuncionesYClases.Funciones.FuncionesConRetorno;

import java.util.Scanner;

public class FReturn_3 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println(duplicar(3));

        System.out.print("Introduce un numero para duplicarlo: ");
        System.out.println(duplicar(in.nextInt()));
    }

    public static int duplicar(int num) {
        return num * 2;
    }

}
