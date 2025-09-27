
import java.util.Scanner;

public class NameOfTheOldest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int maxAge = 0;
        String name="";
        while (true) {            
            String sentence = scanner.nextLine();
            if (sentence.equals("")) {
                break;
            }
            int age = Integer.valueOf(sentence.split(",")[1]);
            if (age > maxAge) {
                maxAge = age;
                name = sentence.split(",")[0];
            }
        }
        System.out.println("Name of the oldest: "+name);
    }
}
