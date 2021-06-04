package domain;

public class Rectangulo extends FiguraGeometrica{
    //Atributos

    //Constructur
    public Rectangulo(String tipofigura){
        super(tipofigura);
    }

    //Metodos


    @Override
    public void dibujar() {
        System.out.println("Se imprime un: " + this.getClass().getSimpleName());
    }
}
