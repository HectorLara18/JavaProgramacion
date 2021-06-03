package test;

import domain.Empleado;
import domain.Gerente;

public class TestInstanceOf {
    public static void main(String[] args) {
        Empleado empleado1 = new Empleado("Hector", 350000);
        determinarTipo(empleado1);
        empleado1 = new Gerente("Humberto", 65000);
        determinarTipo(empleado1);
    }

    public static void determinarTipo(Empleado empleado){
        if(empleado instanceof Gerente){
            System.out.println("es un gerente");
        } else {
            System.out.println("No es un gerente");
        }
    }
}
