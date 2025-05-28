
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Grade points = new Grade();

        // Write your program here -- consider breaking the program into
        // multiple classes.
        System.out.println("Enter point totals, -1 stops:");
        while (true) {
            int value = Integer.valueOf(scanner.nextLine());
            if (value == -1) {
                break;
            }

            points.addPoints(value);
        }

        System.out.println("Point average (all): " + points.pointAverage());
        System.out.println("Point average (passing): " + points.passingAverage());
        System.out.println("Pass percentage: " + points.passingPercentage());
        points.distribution();
    }
}
