package test;

import domain.Gerente;

public class ClasePrueba {
    public static void main(String[] args) {
        Gerente gerenteTI = new Gerente("Hector Lara", 57000.00);
        gerenteTI.setDepartamento("TI Desarrollo");
        System.out.println(gerenteTI.obtenerDetalles());
    }
}
