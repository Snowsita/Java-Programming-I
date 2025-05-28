public class Items {
    private String id;
    private String name;

    public Items(String id, String name) {
        this.id = id;
        this.name = name;
    }

    public String getId() {
        return this.id;
    }

    public String getName() {
        return this.name;
    }

    public boolean equals(Object compared) {
        if (this == compared) {
            return true;
        }

        if (!(compared instanceof Items)) {
            return false;
        }

        Items comparedItem = (Items) compared;

        if (this.name.equals(comparedItem.name) &&
                this.id.equals(comparedItem.id)) {
            return true;
        }

        return false;

    }

    public String toString() {
        return this.id + ": " + this.name;
    }
}