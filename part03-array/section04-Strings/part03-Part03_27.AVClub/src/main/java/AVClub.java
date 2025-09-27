
import java.util.Scanner;

public class AVClub {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String sentence = scanner.nextLine();
        while (!sentence.isEmpty()) {
            String[] wordlist = sentence.split(" ");
            for (String word : wordlist) {
                if (word.contains("av")) {
                    System.out.println(word);
                }
            }
            sentence = scanner.nextLine();
        }

    }
}
