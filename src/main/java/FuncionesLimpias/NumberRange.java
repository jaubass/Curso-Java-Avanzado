package FuncionesLimpias;

import java.util.ArrayList;

public class NumberRange {

    /**
     * Returns a list of all integers between two given integers.
     * @param lowerBound Lower bound of the range
     * @param upperBound Upper bound of the range
     * @return A list of all integers between lowerBound and upperBound
     */
    public static ArrayList<Integer> getNumberRange(int lowerBound, int upperBound) {
        ArrayList<Integer> range = new ArrayList<>();
        for (int i = lowerBound; i <= upperBound; i++) {
            range.add(i);
        }
        return range;
    }

}
