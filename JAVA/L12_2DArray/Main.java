package L12_2DArray;

public class Main {
    public static void main(String[] args) {
        String[] fruits = {"Apple","Coconut","Banana"};
        String[] vegetable = {"Tomato","Potato","Onion"};
        String[] meats = {"Fish","Mutton","Chicken"};
        String[][] grocerry = {fruits,vegetable,meats};

        for(String[] groc: grocerry){
            for(String g:groc){
                System.out.print(g+" ");
            }
            System.out.println();
        }
    }
}
