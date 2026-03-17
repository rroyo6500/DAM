/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package POO.Practicas.PR1;

/**
 *
 * @author Laura
 */
public class Animal {

    private String especie;
    private String raza;
    private String nomCientific;
    private String habitat;
    private String alimentacio;
    private int numeroExemplars;

    public Animal(String especie, String raza, String nomCientific, String habitat, String alimentacio, int numeroExemplars) {
        this.especie = especie;
        this.raza = raza;
        this.nomCientific = nomCientific;
        this.habitat = habitat;
        this.alimentacio = alimentacio;
        this.numeroExemplars = numeroExemplars;
    }

    public void emigrar(String nouHabitat) {
        this.habitat = nouHabitat;
    }

    public boolean volar() {
        if (this.especie.equalsIgnoreCase("Ratpenat") || this.especie.equalsIgnoreCase("papallona")) {
            return true;
        } else {
            return false;
        }
    }
    
    public String EstaEnPerill() {
        if (this.numeroExemplars < 8000) {
            return "El " + this.nomCientific + " està en perill d’extinció.";
        } else {
            return "El " + this.nomCientific + " no està en perill d’extinció.";
        }
    }

    @Override
    public String toString() {
        return "Especie: " + especie + " [ NomCientific: " + nomCientific + " ]" +
                "\n\tRaza: " + raza + ", Habitat: " + habitat +
                "\n\tNumero exemplars: " + numeroExemplars +
                "\n\tAlimentacio: " + alimentacio;
    }

    public String getEspecie() {
        return especie;
    }

    public void setEspecie(String especie) {
        this.especie = especie;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public String getNomCientific() {
        return nomCientific;
    }

    public void setNomCientific(String nomCientific) {
        this.nomCientific = nomCientific;
    }

    public String getHabitat() {
        return habitat;
    }

    public void setHabitat(String habitat) {
        this.habitat = habitat;
    }

    public String getAlimentacio() {
        return alimentacio;
    }

    public void setAlimentacio(String alimentacio) {
        this.alimentacio = alimentacio;
    }

    public int getNumeroExemplars() {
        return numeroExemplars;
    }

    public void setNumeroExemplars(int numeroExemplars) {
        this.numeroExemplars = numeroExemplars;
    }
}
