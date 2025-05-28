public class Container {
    private int amounts;

    public Container() {
        this.amounts = 0;
    }

    public int contains() {
        return this.amounts;
    }

    public void add(int amount) {
        if (amount > 0) {
            this.amounts += amount;
            if (this.amounts > 100) {
                this.amounts = 100;
            }
        }
    }

    public void remove(int amount) {
        if (amount > 0) {
            this.amounts -= amount;
            if (this.amounts < 0) {
                this.amounts = 0;
            }
        }
    }

    public String toString() {
        return this.amounts + "/100";
    }
}
