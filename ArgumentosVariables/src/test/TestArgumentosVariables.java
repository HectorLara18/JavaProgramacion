package test;

/**
 * esto se utiliza trabajando directamente con metodos
 *
 * es cuando vamos a pasar un argumento hacia un metodo para ellos vamos a deifinir un vmetodo que va a
 * recibir cierta cantidad de numeros pero no es necesario especificar al inicio del programa
 */

public class TestArgumentosVariables {
    public static void main(String[] args) {
        imprimirNumeros(1,2,3,4,5);
        variosParametros("calificaciones", 100, 95, 88, 64);
    }

    private static void variosParametros(String nombre, int ... numeros){
        System.out.println("Nombre de la lista: " + nombre);
        for (int i = 0; i < numeros.length; i++){
            System.out.println("elementos: " + numeros[i]);
        }
    }

    private static void variosParametros2(String nombre, int ... numeros){
        System.out.println("Nombre de la lista: " + nombre);
        imprimirNumeros(numeros);
    }

    private static void imprimirNumeros(int... numeros){
        for (int i = 0; i < numeros.length; i++){
            System.out.println("elementos = " + numeros[i]);
        }
    }
}
