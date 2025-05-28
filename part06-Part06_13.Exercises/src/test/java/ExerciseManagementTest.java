import org.junit.Test;
import static org.junit.Assert.*;
import java.util.List;

public class ExerciseManagementTest {

    @Test
    public void exerciseListEmptyAtBeginning() {
        ExerciseManagement manager = new ExerciseManagement();
        assertEquals(0, manager.exerciseList().size());
    }

    @Test
    public void addingExerciseGrowsListByOne() {
        ExerciseManagement manager = new ExerciseManagement();
        manager.add("exercise 1");
        assertEquals(1, manager.exerciseList().size());
    }

    @Test
    public void addedExerciseIsInList() {
        ExerciseManagement manager = new ExerciseManagement();
        manager.add("exercise 1");
        assertTrue(manager.exerciseList().contains("exercise 1"));
    }

    @Test
    public void exerciseCanBeMarkedAsCompleted() {
        ExerciseManagement manager = new ExerciseManagement();
        manager.add("exercise 1");
        manager.markAsCompleted("exercise 1");
        assertTrue(manager.isCompleted("exercise 1"));
    }

    @Test
    public void ifNotMarkedCompletedNotInCompletedList() {
        ExerciseManagement manager = new ExerciseManagement();
        manager.add("exercise 1");
        manager.add("exercise 2");
        manager.markAsCompleted("exercise 1");
        assertFalse(manager.isCompleted("exercise 2"));
    }
}
