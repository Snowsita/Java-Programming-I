
import java.util.Scanner;

public class LiquidContainers {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int first = 0;
        int second = 0;

        while (true) {
            if (first > 100) {
                first = 100;
            } else if (first < 0) {
                first = 0;
            }

            if (second > 100) {
                second = 100;
            } else if (second < 0) {
                second = 0;
            }

            String output = "First: " + first + "/100\nSecond: " + second + "/100";
            System.out.println(output);

            String input = scan.nextLine();
            String[] parts = input.split(" ");

            if (input.equals("quit")) {
                break;
            }
            int amount = Integer.valueOf(parts[1]);

            if (amount < 0) {
                continue;
            }

            if (parts[0].equals("add")) {
                first += amount;

            } else if (parts[0].equals("move")) {
                if (first - amount < 0) {
                    second += first;
                    first -= amount;
                } else {
                    first -= amount;
                    second += amount;
                }
            } else if (parts[0].equals("remove")) {
                second -= amount;

            } else {
                continue;
            }

        }
    }

}
