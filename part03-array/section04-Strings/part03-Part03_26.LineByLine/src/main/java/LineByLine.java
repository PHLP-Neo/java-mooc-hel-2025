
import java.util.Scanner;

public class LineByLine {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
//        while (!input.equals("")){
//            int length = input.length();
//            for (int i = 0; i<length; i++) {
//                if (input.charAt(i) == ' ') {
//                    System.out.print("\n");
//                } else {
//                    System.out.print(input.charAt(i));
//                }
//            }
//            System.out.println("\n");
//            input = scanner.nextLine();
//        }
//        // System.out.println("halted");
        while (!input.isBlank()) {            
            String[] pieces = input.split(" ");
            for (String i : pieces) {
                System.out.println(i);
            }
            input = scanner.nextLine();
        }
    }
}
