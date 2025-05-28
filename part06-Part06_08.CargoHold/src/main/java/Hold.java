import java.util.ArrayList;

public class Hold {
    private int maxWeight;
    private int weight;
    private ArrayList<Suitcase> holds;

    public Hold(int maxWeight) {
        this.maxWeight = maxWeight;
        this.holds = new ArrayList<>();
    }

    public void addSuitcase(Suitcase suitcase) {
        if (suitcase.totalWeight() + weight <= this.maxWeight) {
            this.holds.add(suitcase);
            weight += suitcase.totalWeight();
        }
    }

    public void printItems() {
        for (Suitcase hold : this.holds) {
            hold.printItems();
        }
    }

    public String toString() {
        return this.holds.size() + " suitcases (" + weight + " kg)";
    }
}
