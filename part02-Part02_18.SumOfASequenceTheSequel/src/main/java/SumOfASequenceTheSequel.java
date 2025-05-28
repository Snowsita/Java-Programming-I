
import java.util.Scanner;

public class SumOfASequenceTheSequel {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sumFirst = 0;

        System.out.println("First number?");
        int first = Integer.valueOf(scanner.nextLine());

        System.out.println("Last number?");
        int second = Integer.valueOf(scanner.nextLine());
        for (int i = first; i <= second; i++) {
            sumFirst += i;
        }

        int sum = sumFirst;

        System.out.println("The sum is " + sum);



    }
}
