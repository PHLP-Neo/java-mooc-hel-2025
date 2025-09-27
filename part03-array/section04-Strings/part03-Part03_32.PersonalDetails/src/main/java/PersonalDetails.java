
import java.util.ArrayList;
import java.util.Scanner;

public class PersonalDetails {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sumAge = 0;
        String name="";
        int maxLen = 0;
        int count = 0;
        while (true) {            
            String sentence = scanner.nextLine();
            if (sentence.equals("")) {
                break;
            }
            int age = Integer.valueOf(sentence.split(",")[1]);
            sumAge += age;
            int nameLength = sentence.split(",")[0].length();
            if (nameLength > maxLen) {
                maxLen = nameLength;
                name = sentence.split(",")[0];
            }
            count ++;
        }
        if (count>0){
            System.out.println("Longest name: "+name);
            System.out.println("Average of the birth years: "+(1.0*sumAge/count));
        }
        
    }
}
