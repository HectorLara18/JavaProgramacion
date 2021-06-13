package domain;

import java.util.*;

public class FuncionesEstaticas {
    public static void imprimir(Collection myCollection){
        myCollection.forEach(element -> {
            System.out.println("element = " + element);
        });
    }
}
