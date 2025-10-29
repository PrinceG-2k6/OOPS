package L4_Math;

import java.util.Random;
public class Main {
    public static void main(String[] args) {
        
        Random r =new Random();
        // int number = r.nextInt(15,100);
        // System.out.println(number);

        
        // double number = r.nextDouble(15,100);
        // System.out.println(number);

        boolean isHeads = r.nextBoolean();
        if(isHeads){
            System.out.println("Its Heads!!!!");
        }
        else{
            
            System.out.println("Its Tails!!!!");
        }

        System.out.println(Math.PI);
        System.out.println(Math.E);

        double result =Math.pow(2, 3);
        System.out.println(result);
        System.out.println(Math.abs(-231));
        System.out.println(Math.sqrt(16));
        System.out.println(Math.round(8.342));
        System.out.println(Math.ceil(16.01));
        System.out.println(Math.floor(16.01));
        System.out.println(Math.max(16,29));
        System.out.println(Math.min(16,29));

    }
}
