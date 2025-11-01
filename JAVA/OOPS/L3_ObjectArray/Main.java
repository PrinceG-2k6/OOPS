package OOPS.L3_ObjectArray;

public class Main {
    public static void main(String[] args) {
        Car car1 = new Car("Mustang","Red");
        Car car2 = new Car("Charger","Yellow");
        Car car3 = new Car("Rolls royce","Black"); 

        Car[] cars ={car1,car2,car3};
        for(Car car:cars){
            car.drive();
        }
    }
}
