package OOPS.L6_Super;

public class Student extends Person{
    int cgpa;

    Student(String f,String l,int c){
        super(f, l);
        this.cgpa=c;
    }

    void showName(){
        System.out.println(super.first+" " +last+" " +cgpa);
    }
}
