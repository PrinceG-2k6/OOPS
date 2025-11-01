package OOPS.L6_Super;

public class Person {
    String first;
    String last;

    Person(String f,String l){
        this.first =f;
        this.last=l;
    }
    
    void showName(){
        System.out.println(first +" "+last);
    }
}
