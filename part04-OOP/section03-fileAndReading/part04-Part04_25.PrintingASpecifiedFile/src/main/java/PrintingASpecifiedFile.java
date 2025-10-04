
import java.nio.file.Paths;
import java.util.Scanner;

public class PrintingASpecifiedFile {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Which file should have its contents printed?");
        String filepath = scanner.nextLine();
        try (Scanner file = new Scanner(Paths.get(filepath))){
            while (file.hasNextLine()) {                
                String line = file.nextLine();
                System.out.println(line);
            }
        } catch (Exception e) {
        }
    }
}
