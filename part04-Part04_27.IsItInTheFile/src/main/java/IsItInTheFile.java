
import java.nio.file.Paths;
import java.util.Scanner;

public class IsItInTheFile {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Name of the file:");
        String file = scanner.nextLine();

        System.out.println("Search for:");
        String searchedFor = scanner.nextLine();

        boolean found = false;

        try (Scanner searcher = new Scanner(Paths.get(file))) {
            while (searcher.hasNextLine()) {
                String name = searcher.nextLine();
                if (name.equals(searchedFor)) {
                    System.out.println("Found!");
                    found = true;
                    break;
                }
            }
            if (!found) {
                System.out.println("Not found.");
            }
        } catch (Exception e) {
            System.out.println("Reading the file " + e.getMessage() + " failed.");
        }

    }
}
