package test;

import generic.*;

public class GenericClass {
    public static void main(String[] args) {
        ClaseGenerica<Integer> numero = new ClaseGenerica(15);
        numero.obtenerTipo();
        System.out.println(numero.getObjeto().getClass().getSimpleName());
        String nuevoString = numero.getObjeto().getClass().getSimpleName();
        System.out.println(nuevoString);

        if(numero.getObjeto().getClass().getSimpleName() == nuevoString){
            System.out.println("Verdadero");
        } else {
            System.out.println("falso");
        }

        }

    }
