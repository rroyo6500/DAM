package Funciones.FuncionesConRetorno;

public class FReturn_2 {

    public static void main(String[] args) {
        System.out.println(valorAbsoluto(-5));
        System.out.println(valorAbsoluto(12));
    }

    public static int valorAbsoluto(int num) {
        return Math.abs(num);
    }

}
