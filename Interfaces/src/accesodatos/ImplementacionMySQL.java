package accesodatos;

import accesodatos.IAccesoDatos;

public class ImplementacionMySQL implements IAccesoDatos {

    @Override
    public void insertar() {
        System.out.println("Insertar desde MySQL");
    }

    @Override
    public void listar() {
        System.out.println("Insertar desde MySQL");
    }

    @Override
    public void actalizar() {
        System.out.println("Actualizar desde MySQL");
    }

    @Override
    public void eliminar() {
        System.out.println("Eliminar desde MySQL");
    }

    @Override
    public void imprimir(String nombre) {
        System.out.println("hola " + nombre);
    }
}
