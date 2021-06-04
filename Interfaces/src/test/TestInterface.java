package test;

import accesodatos.IAccesoDatos;
import accesodatos.ImplementacionMySQL;

public class TestInterface {
    public static void main(String[] args) {
        IAccesoDatos datos = new ImplementacionMySQL();
        datos.listar();
        datos.imprimir("Hector");
    }
}
