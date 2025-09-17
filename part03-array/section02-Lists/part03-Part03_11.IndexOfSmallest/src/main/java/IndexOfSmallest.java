
import java.util.ArrayList;
import java.util.Scanner;

public class IndexOfSmallest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>();
        int value;
        // implement here a program that reads user input
        // until the user enters 9999
        while (true) {
            value = Integer.valueOf(scanner.nextLine());
            if (value == 9999) {
                break;
            }
            list.add(value);
        }
        // after that, the program prints the smallest number
        // and its index -- the smallest number
        // might appear multiple times

        //int target = Integer.valueOf(scanner.nextLine());
        if (list.isEmpty()) {
            System.out.println("Impossible");
        } else {
            int min = list.get(0);
            for (int i = 0; i < list.size(); i++) {
                if (min > list.get(i)) {
                    min = list.get(i);
                }
            }
            System.out.println("Smallest number: " + min);
            for (int i = 0; i < list.size(); i++) {
                if (min == list.get(i)) {
                    System.out.println("Found at index: " + i);
                }
            }
        }

    }
}
