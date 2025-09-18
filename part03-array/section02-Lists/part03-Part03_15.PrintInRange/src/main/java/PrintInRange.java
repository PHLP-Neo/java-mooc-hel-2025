
import java.util.ArrayList;
import java.util.Scanner;

public class PrintInRange {

    public static void main(String[] args) {
        // Try your method here
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>();
        while (true) {            
            int input = Integer.valueOf(scanner.nextLine());
            if (input == 9999){
                break;
            }
        }
        
    }
    public static void printNumbersInRange
        (ArrayList<Integer> list, int lower, int higher) {
        for (int i : list) {
            if (i <= higher && i >= lower) {
                System.out.println(i);
            }
        }
    }
}
