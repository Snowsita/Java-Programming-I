
public class Greatest {

    public static int greatest(int number1, int number2, int number3) {
        //write some code here

        int answer = 0;
        if (number1 > number2 && number1 > number3) {
            answer = number1;
        } else if (number2 > number1 && number2 > number3) {
            answer = number2;
        } else {
            answer = number3;
        }

        return answer;
    }

    public static void main(String[] args) {
        int result = greatest(2, 7, 3);
        System.out.println("Greatest: " + result);
    }
}
