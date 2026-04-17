package POO.Practicas.FlotaRobertIzan;

public class Funciones {

    public static boolean plusPorMision(Oficial o, double plusCreditos) {

        if (o.getCiclesOrbitals() >= 10) {

            if (o.getDivision() != null && o.getDivision().equalsIgnoreCase("Navegació"))
                plusCreditos *= 1.5;

            o.setCreditosGalacticos(o.getCreditosGalacticos() + plusCreditos);

            return true;
        }
        return false;
    }

}
