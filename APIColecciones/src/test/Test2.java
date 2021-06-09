package test;

import java.util.*;

public class Test2 {
    public static void main(String[] args) {
        Set mySet = new HashSet();
        mySet.add("Hector");
        mySet.add("Humberto");
        mySet.add("Raul");
        mySet.add("Eduardo");
        System.out.println("HolaMundox2");
        mySet.forEach(elemento -> {
            System.out.println("elemento = " + elemento);
        });
    }
}