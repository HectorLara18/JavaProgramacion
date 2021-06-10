package test;

import java.util.ArrayList;
import java.util.List;

public class JavaSetList2 {
    public static void main(String[] args) {
        List lista1 = new ArrayList<>();
        lista1.add("lunes");
        lista1.add("martes");
        lista1.add("miercoles");
        lista1.forEach(valor -> {
            System.out.println("valor = " + valor);
        });
    }
}
