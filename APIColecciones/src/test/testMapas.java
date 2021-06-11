package test;

import java.util.*;

public class testMapas {
    public static void main(String[] args) {
        Map myMap = new HashMap();
        myMap.put("valor1","Hector");
        myMap.put("valor2", "Jazmin");
        myMap.put("valor3", "raul");

        String elemento = (String) myMap.get("valor1");
        System.out.println("elemento = " + elemento);
        System.out.println(myMap);
        System.out.println(myMap.keySet());
    }
}
