
import java.util.Scanner;

public class UserInterface {

    private GradeRegister register;
    private Scanner scanner;
    private int totalPoints;

    public UserInterface(GradeRegister register, Scanner scanner) {
        this.register = register;
        this.scanner = scanner;
        
    }

    public void start() {
        readPoints();
        System.out.println("");
        System.out.println("Average of points: " + this.averageOfPoints());
        System.out.println("Average of grades: " + this.averageOfGrades());
        printGradeDistribution();
    }

    public void readPoints() {
        while (true) {
            System.out.print("Points: ");
            String input = scanner.nextLine();
            if (input.equals("")) {
                break;
            }

            int points = Integer.valueOf(input);

            if (points < 0 || points > 100) {
                System.out.println("Impossible number.");
                continue;
            }

            this.totalPoints += points;
            this.register.addGradeBasedOnPoints(points);
        }
    }

    public void printGradeDistribution() {
        int grade = 5;
        while (grade >= 0) {
            int stars = register.numberOfGrades(grade);
            System.out.print(grade + ": ");
            printsStars(stars);
            System.out.println("");

            grade = grade - 1;
        }
        
    }

    public double averageOfPoints() {
        return this.register.averageOfPoints();
    }

    public double averageOfGrades() {
        return this.register.averageOfGrades();
    }

    public int totalPoints() {
        return this.totalPoints;
    }

    public static void printsStars(int stars) {
        while (stars > 0) {
            System.out.print("*");
            stars--;
        }
    }
}
