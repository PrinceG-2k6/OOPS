package OOPS.L6_Super;

public class Main {
    public static void main(String[] args) {
        Person p = new Person("Prince", "Gupta");
        Student s = new Student("Prince", "Gupta",9);
        p.showName();
        s.showName();
    }
}
