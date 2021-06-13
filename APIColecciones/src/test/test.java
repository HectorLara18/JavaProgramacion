package test;

import java.util.*;

public class test {
    public static void main(String[] args) {
        List mylista = new ArrayList();
        mylista.add("lunes");
        mylista.add("Martes");
        mylista.add("Miercoles");
	mylista.add("Jueves");

        for (Object elemento: mylista
             ) {
            System.out.println("elemento = " + elemento);
            
        }

    }
}
