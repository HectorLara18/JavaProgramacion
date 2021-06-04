package test;
import accesodatos.*;

public class TestImplementacionMetodosEstaticos {
    public static void main(String[] args) {
        IAccesoDatos datosMySQL = new ImplementacionMySQL();
        IAccesoDatos datosOracle = new ImplementacionOracle();
        imprimir(datosMySQL);
        imprimir(datosOracle);
    }

    public static void imprimir(IAccesoDatos datos){
        datos.actalizar();
    }
}
