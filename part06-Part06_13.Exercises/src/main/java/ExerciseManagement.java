import java.util.ArrayList;
import java.util.List;

public class ExerciseManagement {

    private List<String> exercises;
    private List<String> completedExercises;

    public ExerciseManagement() {
        this.exercises = new ArrayList<>();
        this.completedExercises = new ArrayList<>();
    }

    public void add(String exercise) {
        this.exercises.add(exercise);
    }

    public List<String> exerciseList() {
        return this.exercises;
    }

    public void markAsCompleted(String exercise) {
        this.completedExercises.add(exercise);
    }

    public boolean isCompleted(String exercise) {
        return this.completedExercises.contains(exercise);
    }
}
