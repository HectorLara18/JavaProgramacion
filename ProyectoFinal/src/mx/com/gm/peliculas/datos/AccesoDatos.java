package mx.com.gm.peliculas.datos;

import mx.com.gm.peliculas.domain.Peliculas;
import mx.com.gm.peliculas.excepciones.*;

import java.util.List;
import java.util.SplittableRandom;

public interface AccesoDatos {

    boolean existe(String nombreRecurso) throws AccesoDatosEx;

    List<Peliculas>listar(String nombreRecuso) throws LecturaDatosEx;

    void escribrir(Peliculas pelicula, String nombreRecurso, boolean anexar) throws EscrituraDatosEx;

    String buscar(String nombreRecurso, String buscar) throws LecturaDatosEx;

    void crear(String nombreRecurso) throws AccesoDatosEx;

    void borrar(String nombreRecurso) throws AccesoDatosEx;
}
