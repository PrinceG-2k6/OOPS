package OOPS.L9_Interface;

public class Main {
    public static void main(String[] args) {
        Rabbit rabbit = new Rabbit();
        Hawk hawk = new Hawk();
        Fish fish = new Fish();

        hawk.hunt();
        rabbit.flee();
        fish.hunt();
        fish.flee();
    }
}
