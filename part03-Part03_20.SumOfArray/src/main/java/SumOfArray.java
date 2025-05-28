
public class SumOfArray {

    public static void main(String[] args) {
        // You can try the method here
        int[] numbers = { 5, 1, 3, 4, 2 };
        sumOfNumbersInArray(numbers);
    }

    public static int sumOfNumbersInArray(int[] array) {
        // Write some code here
        int sum = 0;
        for (int number: array) {
            sum += number;
        }
        return sum;
    }
}
