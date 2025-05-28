
public class Apartment {

    private int rooms;
    private int squares;
    private int pricePerSquare;

    public Apartment(int rooms, int squares, int pricePerSquare) {
        this.rooms = rooms;
        this.squares = squares;
        this.pricePerSquare = pricePerSquare;
    }

    public boolean largerThan(Apartment compared) {
        if (this.squares < compared.squares) {
            return false;
        }
        return true;
    }

    public int price() {
        return this.pricePerSquare * this.squares;
    }

    public int priceDifference(Apartment compared) {
        if (this.price() < compared.price()) {
            return compared.price() - this.price();
        }
        return this.price() - compared.price();
    }

    public boolean moreExpensiveThan(Apartment compared) {
        if (this.price() > compared.price()) {
            return true;
        }
        return false;
    }

}
