import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // implement here your program that uses the TelevisionProgram class

        ArrayList<TelevisionProgram> programs = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            String showName = scanner.nextLine();

            if (showName.isEmpty()) {
                break;
            }
            int duration = Integer.valueOf(scanner.nextLine());
            programs.add(new TelevisionProgram(showName, duration));
        }

        int maxDuration = Integer.valueOf(scanner.nextLine());

        for (TelevisionProgram show : programs) {
            if (show.getDuration() <= maxDuration) {
                System.out.println(show);
            }
        }

    }
}
