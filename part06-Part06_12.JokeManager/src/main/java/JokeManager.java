import java.util.ArrayList;
import java.util.Random;

public class JokeManager {
    private ArrayList<String> jokes;

    public JokeManager() {
        this.jokes = new ArrayList<>();
    }

    public void addJoke(String joke) {
        this.jokes.add(joke);
    }

    public String drawJoke() {
        if (this.jokes.isEmpty()) {
            return "Jokes are in short supply.";
        }

        Random random = new Random();
        int randomInt = random.nextInt(this.jokes.size());

        return this.jokes.get(randomInt);
    }

    public void printJokes() {
        for (String joke : this.jokes) {
            System.out.println(joke);
        }
    }
}
