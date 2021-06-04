package test;

import domain.Persona;

public class TestJavaBean {
    public static void main(String[] args) {
        Persona persona = new Persona();
        persona.setNombre("Hector");
        persona.setApellido("lara");
        System.out.println(persona);
    }
}
