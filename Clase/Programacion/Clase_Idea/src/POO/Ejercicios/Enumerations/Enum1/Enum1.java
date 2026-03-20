package POO.Ejercicios.Enumerations.Enum1;

public class Enum1 {

    public static Semaforo colorSemaforo = Semaforo.VERDE;

    public static void main(String[] args) {

        System.out.println("Color: " + colorSemaforo);
        switch (colorSemaforo) {
            case VERDE -> System.out.println("Correr");
            case NARANJA -> System.out.println("Reducir velocidad");
            case ROJO -> System.out.println("Parar");
        }

    }

}
