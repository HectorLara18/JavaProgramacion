package test;

import static  generic.ClaseGenerica.verificaTipoString;

import generic.ClaseGenerica;
import generic.ClaseGenerica.*;

public class TestVerificaTipo {
    public static void main(String[] args) {
        ClaseGenerica<Integer> numero = new ClaseGenerica<>(12);
        ClaseGenerica<String> myString = new ClaseGenerica<>("Hector");
        System.out.println(verificaTipoString(numero));;
        System.out.println(verificaTipoString(myString.getObjeto()));
        myString.imprimeClase();
    }
}
