
import java.util.Scanner;

public class RepeatingBreakingAndRemembering {

    public static void main(String[] args) {
        
        // This exercise is worth five exercise points, and it is 
        // gradually extended part by part.
        
        // If you want, you can send this exercise to the server
        // when it's just partially done. In that case the server will complain about 
        // the parts you haven't done, but you'll get points for the finished parts.
        
        Scanner scanner = new Scanner(System.in);
        System.out.println("Give numbers:");
        int input = Integer.valueOf(scanner.nextLine());
        int sum = 0;
        int number = 0;
        int even = 0;
        int odd = 0;
        while (input != -1) {
            sum += input;
            number += 1;
            if (input % 2 == 0) {
                even += 1;
            } else {
                odd += 1;
            }
            input = Integer.valueOf(scanner.nextLine());
        }
        System.out.println("Thx! Bye!");
        System.out.println("Sum: "+sum);
        System.out.println("Numbers: "+number);
        if (number > 0) {
            System.out.println("Average: "+(double) sum/number);
        } else {
            System.out.println("Average: -inf");
        }
        System.out.println("Even: "+even);
        System.out.println("Odd: "+odd);
    }
}
