/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package RA7_ExamenPOO_RobertRoyo;

import java.util.ArrayList;

/**
 *
 * @author r.royo
 */
public class Pelicula extends FilmoMetraje{
    
    private final ArrayList<String> actorPrincipal = new ArrayList<>();
    private final int duracion;
    
    public Pelicula(String titulo, String director, boolean isFromNetflix, int duracion, String actor) {
        super(titulo, director, isFromNetflix);
        this.duracion = duracion;
        actorPrincipal.add(actor);
    }
    
    public Pelicula(String titulo, String director, boolean isFromNetflix, int duracion, String actor1, String actor2) {
        super(titulo, director, isFromNetflix);
        this.duracion = duracion;
        actorPrincipal.add(actor1);
        actorPrincipal.add(actor2);
    }

    @Override
    public void reproducir() {
        System.out.println("Se esta reproduciendo la pelicula " + titulo);
    }

    public ArrayList<String> getActorPrincipal() {
        return actorPrincipal;
    }

    public int getDuracion() {
        return duracion;
    }

    @Override
    public String toString() {
        return super.toString() + String.format(" %d minutos %s", duracion, actorPrincipal);
    }
    
}
