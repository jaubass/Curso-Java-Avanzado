package Exceptions;

public class Arithmetic {

    public static void main(String[] args) {

        int a = 10;
        int b = 0;
        int c = 5;

        try {
            int resultado = dividir(a, b);
            System.out.println("Resultado: " + resultado);
        } catch(ArithmeticException e) {
            System.out.println("No se puede dividir por cero");
        }
    }

    public static int dividir(int a, int b) {
        return a/b;
    }
}
