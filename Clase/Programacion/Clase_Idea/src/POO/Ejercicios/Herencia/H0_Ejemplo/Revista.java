package POO.Ejercicios.Herencia.H0_Ejemplo;

public class Revista extends Llibre{

    private int numeroEdificio;

    public Revista(String titulo, String autor, String isbn, int numeroEdificio) {
        super(titulo, autor, isbn);
        this.numeroEdificio = numeroEdificio;
    }

    public int getNumeroEdificio() {
        return numeroEdificio;
    }

    public void setNumeroEdificio(int numeroEdificio) {
        this.numeroEdificio = numeroEdificio;
    }

}
