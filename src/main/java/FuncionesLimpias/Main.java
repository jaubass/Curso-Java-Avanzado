package FuncionesLimpias;
import static FuncionesLimpias.CelsiusToFahrenheit.celsiusToFahrenheit;
import static FuncionesLimpias.NumberRange.getNumberRange;
import java.util.ArrayList;


public class Main {

    public static void main(String[] args) {

        double celsius = 50;
        double fahrenheit = celsiusToFahrenheit(celsius);

        System.out.println("50 grados Celsius son " + fahrenheit + " grados Fahrenheit");

        ArrayList<Integer> range = getNumberRange(1, 10);
        System.out.println("Los números enteros entre 1 y 10 son: " + range);
    }
}
