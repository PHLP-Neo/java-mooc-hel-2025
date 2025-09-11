
import java.util.Scanner;

public class DivisibleByThree {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        divisibleByThreeInRange(2, 10);
    }
    public static void divisibleByThreeInRange(int number1, int number2) {
        int first = number1;
        int last = number2;
        if (number1%3 != 0) {
            first = number1+3-number1%3;
        }
        if (last%3 != 0) {
            last = number2-number2%3;
        }
        while (first<=last) {            
            System.out.println(first);
            first=first+3;
        }
    }
}
