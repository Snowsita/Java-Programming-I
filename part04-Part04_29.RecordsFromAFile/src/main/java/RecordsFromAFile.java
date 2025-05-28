
import java.nio.file.Paths;
import java.util.Scanner;

public class RecordsFromAFile {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Name of the file:");
        String file = scanner.nextLine();
        String age = "";

        try (Scanner searcher = new Scanner(Paths.get(file))) {
            while (searcher.hasNextLine()) {
                String information = searcher.nextLine();

                if (information.equals("")) {
                    continue;
                }

                String[] parts = information.split(",");

                if (parts[1] == "1") {
                    age = " year";
                } else {
                    age = " years";
                }

                System.out.println(parts[0] + ", age: " + parts[1] + age);
            }
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }

    }
}
