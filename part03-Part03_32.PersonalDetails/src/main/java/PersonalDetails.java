
import java.util.ArrayList;
import java.util.Scanner;

public class PersonalDetails {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        int count = 0;
        String longest = "";
        int longer = 0;

        while (true) {
            String text = scanner.nextLine();

            if (text.equals("")) {
                break;
            }

            String[] words = text.split(",");
            int year = Integer.valueOf(words[1]);
            int longerName = words[0].length();

            if (longerName > longer) {
                longer = longerName;
                longest = words[0];
            }

            count++;
            sum += year;
        }
        double average = (double) sum / count; 
        System.out.println("Longest name: " + longest);
        System.out.println("Average of the birth years: " + average);

    }
}
