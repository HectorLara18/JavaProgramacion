package test;

import domain.FiguraGeometrica;
import domain.Rectangulo;

public class TestDibujar {
    public static void main(String[] args) {
        FiguraGeometrica rectangulo = new Rectangulo("Rectangulo");
        rectangulo.dibujar();
        System.out.println(rectangulo);
    }
}
