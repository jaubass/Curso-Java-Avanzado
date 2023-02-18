package Exceptions;

public class Arithmetic {

    public static void main(String[] args) {
        int a = 5;
        int b = 0;

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
