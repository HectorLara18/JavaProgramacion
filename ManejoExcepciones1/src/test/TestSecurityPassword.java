package test;

import excepciones.*;
import static security.Password.*;

public class TestSecurityPassword {
    public static void main(String[] args) throws OperacionExcepcion {
        //String password = "asdfvghjhvkgcfjfcklhf";
        //System.out.println(passwordLeng(password));
        System.out.println(imprimeSugerencia("fdg"));
    }

    public static boolean imprimeSugerencia(String password){
        boolean resultado = false;
        try {
            resultado =  passwordLeng(password);
        } catch (OperacionExcepcion operacionExcepcion) {
            operacionExcepcion.printStackTrace(System.out);
            System.out.println("Ingresa un password mayor a 10 digitos");
        }
        return resultado;
    }
}
