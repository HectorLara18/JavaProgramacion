package domain;

public class Empleado {
    //Atributos
    protected String nombre;
    protected double salario;

    //Constructor
    public Empleado(String nombre, double salario){
        this.nombre = nombre;
        this.salario = salario;
    }

    //Metodos


    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public String obtenerDetalles(){
        return "Nombre: " + this.nombre + " Sueldo: " + this.salario;

    }

    @Override
    public String toString() {
        return "Empleado{" +
                "nombre='" + nombre + '\'' +
                ", salario=" + salario +
                '}';
    }
}
