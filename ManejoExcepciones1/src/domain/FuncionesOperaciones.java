package domain;

public class FuncionesOperaciones {

    public static int division(int a, int b){
        int resultado = 0;
        try {
            resultado = a/b;
        } catch (Exception e) {
            System.out.println("Ocurrio un error: ");
            e.printStackTrace(System.out);
        }
        return resultado;
    }
}
