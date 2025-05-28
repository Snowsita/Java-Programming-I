import java.util.ArrayList;

public class Suitcase {
    private int maxWeight;
    private ArrayList<Item> items;
    private int actualWeight;

    public Suitcase(int maxWeight) {
        this.maxWeight = maxWeight;
        this.items = new ArrayList<>();
    }

    public void addItem(Item item) {
        if (item.getWeight() + this.actualWeight <= maxWeight) {
            this.items.add(item);
            this.actualWeight += item.getWeight();
        }
    }

    public int totalWeight() {
        return this.actualWeight;
    }

    public Item heaviestItem() {
        if (this.items.isEmpty()) {
            return null;
        }
        
        Item heaviest = this.items.get(0);

        for (Item item : this.items) {
            if (item.getWeight() > heaviest.getWeight()) {
                heaviest = item;
            }
        }

        return heaviest;
    }

    public String toString() {
        StringBuilder output = new StringBuilder();

        String s = this.items.size() != 1 ? " items" : " item";

        output.append(this.items.size() == 0 ? "no" : this.items.size()).append(s).append(" (").append(actualWeight)
                .append(" kg)");

        return output.toString();
    }

    public void printItems() {
        for (Item item : this.items) {
            System.out.println(item);
        }
    }
}
