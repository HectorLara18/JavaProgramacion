package security;

import  excepciones.OperacionExcepcion;

public class Password {
    public static boolean passwordLeng(String password) throws OperacionExcepcion{
        if(password.length() < 10) {
            throw new OperacionExcepcion("password is too short");
        }
        return  true;
    }
}
