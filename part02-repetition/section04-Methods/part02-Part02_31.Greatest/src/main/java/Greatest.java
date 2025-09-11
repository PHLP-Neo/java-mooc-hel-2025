
public class Greatest {

    public static int greatest(int number1, int number2, int number3) {
        //write some code here
        int large = number1;
        if (large < number2) {
            large = number2;
        }
        if (large < number3) {
            large = number3;
        }
        return large;
    }

    public static void main(String[] args) {
        int result = greatest(2, 7, 3);
        System.out.println("Greatest: " + result);
    }
}
