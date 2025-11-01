package OOPS.L2_Constructor;
// OverLoaded Constructor
public class User {
    String userName;
    String email;
    int age;

    User(){
        this.userName="Guest";
        this.email="Not Provided";
        this.age =0;
    }

    User(String n){
        this.userName=n;
        this.email="Not Provided";
        this.age =0;
    }
    User(String n,String e){
        this.userName=n;
        this.email=e;
        this.age =0;
    }
    User(String n,String e,int a){
        this.userName=n;
        this.email=e;
        this.age =a;
    }
    
}
