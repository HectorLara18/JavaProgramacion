package test;

import domain.Empleado;

public class TestClaseObj {
    public static void main(String[] args) {
        Empleado empleado1 = new Empleado("Hector", 500);
        Empleado empleado2 = new Empleado("Hector", 500);
        compararEmpleados(empleado1, empleado2);

    }

    public static void compararEmpleados(Empleado empleado1, Empleado empleadp2){
        if(empleado1 == empleadp2) {
            System.out.println("Tienen la misma referencia en mewmoria");
        } else {
            System.out.println("no tienen la misma referencia en memoria");
        }
    }
}
