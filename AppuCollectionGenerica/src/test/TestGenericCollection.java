package test;

import java.util.*;
import static domain.FuncionesEstaticas.imprimir;

public class TestGenericCollection {
    public static void main(String[] args) {

        List<String> myList = new ArrayList<>();
        myList.add("Lunes");
        myList.add("Mares");
        myList.add("Miercoles");
        myList.add("Jueves");
        myList.add("12");
        imprimir(myList);
        Integer numero = Integer.parseInt(myList.get(4));
        System.out.println(numero.getClass().getSimpleName());

    }

}
