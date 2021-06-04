package domain;

public class Gerente extends Empleado{
    //Atributos
    private String departamento;

    //Constructor
    public Gerente(String nombre, double salario, String departamento){
        super(nombre, salario);
        this.departamento = departamento;
    }

    @Override
    public String obtenerDetalles() {
        return super.obtenerDetalles() +  " Departamento: " + this.departamento;
    }
}
