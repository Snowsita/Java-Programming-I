
import java.util.ArrayList;

public class SimpleCollection {

    private String name;
    private int count;
    private ArrayList<String> elements;

    public SimpleCollection(String name) {
        this.name = name;
        this.elements = new ArrayList<>();
    }

    public void add(String element) {
        this.elements.add(element);
        this.count++;
    }

    public String getName() {
        return this.name;
    }

    public ArrayList<String> getElements() {
        return this.elements;
    }

    public String toString() {
        if (this.elements.isEmpty()) {
            return "The collection " + this.name + " is empty.";
        }

        StringBuilder output = new StringBuilder();
        output.append("The collection ").append(this.name).append(" has ")
                .append(this.elements.size()).append(" element");

        if (this.elements.size() != 1) {
            output.append("s");
        }

        output.append(":\n");

        for (String element : this.elements) {
            output.append(element).append("\n");
        }

        return output.toString().trim();
    }

}
