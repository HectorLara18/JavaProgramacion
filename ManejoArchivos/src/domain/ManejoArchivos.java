package domain;

import java.io.*;
import java.io.PrintWriter;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ManejoArchivos {
    public static void crearArchivo(String nombreArchivo){
        File archivo = new File(nombreArchivo);
        try {
            PrintWriter salida = new PrintWriter(archivo);
            salida.close();
            System.out.println("Se a creado el archivo");
        } catch (FileNotFoundException ex) {
            ex.printStackTrace();
        }
    }


    public static void escribirArchivo(String nombreArchivo, String contenido){
        File archivo = new File(nombreArchivo);
        try {
            PrintWriter salida = new PrintWriter(archivo);
            salida.println(contenido);
            salida.close();
        } catch (FileNotFoundException ex) {
            ex.printStackTrace();
        }
    }

    public static void imprimeRuta(String nombreArchivo){
        File archivo = new File(nombreArchivo);
        System.out.println(archivo.getAbsolutePath());
    }

    public static void anexarArchivos(String nombreArchivo, String contenido){
        File archivo = new File(nombreArchivo);
        try {
            PrintWriter salida = new PrintWriter(new FileWriter(archivo,true));
            salida.println(contenido);
            salida.close();
            System.out.println("Se ha escrito al archivo");
        } catch (FileNotFoundException ex) {
            ex.printStackTrace(System.out);
        } catch (IOException ex){
            ex.printStackTrace(System.out);
        }
    }

    public static void leerArchivos(String nombreArchivo){
        File archivo = new File(nombreArchivo);
        try {
            BufferedReader entrada = new BufferedReader(new FileReader(nombreArchivo));
            var lectura = entrada.readLine();
            while(lectura != null){
                System.out.println(lectura);
                lectura = entrada.readLine();
            }
            entrada.close();
        } catch(FileNotFoundException ex) {
            ex.printStackTrace(System.out);
        } catch (IOException ex) {
            ex.printStackTrace(System.out);
        }
    }
}
