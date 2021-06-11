package test;

import generic.ClaseGenerica;

public class GenericClass {
    public static void main(String[] args) {
        ClaseGenerica<Integer> numero = new ClaseGenerica(15);
        numero.obtenerTipo();

    }
}
