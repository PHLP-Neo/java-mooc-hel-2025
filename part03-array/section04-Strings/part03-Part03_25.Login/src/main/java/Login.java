
import java.util.Scanner;

public class Login {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] username = {"alex","emma"};
        String[] password = {"sunshine","haskell"};
        System.out.println("Enter username: ");
        String usernameInput = scanner.nextLine();
        System.out.println("Enter password: ");
        String passwordInput = scanner.nextLine();
        int databaseSize = username.length;
        boolean loginFlag = false;
        for (int i = 0; i < databaseSize; i++) {
            if (usernameInput.equals(username[i]) && !loginFlag) {
                if (passwordInput.equals(password[i])){
                    System.out.println("You have successfully logged in!");
                    loginFlag = true;
                }
            }
        }
        if (!loginFlag) {
            System.out.println("Incorrect username or password!");
        }
    }
}
