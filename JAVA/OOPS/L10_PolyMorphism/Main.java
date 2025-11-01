package OOPS.L10_PolyMorphism;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Car car =new Car();
        Bike bike = new Bike();
        Boat boat = new Boat();

        Vehicle[] vehicles = {car,bike,boat};//PolyMorphism
        for(Vehicle vehicle : vehicles){
            vehicle.go();
        }

        System.out.println("ENter The Choice 1 == Dog OR 2 == Cat");//RUNTIME POLYMORPHISM
        int choice = sc.nextInt();
        if(choice==1){Animal dog= new Dog();dog.speak();}else{Animal cat= new Cat();cat.speak();}
        
        

        
        
        sc.close();
    }   
}
