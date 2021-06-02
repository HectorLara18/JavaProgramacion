package Test;

import Numeracion.Dias;

import java.util.concurrent.CopyOnWriteArraySet;

public class Test {
    public static void main(String[] args) {
        System.out.println("Dia 1 de la semana: " + Dias.LUNES);
        diaDelaSemana(Dias.DOMINGO);
    }

    private static void diaDelaSemana(Dias dia){
        switch (dia) {
            case LUNES:
                System.out.println("Primer dia de la semana");
                break;
            case MARTES:
                System.out.println("Segundo Dia de la semana");
                break;
            case MIERCOLES:
                System.out.println("Tercer dia de la semana");
                break;
            case JUEVES:
                System.out.println("Cuarto dia de la semana");
                break;
            case VIERNES:
                System.out.println("Quinto dia de la semana");
                break;
            case SABADO:
                System.out.println("Sexto dia de la semana");
                break;
            case DOMINGO:
                System.out.println("Septimo dia de la semana");
                break;
            default:
                System.out.println("dia no valido");
                break;

        }
    }
}
