package POO.Ejercicios.Herencia.H0_Ejemplo;

public class LlibreElectronic extends Llibre {

    private String format;

    public LlibreElectronic(String titulo, String autor, String isbn, String format) {
        super(titulo, autor, isbn);
        this.format = format;
    }

    public String getFormat() {
        return format;
    }

    public void setFormat(String format) {
        this.format = format;
    }

}
