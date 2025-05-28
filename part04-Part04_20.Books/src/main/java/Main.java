import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        // implement here the program that allows the user to enter
        // book information and to examine them

        Scanner scanner = new Scanner(System.in);
        ArrayList<Books> books = new ArrayList<>();

        while (true) {
            String title = scanner.nextLine();

            if (title.isEmpty()) {
                break;
            }

            int pages = Integer.valueOf(scanner.nextLine());
            int years = Integer.valueOf(scanner.nextLine());

            books.add(new Books(title, pages, years));
        }
        System.out.println("What information will be printed?");
        String option = scanner.nextLine();

        for (Books book : books) {
            if (option.equals("name")) {
                System.out.println(book.getName());
            } else if (option.equals("everything")) {
                System.out.println(book);
            }
        }

    }
}
