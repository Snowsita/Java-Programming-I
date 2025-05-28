
public class Main {

    public static void main(String[] args) {
        // you can write code here to try out your program
        SimpleDate date = new SimpleDate(24, 7, 2017);
        SimpleDate date2 = new SimpleDate(24, 7, 2017);

        Person leo = new Person("Leo", date, 60, 9);
        Person lily = new Person("Lily", date2, 60, 9);

        if (leo.equals(lily)) {
            System.out.println("Is this quite correct?");
        }

        Person leoWithDifferentWeight = new Person("Leo", date, 62, 10);

        if (leo.equals(leoWithDifferentWeight)) {
            System.out.println("Is this quite correct?");
        }

    }
}
