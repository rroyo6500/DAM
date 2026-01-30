package FuncionesYClases.Clases.Ex1;

import Utils.Auxiliar;

public class Main {

    public static void main(String[] args) {

        String nombre = Auxiliar.inputString("Introduce tu nombre");
        String apellido = Auxiliar.inputString("Introduce tu apellido");
        double altura = Auxiliar.inputDouble("Introduce tu altura");
        double peso = Auxiliar.inputDouble("Introduce tu peso");
        int edad = Auxiliar.inputInt("Introduce tu edad");

        System.out.println();
        System.out.println(
                "Nombre: " + nombre + "\n"
                        + "Apellido: " + apellido + "\n"
                        + "Altura: " + altura + "\n"
                        + "Peso: " + peso + "\n"
                        + "Edad: " + edad
        );

    }

}
