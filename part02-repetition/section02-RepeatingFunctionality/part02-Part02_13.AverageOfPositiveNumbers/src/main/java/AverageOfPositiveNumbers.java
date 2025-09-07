
import java.util.Scanner;

public class AverageOfPositiveNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sumOfNumbers = 0;
        int numOfNumbers = 0;
        while (true) {
            System.out.println("Give a number:");
            int number = Integer.valueOf(scanner.nextLine());
            if (number == 0) {
                break;
            }
            if (number > 0) {
                sumOfNumbers += number;
                numOfNumbers += 1;
            }
        }
        if (numOfNumbers == 0) {
            System.out.println("Cannot calculate the average");
        } else {
            double averageOfNumbers = (double) sumOfNumbers/numOfNumbers;
            System.out.println("Average of the numbers: " + averageOfNumbers);
        }
    }
}
