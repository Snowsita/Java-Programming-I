

public class FromOneToParameter {

    public static void main(String[] args) {
        printUntilNumber(3);
    }

    public static void printUntilNumber(int number) {
        int j = number;
        for (int i = 0; i < number; i++) {
            System.out.println(j);
            j--;
        }
    }

}
