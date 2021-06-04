package domain;

public class Escritor extends Empleado{
    //Atributos
    final TipoEscritura tipoEscritura;

    //Constructor

    public Escritor(String nombre, double salario, TipoEscritura tipoEscritura){
        super(nombre, salario);
        this.tipoEscritura = tipoEscritura;
    }

    @Override
    public String obtenerDetalles() {
        return super.obtenerDetalles() + this.tipoEscritura;
    }

    @Override
    public String toString() {
        return "Escritor{" +
                "nombre='" + nombre + '\'' +
                ", salario=" + salario +
                ", tipoEscritura=" + tipoEscritura +
                '}';
    }

    public TipoEscritura getTipoEscritura(){
        return this.tipoEscritura;
    }
}
