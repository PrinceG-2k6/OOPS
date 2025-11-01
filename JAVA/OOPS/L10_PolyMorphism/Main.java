package OOPS.L10_PolyMorphism;

public class Main {
    public static void main(String[] args) {
        Car car =new Car();
        Bike bike = new Bike();
        Boat boat = new Boat();

        Vehicle[] vehicles = {car,bike,boat};//PolyMorphism
        for(Vehicle vehicle : vehicles){
            vehicle.go();
        }
    }   
}
