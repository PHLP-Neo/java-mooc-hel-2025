
import java.nio.file.Paths;
import java.util.Scanner;

public class RecordsFromAFile {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Name of the file:");
        String filename = scanner.nextLine();
        try (Scanner file = new Scanner(Paths.get(filename))){
            while (file.hasNext()) {
                String[] next = file.next().split(",");
                String name = next[0];
                String age = next[1];
                System.out.println(name+", age: "+age+" years");
            }
        } catch (Exception e) {
            System.out.println("Reading the file " + filename + " failed.");
        }
    }
}
