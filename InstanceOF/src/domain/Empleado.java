package domain;

public class Empleado {
    //Atributos
    protected String nombre;
    protected double sueldo;

    //Constructor
    public Empleado(String nombre, double sueldo){
        this.sueldo = sueldo;
        this.nombre = nombre;

    }

    //Metodos


    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getSueldo() {
        return sueldo;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }
}
