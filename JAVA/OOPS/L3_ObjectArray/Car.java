package OOPS.L3_ObjectArray;

public class Car {
    String model;
    String color;

    Car(String m,String c){
        this.model = m;
        this.color =c;
        
    }
    void drive(){
        System.out.println("You are Driving "+color+model);
    }
}
