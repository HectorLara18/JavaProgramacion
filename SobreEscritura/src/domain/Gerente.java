package domain;

public class Gerente extends Empleado {
    //Atributos
    private String departamento;

    //Constructor
    public Gerente(String nombre, double sueldo){
        super(nombre, sueldo);
    }

    //Metodos

    @Override
    public String obtenerDetalles() {
        return super.obtenerDetalles() + " Departamento: " + this.departamento;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }
}
