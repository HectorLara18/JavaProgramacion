package test;
import java.util.*;

//las listas si se pueden duplicar valores pero en el set no

public class TestHashSet {
    public static void main(String[] args) {
        List lista1 = new ArrayList<>();
        Set set1 = new HashSet();

        lista1.add("Hdector");
        lista1.add("Humberto");

        set1.add("Manzana");
        set1.add("Pera");

        imprimie(lista1);
        imprimie(set1);
    }

    public static void imprimie(Collection mycollection){
        mycollection.forEach(element -> {
            System.out.println("element = " + element);
        });
    }
}
