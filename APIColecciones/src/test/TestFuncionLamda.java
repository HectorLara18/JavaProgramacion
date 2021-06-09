package test;

import java.util.*;

public class TestFuncionLamda {
    public static void main(String[] args) {
        List mylista = new ArrayList<>();
        Set mySet = new HashSet();
        mylista.add("Hector");
        mylista.add("Humberto");
        mylista.add("Raul");
        mySet.add("Rojo");
        mySet.add("Azul");

        //Esto es una funcion lamda o direccional

        mylista.forEach(elemento -> {
            System.out.println("elemento = " + elemento);
        });
        imprimir(mylista);
        imprimir(mySet);
    }

    public static void imprimir(Collection  coleccion){
        coleccion.forEach(elemento -> {
            System.out.println("elemento = " + elemento);
        });
    }
}
