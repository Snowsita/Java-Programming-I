import java.io.FileWriter;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        try {
            FileWriter writer = new FileWriter("file.txt");
            writer.write("Hello, world!");
            writer.close();
        } catch (IOException e) {
            // silently fail, or optionally log error
        }
    }
}
