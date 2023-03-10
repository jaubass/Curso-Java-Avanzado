package Refactoring;

import java.util.Arrays;

public class ImprimeMayorYMenor {

    public static void main(String[] args) {
        int []numeros = {34, -4, 98, -2, 76};
        imprimeMayorYMenor(numeros);

        int []numbers = {34, -4, 98, -2, 76};
        RefactorImpMayMen(numbers);
        Refactor2ImpMayMen(numbers);
        ProgFuncionalImpMayMen(numbers);
    }

    /** Buscar el número mayor y menor dentro de un Array de enteros
     *
     * @param numeros Array de números enteros
     * @since 12/02/2023
     */
    public static void imprimeMayorYMenor(int []numeros) {
        int mayor = 0;
        int menor = numeros[0];


        for (int i = 0; i < numeros.length; i++ ) {
            if (mayor < numeros[i]) {
                mayor = numeros[i];
            }
            if (menor > numeros[i]) {
                menor = numeros[i];
            }

        }
        System.out.println("Función imprimeMayorYMenor");
        System.out.println("El número mayor es " + mayor + " y el número menor es " + menor + ".");
        System.out.println();
    }

    /**
     * Refactorización del código anterior utilizando el Operador Ternario
     * @param numbers es un Array de números enteros
     * @since 12/02/2022
     */
    public static void RefactorImpMayMen (int []numbers) {
        int max = 0;
        int min = numbers[0];

        for (int i = 0; i < numbers.length; i++ ) {
            max = max < numbers[i] ? numbers[i] : max;
            min = min > numbers[i] ? numbers[i] : min;
        }
        System.out.println("Function RefactorImpMayMen");
        System.out.println("The max number is " + max + " and the minimum number is " + min + ".");
        System.out.println();

        /**
         * Operador ternario:
         * Explicando la linea 51: max es igual a ¿max es mayor a numeros [i]? si se cumple esta condición
         * max sera igual a la primera parte después del "?" (numbers[i]) si no se cumple será igual a la segunda (max)
         */

    }

    /**
     * Simplificando el bucle for con los dos puntos ":" y modificando el cuerpo de la función.
     * @param numbers
     */
    public static void Refactor2ImpMayMen (int []numbers) {
        int max = 0;
        int min = numbers[0];

        for (int i : numbers) {
            max = max < i ? i : max;
            min = min > i ? i : min;
        }

        System.out.println("Function Refactor2ImpMayMen");
        System.out.println("The max number is " + max + " and the minimum number is " + min + ".");
        System.out.println();
    }

    /**
     * Utilizando programación funcional para simplificar aún más la función
     * @param numbers es un Array de enteros
     */
    public static void ProgFuncionalImpMayMen (int []numbers) {
        int max = Arrays.stream(numbers).reduce(0, (a, b) -> a > b ? a : b);
        int min = Arrays.stream(numbers).reduce(numbers[0], (a, b) -> a < b ? a : b);

        System.out.println("Function ProgFuncionalImpMayMen");
        System.out.println("The max number is " + max + " and the minimum number is " + min + ".");
        }
}


