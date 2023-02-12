package Refactoring;

public class CalculaPrecioIVA {

    public static void main(String[] args) {

        float total = 0;
        total = precioConIva(124.50f);
        System.out.println("El precio con IVA es: " + total + "€");
    }
    public static float precioConIva(float precio) {
        float total = precio + (precio * 21 / 100);
        return total;
    }

}
