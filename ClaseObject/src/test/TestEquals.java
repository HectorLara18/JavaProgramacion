package test;

import domain.Empleado;

public class TestEquals {
    public static void main(String[] args) {
        Empleado empleado1 = new Empleado("Hector", 500);
        Empleado empleado2 = new Empleado("Hector", 500);
        Empleado empleado3 = new Empleado("hector", 500);

        System.out.println(empleado1.equals(empleado2));
        System.out.println(empleado1.hashCode() == empleado2.hashCode());
        System.out.println(empleado3.hashCode() == empleado1.hashCode());

    }
}
