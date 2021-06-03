package domain;

/**
 * los bloques de inicialización son de dos tipos estaticos y deinamicos ambos bloques se ejecutan antes
 * del constructor de la clase
 */

public class Persona {

    //Atributos
    private final int idPersona;
    private static int contadorPersonas;


    //Bloque de inicialización estatico
    static {
        System.out.println("Ejecución bloque estatico");
        ++Persona.contadorPersonas;
    }

    //Bloque de inicialización NO estatico o contexto dinamico
    {
        System.out.println("Ejecución bloque NO estatico");
        this.idPersona = contadorPersonas++;
    }

    //Constructor
    public Persona() {
        System.out.println("Ejecución del constructor");
    }

    //Metodos

    public int getIdPersona() {
        return this.idPersona;
    }

    @Override
    public String toString() {
        return "Persona{" +
                "idPersona=" + idPersona +
                '}';
    }
}
