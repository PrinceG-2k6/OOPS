package OOPS.L5_Extend;

public class Animal {
    boolean isAlive;
    int lives = 0;

    Animal(){
        isAlive =true;
    }
    void eat(){
        System.out.println("This animal is eating");
    }
    void speak(){
        System.out.println("Animal is speaking");
    }
    
}
