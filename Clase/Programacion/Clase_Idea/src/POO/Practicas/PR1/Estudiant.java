package POO.Practicas.PR1;

import java.util.Calendar;

/**
 *
 * @author Laura
 */
public class Estudiant {

    private String dni;
    private String nom;
    private String cognoms;
    private String dataNaix;
    private String grup;
    private int curs;
    private int horesFCT;

    public Estudiant(String dni, String nom, String cognoms, String dataNaix, String grup, int curs, int horesFCT) {
        this.dni = dni;
        this.nom = nom;
        this.cognoms = cognoms;
        this.dataNaix = dataNaix;
        this.grup = grup;
        this.curs = curs;
        this.horesFCT = horesFCT;
    }

    public int horesRestantsFCT() {
        return 515 - this.horesFCT;
    }

    public boolean esMajordEdat() {
        Calendar cal = Calendar.getInstance();
        int edat = cal.get(Calendar.YEAR) - Integer.parseInt(this.dataNaix.substring(6));
        return edat > 18;
    }

    public String consultarGrup() {
        return this.curs + " de " + this.grup;
    }

    @Override
    public String toString() {
        return "Estudiant{" +
                "dni='" + dni + '\'' +
                ", nom='" + nom + '\'' +
                ", cognoms='" + cognoms + '\'' +
                ", dataNaix='" + dataNaix + '\'' +
                ", grup='" + grup + '\'' +
                ", curs=" + curs +
                ", horesFCT=" + horesFCT +
                '}';
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getCognoms() {
        return cognoms;
    }

    public void setCognoms(String cognoms) {
        this.cognoms = cognoms;
    }

    public String getDataNaix() {
        return dataNaix;
    }

    public void setDataNaix(String dataNaix) {
        this.dataNaix = dataNaix;
    }

    public String getGrup() {
        return grup;
    }

    public void setGrup(String grup) {
        this.grup = grup;
    }

    public int getCurs() {
        return curs;
    }

    public void setCurs(int curs) {
        this.curs = curs;
    }

    public int getHoresFCT() {
        return horesFCT;
    }

    public void setHoresFCT(int horesFCT) {
        this.horesFCT = horesFCT;
    }
}


