
import java.util.Scanner;

public class GradesAndPoints {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        //my own code:
        System.out.println("Give points [0-100]:");
        int userPoint = Integer.valueOf(scan.nextLine());
        if (userPoint < 0) {
            System.out.println("Grade: 	impossible!");
        } else if (userPoint <= 49) {
            System.out.println("Grade: 	failed");
        } else if (userPoint <= 59) {
            System.out.println("Grade: 	1");
        } else if (userPoint <= 69) {
            System.out.println("Grade: 	2");
        } else if (userPoint <= 79) {
            System.out.println("Grade: 	3");
        } else if (userPoint <= 89) {
            System.out.println("Grade: 	4");
        } else if (userPoint <= 100) {
            System.out.println("Grade: 	5");
        } else {
            System.out.println("Grade: 	incredible!");
        }
    }
}
