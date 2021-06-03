package test;

public class TestAutoboxingUnboxing {
    public static void main(String[] args) {
        /**
         * Cada uno de los tipos primitivos tiene una clase wrapper o envolvente de tipo primitivo
         * int - Integer
         * long - Long
         * float - Float
         * double Double
         */

        //Autoboxing

        Integer numero1 = 20;
        System.out.println(numero1.toString());

        //Unboxing

        int numero2 = numero1;
        System.out.println(numero2);
    }
}
