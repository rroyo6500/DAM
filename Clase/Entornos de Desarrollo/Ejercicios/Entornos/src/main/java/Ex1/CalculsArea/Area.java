package Ex1.CalculsArea;

public class Area {

    public static double areaTriangle(double base, double altura) {
        return (base * altura) / 2;
    }

    public static double areaQuadrat(double costat) {
        return costat * costat;
    }

    public static double areaCercle(double radi) {
        return Math.PI * radi * radi;
    }

    public static double areaRectangle(double base, double altura) {
        return base * altura;
    }

    public static double areaTrapezi(double costatPetit, double costatGran, double altura) {
        return ((costatPetit + costatGran) * altura) / 2;
    }

    public static double areaEllipse(double diametreGran, double diametrePetit) {
        return Math.PI * diametreGran * diametrePetit;
    }
}