package test;

import java.util.*;
import static domain.FuncionesEstaticas.imprimir;

public class TestMaps {
    public static void main(String[] args) {
        Map <String, String> myMap = new HashMap<>();
        myMap.put("valor1", "Juan");
        myMap.put("valor2", "Karla");
        myMap.put("valor3", "Rosario");
        
        String elementpMápa = myMap.get("valor1");
        System.out.println("elementpMápa = " + elementpMápa);
        imprimir(myMap.keySet());
        imprimir(myMap.values());
        
    }
}
