package domain;

public class Desarrollado extends Empleado{
    //Atributos
    private String role;

    //Constructor
    public Desarrollado(String name, double sueldo, String role){
        super(name,sueldo);
        this.role = role;
    }

    //Metodos

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    @Override
    public String toString() {
        return super.toString() + " Role: " + this.role;
    }
}
