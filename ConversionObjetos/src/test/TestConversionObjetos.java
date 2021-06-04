package test;

import domain.*;

public class TestConversionObjetos {
    public static void main(String[] args) {
        //Esto significa crear una variable de tipo Empleado
        Empleado empleado ;

        //Esto significa asignar a la variable de tipo Empleado un objeto de tipo Empleado
        //empleado = new Empleado("Hector", 35000);
        empleado = new Escritor("Hector", 35000, TipoEscritura.CLASICO);
        System.out.println("empleado = " + empleado);

        //DownCasting
        System.out.println(((Escritor)empleado).getTipoEscritura());
        Escritor escritor = (Escritor) empleado;
        System.out.println(escritor.getTipoEscritura());

    }
}
