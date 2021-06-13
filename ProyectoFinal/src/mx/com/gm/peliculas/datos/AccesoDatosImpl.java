package mx.com.gm.peliculas.datos;

import mx.com.gm.peliculas.domain.Peliculas;
import mx.com.gm.peliculas.excepciones.AccesoDatosEx;
import mx.com.gm.peliculas.excepciones.EscrituraDatosEx;
import mx.com.gm.peliculas.excepciones.LecturaDatosEx;

import java.io.File;
import java.util.*;
import java.io.*;

public class AccesoDatosImpl  implements AccesoDatos{
    @Override
    public boolean existe(String nombreRecurso) throws AccesoDatosEx {
        File archivo = new File(nombreRecurso);
        return archivo.exists();
    }

    @Override
    public List<Peliculas> listar(String nombreRecuso) throws LecturaDatosEx {
        var archivo = new File(nombreRecuso);
        List<Peliculas> peliculas = new ArrayList<>();
        try {
            var entrada = new BufferedReader(new FileReader(archivo));
            String linea = null;
            linea = entrada.readLine();
            while(linea != null){
                var pelicula = new Peliculas(linea);
                peliculas.add(pelicula);
                linea = entrada.readLine();
            }
            entrada.close();
        } catch (FileNotFoundException ex) {
            ex.printStackTrace(System.out);
            throw new LecturaDatosEx("Excepcion al listar peliculas");
        } catch (IOException ex){
            ex.printStackTrace(System.out);
            throw new LecturaDatosEx("Excepcion al listar pelicula");
        }
        return peliculas;
    }

    @Override
    public void escribrir(Peliculas pelicula, String nombreRecurso, boolean anexar) throws EscrituraDatosEx {

    }

    @Override
    public String buscar(String nombreRecurso, String buscar) throws LecturaDatosEx {
        return null;
    }

    @Override
    public void crear(String nombreRecurso) throws AccesoDatosEx {

    }

    @Override
    public void borrar(String nombreRecurso) throws AccesoDatosEx {

    }
}
