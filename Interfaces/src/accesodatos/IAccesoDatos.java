package accesodatos;

public interface IAccesoDatos {
    //Atributos
    int MAX_REGISTROS = 10;

    //Metodo

    void insertar();

    void listar();

    void actalizar();

    void eliminar();

    void imprimir(String nombre);
}
