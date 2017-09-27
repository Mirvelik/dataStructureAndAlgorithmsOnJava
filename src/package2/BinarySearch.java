package package2;

import java.util.Arrays;

public class BinarySearch {

    public static void main(String[] args) {
        int[] ints = {5, 6, 7, 8, 9, 10, 1, 2, 3, 4};

        System.out.println(isValuePresent(ints, 2)); //true
        System.out.println(isValuePresent(ints, 11)); //false
    }


    private static boolean isValuePresent(int[] source, int value) {

        Arrays.sort(source); //must be sorted

        int low = 0;
        int high = source.length - 1;


        while (low <= high) {
            int median = (low + high) / 2;

            if (source[median] < value) {
                low = median + 1;
            } else {
                high = median - 1;
            }
        }


        if (low == source.length || source[low] != value) {
            return false;
        }

        return true;
    }
}
