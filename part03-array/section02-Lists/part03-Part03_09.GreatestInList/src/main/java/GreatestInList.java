
import java.util.ArrayList;
import java.util.Scanner;

public class GreatestInList {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int range = 0;
        ArrayList<Integer> list = new ArrayList<>();
        while (true) {
            int input = Integer.valueOf(scanner.nextLine());
            if (input == -1) {
                break;
            }
            range += 1;
            list.add(input);
        }
        int max = list.get(0);
        for (int i = 0; i < range; i++) {
            if (max < list.get(i)){
                max = list.get(i);
            }
        }
        System.out.println("The greatest number: "+max);

        // implement finding the greatest number in the list here
    }
}
