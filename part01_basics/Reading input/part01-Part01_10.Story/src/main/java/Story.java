
import java.util.Scanner;

public class Story{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("I will tell you a story, but I need some information first.");
        System.out.println("What is the main character called?");
        String mc_name = scanner.nextLine();
        System.out.println("What is their job?");
        String mc_job = scanner.nextLine();
        System.out.println("Here is the story:");
        System.out.println("Once upon a time there was "+mc_name+", who was "+mc_job+".");
        System.out.println("On the way to work, "+mc_name+" reflected on life.");
        System.out.println("Perhaps "+mc_name+" will not be "+mc_job+" forever.");
    } 

}