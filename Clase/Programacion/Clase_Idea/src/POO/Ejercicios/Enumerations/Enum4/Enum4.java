package POO.Ejercicios.Enumerations.Enum4;

public class Enum4 {

    public static void main(String[] args) {

        Comanda comanda = new Comanda(514, "Teclado Mecanico");

        System.out.println(comanda);

        comanda.setEstat(EstatComanda.ENVIADO);

        System.out.println(comanda);

    }

}
