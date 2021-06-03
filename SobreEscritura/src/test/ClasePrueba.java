package test;

import domain.*;

public class ClasePrueba {
    public static void main(String[] args) {
        Gerente gerenteTI = new Gerente("Hector Lara", 57000.00);
        Empleado ingeniero = new Empleado("Hector Lara", 35000.0);
        gerenteTI.setDepartamento("TI Desarrollo");
        System.out.println(ingeniero.obtenerDetalles());
        System.out.println(gerenteTI.obtenerDetalles());
    }
}
