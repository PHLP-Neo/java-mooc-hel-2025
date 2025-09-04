
import java.util.Scanner;

public class Password {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // Write your program here 
        String correctPassword = "Caput Draconis";
        System.out.println("Password?");
        String userInput = scan.nextLine();
        if (userInput.equals(correctPassword)) {
            System.out.println("Welcome!");
        } else {
            System.out.println("Off with you!");
        }
    }
}
