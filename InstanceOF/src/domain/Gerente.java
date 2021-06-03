package domain;

public class Gerente extends Empleado {
    //Atributos
    private String departamento;

    //Constructor
    public Gerente(String nombre, double sueldo){
        super(nombre, sueldo);

    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }
}
