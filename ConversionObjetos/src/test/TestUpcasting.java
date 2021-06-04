package test;

import domain.Empleado;
import domain.*;

public class TestUpcasting {
    public static void main(String[] args) {
        Escritor escritor = new Escritor("Hector", 5000,TipoEscritura.CLASICO);
        System.out.println(escritor);
        Empleado empleado = (Empleado) escritor;
        System.out.println(empleado);
    }
}
