package FuncionesYClases.Funciones.FuncionesConRetorno;

import java.io.PrintStream;
import java.nio.charset.StandardCharsets;
import java.util.Scanner;

public class FReturn_1 {

    static {
        System.setOut(new PrintStream(System.out, true, StandardCharsets.UTF_8));
        System.setErr(new PrintStream(System.err, true, StandardCharsets.UTF_8));
    }

    public static void main(String[] args) {
        int edatUsuari = demanarEdat();
        mostrarMajoriaEdat(edatUsuari);
    }

    public static int demanarEdat() {
        Scanner s= new Scanner(System.in);
        System.out.print("Introdueix la teva edat: ");
        int edat = s.nextInt();
        s.nextLine();
        return edat;
    }

    public static void mostrarMajoriaEdat(int edat) {
        System.out.println(edat >= 18 ? "Ets major d'edat" : "Ets menor d'edat");
    }

}
