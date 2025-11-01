package OOPS.L7_MethodOverride;

public class Car {
    String make;
    String model;
    int year;
    String color;
    
    Car(String ma, String mo , int y , String c){
        this.make = ma;
        this.model =mo;
        this.year = y;
        this.color =c;
    }
    @Override
    public String toString(){
        String statement = "You Have A Wonderful "+color+" "+make+" "+model+" Car of "+year;
        return statement;
    }
}

