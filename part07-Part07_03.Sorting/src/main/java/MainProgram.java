import java.util.Arrays;

public class MainProgram {

    public static void main(String[] args) {
        // write your test code here
        int[] numbers = { 8, 3, 7, 9, 1, 2, 4 };
        System.out.println(Arrays.toString(numbers));
        MainProgram.sort(numbers);
        System.out.println(Arrays.toString(numbers));

    }

    public static int smallest(int[] array) {
        if (array.length == 0) {
            return -1;
        }

        int smallest = array[0];

        for (int number : array) {
            if (number < smallest) {
                smallest = number;
            }
        }

        return smallest;
    }

    public static int indexOfSmallest(int[] array) {
        if (array.length == 0) {
            return -1;
        }

        int smallest = array[0];
        int smallIndex = 0;

        for (int i = 0; i < array.length; i++) {
            if (array[i] < smallest) {
                smallest = array[i];
                smallIndex = i;
            }
        }

        return smallIndex;
    }

    public static int indexOfSmallestFrom(int[] array, int startIndex) {
        if (array.length == 0) {
            return -1;
        }

        int smallest = array[startIndex];
        int smallIndex = startIndex;

        for (int i = startIndex; i < array.length; i++) {
            if (array[i] < smallest) {
                smallest = array[i];
                smallIndex = i;
            }
        }

        return smallIndex;
    }

    public static void swap(int[] array, int index1, int index2) {
        int helper = array[index1];
        array[index1] = array[index2];
        array[index2] = helper;
    }

    public static void sort(int[] array) {
        for (int i = 0; i < array.length; i++) {
            MainProgram.swap(array, MainProgram.indexOfSmallestFrom(array, i),
                    i);
        }
    }

}
