import java.util.Scanner;

public class TextUI {
    private Scanner scanner;
    private SimpleDictionary dict;

    public TextUI(Scanner scanner, SimpleDictionary dict) {
        this.scanner = scanner;
        this.dict = dict;
    }

    public void start() {
        while (true) {
            String command = scanner.nextLine();
            if (command.equals("end")) {
                System.out.println("Bye bye!");
                break;

            } else if (command.equals("add")) {
                String word = scanner.nextLine();
                String translation = scanner.nextLine();
                this.dict.add(word, translation);

            } else if (command.equals("search")) {
                String toTrans = scanner.nextLine();
                String translation = this.dict.translate(toTrans);

                if (translation == null) {
                    System.out.println("Word " + toTrans + " was not found");

                } else {
                    System.out.println(translation);
                }

            } else {
                System.out.println("Unknown command");
            }
        }

    }
}
