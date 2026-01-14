package Funciones.FuncionesConRetorno;

public class FReturn_6 {

    public static void main(String[] args) {
        System.out.println(calcularNota(5));
    }

    public static char calcularNota(double nota) {
        return switch((int) nota) {
            case 0,1,2,3,4 -> 'D';
            case 5,6 -> 'C';
            case 7,8 -> 'B';
            case 9,10 -> 'A';
            default -> throw new IllegalArgumentException("Nota no valida");
        };
    }

}
