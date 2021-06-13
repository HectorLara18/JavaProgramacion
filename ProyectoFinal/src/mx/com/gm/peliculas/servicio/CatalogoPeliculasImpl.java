package mx.com.gm.peliculas.servicio;

import mx.com.gm.peliculas.datos.AccesoDatos;
import mx.com.gm.peliculas.datos.AccesoDatosImpl;
import mx.com.gm.peliculas.domain.Peliculas;
import mx.com.gm.peliculas.excepciones.AccesoDatosEx;

public class CatalogoPeliculasImpl implements CatalogoPeliculas{
    //Atributos
    private final AccesoDatos datos;

    //Constructor
    public CatalogoPeliculasImpl(){
        this.datos = new AccesoDatosImpl();
    }

    @Override
    public void agregarPelicula(String nombrePelicula) {
        Peliculas pelicula = new Peliculas(nombrePelicula);
        boolean anexar = false;
        try{
            anexar = datos.existe(NOMBRE_RECURSO);
            datos.escribrir(pelicula,NOMBRE_RECURSO,anexar);
        }catch (AccesoDatosEx ex){
            System.out.println(ex.getMessage());
        }
    }

    @Override
    public void listarPeliculas() {
        try{
            var peliculas = this.datos.listar(NOMBRE_RECURSO);
            for (var pelicula: peliculas) {
                System.out.println("pelicula = " + pelicula);
            }
        }catch (AccesoDatosEx ex){
            System.out.println("Error Acceso a Datos");
            ex.printStackTrace(System.out);
        }
    }

    @Override
    public void buscarPeliculas(String buscar) {
        String resultado = null;
        try{
            resultado = this.datos.buscar(NOMBRE_RECURSO, buscar);
        }catch(AccesoDatosEx ex){
            System.out.println("Error al buscar pelicula");
            ex.printStackTrace(System.out);
        }
    }

    @Override
    public void iniciarCatalogoPeliculas() {
        try{
            if(this.datos.existe(NOMBRE_RECURSO)){
                datos.borrar(NOMBRE_RECURSO);
                datos.crear(NOMBRE_RECURSO);
            } else{
                datos.crear(NOMBRE_RECURSO);
            }
        }catch (AccesoDatosEx ex){
            System.out.println("Error al iniciar catalogo de peliculas");
            ex.printStackTrace(System.out);
        }
    }
}
