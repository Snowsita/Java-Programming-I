
import java.util.Scanner;

public class SecondsInADay {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Write your program here
        System.out.println("How many days would you like to convert to seconds?");

        int date = Integer.valueOf(scanner.nextLine());
        int seconds = (date * 24) * 60 * 60;

        System.out.println(seconds);
    }
}
