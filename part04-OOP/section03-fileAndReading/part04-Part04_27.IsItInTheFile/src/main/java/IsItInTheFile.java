
import java.nio.file.Paths;
import java.util.Scanner;

public class IsItInTheFile {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Name of the file:");
        String filepath = scanner.nextLine();

        System.out.println("Search for:");
        String searchedFor = scanner.nextLine();

        boolean found = false;

        try ( Scanner file = new Scanner(Paths.get(filepath))) {
            while (file.hasNext()) {
                String next = file.next();
                if (next.equals(searchedFor)) {
                    found = true;
                }
            }

            if (found) {
                System.out.println("Found!");
            } else {
                System.out.println("Not found.");
            }

        } catch (Exception e) {
            System.out.println("Reading the file " + filepath + " failed.");
        }
    }
}
