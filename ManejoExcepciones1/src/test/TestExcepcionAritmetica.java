package test;

import domain.FuncionesOperaciones;
import static aritmetica.Aritmetica.division;

public class TestExcepcionAritmetica {
    public static void main(String[] args) {
        System.out.println(FuncionesOperaciones.division(12,0));
    }
}
