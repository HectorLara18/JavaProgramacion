package test;

public class TestForEach {
    public static void main(String[] args) {
        int edades[] = {5,6,8,12,12,4,9};
        for(int edad: edades){
            System.out.println("edad = " + edad);
        }
    }
}
