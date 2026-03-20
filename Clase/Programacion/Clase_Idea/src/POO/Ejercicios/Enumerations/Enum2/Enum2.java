package POO.Ejercicios.Enumerations.Enum2;

public class Enum2 {

    public static void main(String[] args) {

        for (Meses m : Meses.values()) {
            System.out.println("Mes " + (m.ordinal()+1) + ": " + m );
        }

    }

}























