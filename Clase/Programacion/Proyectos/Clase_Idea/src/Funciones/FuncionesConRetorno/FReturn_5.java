package Funciones.FuncionesConRetorno;

public class FReturn_5 {

    public static void main(String[] args) {
        System.out.println(formatejarNom("Robert", "Royo Martinez"));
    }

    public static String formatejarNom(String nom, String cognom) {
        return cognom + ", " + nom;
    }

}
