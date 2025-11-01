package OOPS.L2_Constructor;

public class Student {
    String name;
    int age;
    double cgpa;
    boolean isEnrolled;

    Student(String n,int a,double c){
        this.name= n;
        this.age =a;
        this.cgpa =c;
        this.isEnrolled=true;
    }

    void study(){
        System.out.println(this.name+" is Studying");
    }
}
