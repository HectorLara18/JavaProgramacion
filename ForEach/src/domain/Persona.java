package domain;

public class Persona {
    //Atributos
    private String nombre;

    //Constructor
    public Persona(String nombre){
        this.nombre = nombre;
    }

    //Metodos
    public String getNombre(){
        return this.nombre;
    }
}
