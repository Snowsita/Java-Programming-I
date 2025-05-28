
import java.util.Scanner;

public class mainProgram {

    public static void main(String[] args) {
        // NB! Do not create other scanner objects than the one below
        // if and when you create other classes, pass the scanner to them
        // as a parameter

        System.out.println("Options menu:");
        System.out.println("Add - adds a bird");
        System.out.println("Observation - adds an observation");
        System.out.println("All - prints all birds");
        System.out.println("One - prints one bird");
        System.out.println("Quit - ends program");

        Scanner scan = new Scanner(System.in);
        Birds birds = new Birds();

        while (true) {
            System.out.println("Enter command:");
            String command = scan.nextLine();

            switch (command) {
                case "Add":
                    System.out.println("Bird's name:");
                    String name = scan.nextLine();
                    System.out.println("Bird's latin name:");
                    String latinName = scan.nextLine();
                    birds.addBird(name, latinName, 0);
                    break;

                case "Observation":
                    System.out.println("Bird's name:");
                    String observName = scan.nextLine();
                    birds.addObserv(observName);
                    break;

                case "All":
                    System.out.println(birds);
                    break;

                case "One":
                    System.out.println("Bird's name:");
                    String printName = scan.nextLine();
                    System.out.println(birds.printBird(printName));
                    break;

                case "Quit":
                    return;
            
                default:
                    continue;
            }

        }
    }

}
