import java.util.ArrayList;

public class Birds {
    private ArrayList<Bird> birds;

    public Birds() {
        this.birds = new ArrayList<>();
    }

    public void addBird(String name, String latinName, int observations) {
        Bird birdToAdd = new Bird(name, latinName, observations);
        this.birds.add(birdToAdd);
    }

    public void addObserv(String name) {
        for (Bird bird : birds) {
            if (bird.getName().equalsIgnoreCase(name)) {
                bird.addObservation();
                return;
            }
        }
    }

    public String printBird(String name) {
        StringBuilder birdPrint = new StringBuilder();
        for (Bird bird : birds) {
            if (bird.getName().equalsIgnoreCase(name)) {
                birdPrint.append(bird.getName()).append(" (").append(bird.getLatinName()).append("): ").append(bird.getObservations()).append(" observations");
            }
        }
        return birdPrint.toString();
    }

    @Override
    public String toString() {
        StringBuilder allBirds = new StringBuilder();

        for (Bird bird : birds) {
            allBirds.append(bird.getName()).append(" (").append(bird.getLatinName()).append("): ").append(bird.getObservations()).append(" observations\n");
        }

        return allBirds.toString().trim();
    }

    
}
