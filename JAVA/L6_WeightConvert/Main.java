package L6_WeightConvert;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);

        System.out.println("Welcome To Weight Conversion application");
        System.out.println("----------------------------------------");
        System.out.println("What Do You Want to Do");
        System.out.println("1.lbs to Kg");
        System.out.println("2.Kg to lbs");
        int choice = sc.nextInt();
        double weight;
        double newWeight;
        if(choice==1){
            System.out.println("Enter In lbs");
            weight = sc.nextDouble();
            newWeight = weight*0.453592;
            System.out.printf("You're Weight in Kg is %.2f"+ newWeight);

        }else if(choice==2){
            System.out.println("Enter In Kg");
            weight = sc.nextDouble();
            newWeight = weight*2.2046;
            System.out.printf("You're Weight in lbs is %.2f"+ newWeight);
        }
        else{
             System.out.printf("Invalid Choice");
        }
        sc.close();
    }
}
