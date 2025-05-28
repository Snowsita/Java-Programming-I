
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Items> figures = new ArrayList<>();

        while (true) {
            System.out.println("Identifier? (empty will stop)");
            String id = scanner.nextLine();

            if (id.isEmpty()) {
                break;
            }

            boolean exists = false;
            for (Items figure : figures) {
                if (figure.getId().equals(id)) {
                    exists = true;
                    break;
                }
            }

            if (exists) {
                System.out.println("This item is already in the list");
                continue;
            }

            System.out.println("Name? (empty will stop)");
            String name = scanner.nextLine();

            if (name.isEmpty()) {
                break;
            }

            Items figure = new Items(id, name);

            figures.add(figure);


        }
        for (Items figure : figures) {
            System.out.println(figure);
        }
    }
}
