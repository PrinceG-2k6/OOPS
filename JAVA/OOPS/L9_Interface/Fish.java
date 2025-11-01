package OOPS.L9_Interface;

public class Fish implements Prey,Predator {
    @Override
    public void flee(){
        System.out.println("The Fish is Swimming Away");
    }
    @Override
    public void hunt(){
        System.out.println("The Fish is Chasing");
    }
}
