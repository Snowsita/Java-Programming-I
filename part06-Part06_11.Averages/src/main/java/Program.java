
import java.util.Scanner;

public class Program {

    public static void main(String[] args) {
        GradeRegister register = new GradeRegister();
        register.addGradeBasedOnPoints(82);
        register.addGradeBasedOnPoints(83);
        register.addGradeBasedOnPoints(96);
        register.addGradeBasedOnPoints(51);
        register.addGradeBasedOnPoints(48);
        register.addGradeBasedOnPoints(56);
        register.addGradeBasedOnPoints(61);

        System.out.println(register.averageOfPoints());
        System.out.println(register.averageOfGrades());

    }
}
