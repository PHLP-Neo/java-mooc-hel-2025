
import java.util.Scanner;

public class AgeOfTheOldest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int maxAge = 0;
        while (true) {            
            String sentence = scanner.nextLine();
            if (sentence.equals("")) {
                break;
            }
            int age = Integer.valueOf(sentence.split(",")[1]);
            if (age > maxAge) {
                maxAge = age;
            }
        }
        System.out.println("Age of the oldest: "+maxAge);
    }
}
