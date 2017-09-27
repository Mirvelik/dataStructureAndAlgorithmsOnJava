package package1;

public class LinearSearch {


    public static void main(String[] args) {
        int[] ints = {4, 19, 111, 6, 219, 68, 2, 3};

        System.out.println(isValuePresent(ints, 2)); //true
        System.out.println(isValuePresent(ints, 0)); //false
    }


    private static boolean isValuePresent(int[] source, int value) {
        for (int i = 0; i <= source.length - 1; i++) {

            if (source[i] == value) {
                return true;
            }
        }

        return false;
    }
}
