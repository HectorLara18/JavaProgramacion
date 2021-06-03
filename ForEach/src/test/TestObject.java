package test;

import domain.Persona;

public class TestObject {
    public static void main(String[] args) {
        Persona personas[] = {new Persona("Hector"), new Persona("Jazmmin"), new Persona("Raul")};
        for(Persona persona:personas){
            System.out.println("persona = " + persona.getNombre());
        }
    
    }
}
