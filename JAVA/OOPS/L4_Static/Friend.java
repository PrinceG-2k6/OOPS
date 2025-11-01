package OOPS.L4_Static;

public class Friend {
    String name;
    static int count = 0;

    Friend(String n){
        this.name =n;
        count++;
    }

    static void getCount(){
        System.out.println(count);
    }
    void display(){
        System.out.println("hello "+this.name);
    }
}
