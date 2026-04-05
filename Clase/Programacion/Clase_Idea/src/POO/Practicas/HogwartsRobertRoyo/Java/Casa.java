package POO.Practicas.HogwartsRobertRoyo.Java;

import java.awt.*;
import java.util.ArrayList;
import java.util.List;

public class Casa {

    private final Casas casa;
    private final Color[] colorsCasa = new Color[2];
    private final String fundadorCasa;
    private final String animal;
    private final List<Alumno> alumnos = new ArrayList<>();

    public Casa(Casas casa, String color1, String color2, String fundadorCasa, String animal) {
        this.casa = casa;
        this.fundadorCasa = fundadorCasa;
        this.animal = animal;
        this.colorsCasa[0] = Color.decode(color1);
        this.colorsCasa[1] = Color.decode(color2);
    }

    public Casas getCasa() {
        return casa;
    }

    public Color[] getColorsCasa() {
        return colorsCasa;
    }

    public String getFundadorCasa() {
        return fundadorCasa;
    }

    public String getAnimal() {
        return animal;
    }

    public List<Alumno> getAlumnos() {
        return alumnos;
    }

    public Casa addAlumno(Alumno alumno){
        alumnos.add(alumno);
        return this;
    }

    public Casa addAlumnos(Alumno... alumnos){
        for (Alumno alumno : alumnos) {
            addAlumno(alumno);
        }
        return this;
    }

}
