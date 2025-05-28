
import java.util.ArrayList;
import java.util.Scanner;

public class AverageOfAList {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // implement here a program, that first reads user input
        // adding them on a list until user gives -1.
        ArrayList<Integer> list = new ArrayList<>();
        int count = 0;
        int sum = 0;

        while (true) {
            int input = Integer.valueOf(scanner.nextLine());
            if (input == -1) {
                break;
            }

            list.add(input);
            count++;

        }

        // Then it computes the average of the numbers on the list
        // and prints it.

        for (int number: list) {
            sum += number;
        }

        double avg = (double) sum / count;

        System.out.println("Average: " + avg);

    }
}
