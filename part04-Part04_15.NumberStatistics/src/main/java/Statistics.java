
public class Statistics {
    private int count;
    private int sum;

    public Statistics() {
        this.count = count;
    }

    public void addNumber(int number) {
        this.count++;
        this.sum += number;
    }

    public int getCount() {
        return this.count;
    }

    public int sum() {
        return this.sum;
    }

    public double average() {
        if (this.count == 0) {
            return 0.00;
        } else {
            return ((double) this.sum / this.count);
        }
    }
}
