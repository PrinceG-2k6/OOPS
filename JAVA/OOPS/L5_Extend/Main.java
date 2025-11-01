package OOPS.L5_Extend;

public class Main {
    public static void main(String[] args) {
        Animal a = new Animal();
        Dog dog = new Dog();
        Cat cat = new Cat();
        System.out.println(dog.isAlive);
        System.out.println(cat.isAlive);
    
        a.eat();
        dog.eat();
        cat.eat();

        
        System.out.println(dog.lives);
        System.out.println(cat.lives);


        a.speak();
        dog.speak();
        cat.speak();

    }
}
