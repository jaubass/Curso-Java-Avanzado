package Exceptions;

public class OutOfBounds {

    public static void main(String[] args) {
        int[] array = new int[6]; // Creamos un array de 6 elementos

        try{
            array[8] = 10; // Intentamos acceder al noveno elemento
        }catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Error: el array solo contiene 6 elementos.");
        }
    }
}
