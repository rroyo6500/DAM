package POO.Ejercicios.Enumerations.Enum4;

public class Comanda {

    private final int ID;
    private String articulo;
    private EstatComanda estat = EstatComanda.PENDIENTE;

    public Comanda(int ID, String articulo) {
        this.ID = ID;
        this.articulo = articulo;
    }

    public int getID() {
        return ID;
    }

    public String getArticulo() {
        return articulo;
    }

    public void setArticulo(String articulo) {
        this.articulo = articulo;
    }

    public EstatComanda getEstat() {
        return estat;
    }

    public void setEstat(EstatComanda estat) {
        this.estat = estat;
    }

    @Override
    public String toString() {
        return String.format("[%d] %s (%s)", ID, articulo, estat);
    }
}
