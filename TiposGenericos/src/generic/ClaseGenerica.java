package generic;

public class ClaseGenerica<T> {

    private T objeto;

    public ClaseGenerica(T objeto){
        this.objeto = objeto;
    }

    public T getObjeto() {
        return objeto;
    }

    public void setObjeto(T objeto) {
        this.objeto = objeto;
    }

    public void obtenerTipo(){
        System.out.println("El tipo T es: " + objeto.getClass().getSimpleName());
    }

    public static boolean verificaTipoString(Object objeto){
        boolean salida = false;
        if(objeto.getClass().getSimpleName() == "String"){
            salida = true;
        } else {
            salida = false;
        } return salida;
    }

    public void imprimeClase(){
        System.out.println(this.getObjeto().getClass().getSimpleName());
    }
}
