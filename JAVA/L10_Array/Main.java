package L10_Array;
import java.util.Arrays;
public class Main {
    public static void main(String[] args) {
        String[] fruits ={"Banana","Coconut","Apple","Orange","Pineapple"};
        
        Arrays.sort(fruits);
        // Arrays.fill(fruits, "Pineapple");
        for(String fruit : fruits){
            System.out.print(fruit + " ");
        }
        System.out.println("\n"+fruits.length);

        // String[] foods = new String[3];
        // foods[0]="Taco";
        // foods[1]="Pizza";
        // foods[2]="hamBurger";

        String target ="pineapple";
        for(int i =0 ;i<fruits.length;i++){
            if(fruits[i].equalsIgnoreCase(target)){
                System.out.println("Fruit Found at Index : "+i);
            }
        }
    }   
}
