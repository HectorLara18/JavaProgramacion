package test;

import domain.Empleado;
import domain.Gerente;

public class Test2 {
    public static void main(String[] args) {
        Empleado empleado = new Empleado("Hector", 100);
        empleado = new Gerente("Hector", 100, "TI");
        determinarTipo2(empleado);
    }
    public static void determinarTipo2(Empleado empleado){
        System.out.println(((Gerente)empleado).getDepartamento());
    }
}
