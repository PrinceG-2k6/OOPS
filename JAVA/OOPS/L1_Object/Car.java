package OOPS.L1_Object;

public class Car {
    String make="Ford";
    String model ="Mustang";
    int year = 2025;
    double price = 580000.99;
    boolean isRunning =false;

    void start(){
        isRunning =true;
        System.out.println("Engine is Started");
    }
    void stop(){
        isRunning =false;
        System.out.println("Engine is Stooped");
    }
}
