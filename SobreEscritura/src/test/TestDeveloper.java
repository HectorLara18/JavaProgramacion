package test;

import domain.Desarrollo;

public class TestDeveloper {
    public static void main(String[] args) {
        Desarrollo desarrollador1 = new Desarrollo("Hector Lara", 65000.0,"Sr");
        System.out.println(desarrollador1.getCategoria());
    }
}
