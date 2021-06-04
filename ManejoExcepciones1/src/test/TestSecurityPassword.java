package test;

import excepciones.*;
import static security.Password.*;

public class TestSecurityPassword {
    public static void main(String[] args) throws OperacionExcepcion {
        String password = "asdsdvffsdfvcsdadsvfcvffg";
        System.out.println(passwordLeng(password));
    }
}
