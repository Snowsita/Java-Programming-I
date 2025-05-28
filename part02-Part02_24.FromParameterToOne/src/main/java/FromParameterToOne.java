

public class FromParameterToOne {

    public static void main(String[] args) {
        printFromNumberToOne(3);
    }

    public static void printFromNumberToOne(int number) {
        int j = number;
        for (int i = 0; i < number; i++) {
            System.out.println(j);
            j--;
        }
    }

}
