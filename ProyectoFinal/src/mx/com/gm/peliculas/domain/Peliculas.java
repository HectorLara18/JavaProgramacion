package mx.com.gm.peliculas.domain;

import java.io.Serializable;

public class Peliculas implements Serializable {
    //Atributos
    private String nombre;

    //Constructor
    public Peliculas(){}

    public Peliculas(String nombre){
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return this.nombre;
    }
}
