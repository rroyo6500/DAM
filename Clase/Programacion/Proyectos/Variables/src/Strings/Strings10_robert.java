package Strings;

/**
 *
 * @author r.royo
 */
public class Strings10_robert {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        String textoCifrado = "perixd qtñlk lxd nut+-*xd rw+-*nxd dtñlkrmen t21rwnd21se de lxd rwn21s?";

        String texto = textoCifrado.replace("xd", "as")
                .replace("+-*", "ri")
                .replace("rw", "ma")
                .replace("per", "¿sab")
                .replace("tñlk", "ue")
                .replace("21", "o");

        System.out.println(texto);
    }

}
