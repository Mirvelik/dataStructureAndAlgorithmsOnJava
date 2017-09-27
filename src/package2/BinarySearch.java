package package2;

import java.util.Arrays;

public class BinarySearch {

    public static void main(String[] args) {
        int[] ints = {5,6,7,8,9,10,1,2,3,4};

        System.out.println(isValuePresent(ints, 2));
    }


    private static boolean isValuePresent(int[] source, int value) {

        Arrays.sort(source); //must be sorted

        for (int i = 0; i <= source.length - 1; i++) {

            System.out.println("check "+source[i]);

            if(source[i] == value)
                return true;
        }

        return false;
    }
}
