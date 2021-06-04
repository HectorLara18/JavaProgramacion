package test;

import static aritmetica.Aritmetica.division;

public class TestAritmetica2 {
    public static void main(String[] args) {
        int resultado = 0;
        try{
            resultado = division(10,0);
        }catch (Exception e){
            e.printStackTrace(System.out);
        }
        System.out.println("Resultado = " + resultado);
    }
}
