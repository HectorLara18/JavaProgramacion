package test;

import static domain.ManejoArchivos.*;

public class TestCrearArchivos {
    public static void main(String[] args) {
        var nombreArchivo = "/home/hector/Documentos/Archivos/prueba.txt";
        crearArchivo(nombreArchivo);
        escribirArchivo(nombreArchivo, "Hola Mundo desde Java");
        anexarArchivos(nombreArchivo, "Adios");
        System.out.println(nombreArchivo);
        imprimeRuta(nombreArchivo);
        leerArchivos(nombreArchivo);
    }
}
