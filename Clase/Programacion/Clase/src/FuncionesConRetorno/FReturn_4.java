package FuncionesConRetorno;

public class FReturn_4 {

    public static void main(String[] args) {
        System.out.println(duplicar(duplicar(5)));
    }

    public static int duplicar(int num) {
        return num * 2;
    }

}
