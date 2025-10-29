package L2_MidLabGame;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        String adjective1;
        String noun;
        String adjective2;
        String verb;
        String adjective3;

        System.out.print("Enter The Adjective1 (Description)");
        adjective1 = sc.nextLine();
        System.out.print("Enter The Noun (Name/Animal)");
        noun = sc.nextLine();
        System.out.print("Enter The Adjective2 (Description)");
        adjective2 = sc.nextLine();
        System.out.print("Enter The Verb (Action)");
        verb = sc.nextLine();
        System.out.print("Enter The Adjective3 (Description)");
        adjective3 = sc.nextLine();

        System.out.println("Today I went to "+adjective1+" Zoo");
        
        System.out.println("In an Exhibit, I saw a "+noun);
        
        System.out.println(noun+" was "+adjective2+" and "+verb);
        
        System.out.println("I was "+adjective3);

        sc.close();
    }
}
