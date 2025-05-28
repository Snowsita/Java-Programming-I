
import java.util.Scanner;

public class AVClub {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            String phrase = scanner.nextLine();

            if (phrase.equals("")) {
                break;
            }

            String[] words = phrase.split(" ");

            for (String word : words) {
                if (word.contains("av")) {
                    System.out.println(word);
                }
            }

        }

    }
}
