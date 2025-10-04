
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class SportStatistics {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("File:");
        String filepath = scan.nextLine();
        System.out.println("Team:");
        String teamName = scan.nextLine();
        try ( Scanner file = new Scanner(Paths.get(filepath))) {
            int game = 0;
            int win = 0;
            int lose = 0;
            while (file.hasNext()) {
                String next = file.next();
                if (next.split(",")[0].equals(teamName)) {
                    game++;
                    if (Integer.valueOf(next.split(",")[2])
                            < Integer.valueOf(next.split(",")[3])) {
                        lose++;
                    }
                    if (Integer.valueOf(next.split(",")[2])
                            > Integer.valueOf(next.split(",")[3])) {
                        win++;
                    }
                }

                if (next.split(",")[1].equals(teamName)) {
                    game++;
                    if (Integer.valueOf(next.split(",")[2])
                            < Integer.valueOf(next.split(",")[3])) {
                        win++;
                    }
                    if (Integer.valueOf(next.split(",")[2])
                            > Integer.valueOf(next.split(",")[3])) {
                        lose++;
                    }
                }
            }
            System.out.println("Games: " + game);
            System.out.println("Wins: " + win);
            System.out.println("Losses: " + lose);
        } catch (Exception e) {
            System.out.println("Reading the file " + filepath + " failed.");
        }
    }

}
