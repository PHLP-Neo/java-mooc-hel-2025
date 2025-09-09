
import java.util.Scanner;

public class Factorial {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Give a number: ");
        int number = Integer.valueOf(scanner.nextLine());
        int max = 1;
        if (number != 0) {
            for (int i = 1; i <= number; i++) {
                max = max*i;
            }
        }
        System.out.println("Factorial: "+max);
    }
}
