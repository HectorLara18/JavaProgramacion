package accesodatos;

import com.sun.security.jgss.GSSUtil;

public class ImplementacionOracle implements IAccesoDatos{
    @Override
    public void insertar() {
        System.out.println("implementar desde Oracle");
    }

    @Override
    public void listar() {
        System.out.println("Implementar desde Oracle");
    }

    @Override
    public void actalizar() {
        System.out.println("Implementar desde oracle");
    }

    @Override
    public void eliminar() {
        System.out.println("Implementar desde oracle");
    }

    @Override
    public void imprimir(String nombre) {
        System.out.println("Hola " + nombre);
    }
}
