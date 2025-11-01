package OOPS.L2_Constructor;

public class Main {
    public static void main(String[] args) {
        // Student s1 =new Student("Sam", 19, 8.6);
        // // Student s2 =new Student("Peter", 20, 9.6);

        // System.out.println(s1.name);
        // System.out.println(s1.age);
        // System.out.println(s1.cgpa);

        // // System.out.println(s2.name);
        // // System.out.println(s2.age);
        // // System.out.println(s2.cgpa);

        // s1.study();
        User u0 = new User();
        User u1 = new User("prince");
        User u2 = new User("prince", "prince@test.com");
        User u3 = new User("prince", "prince@test.com", 19);
        System.out.println(u0.userName);
        System.out.println(u1.userName);
        System.out.println(u2.userName);
        System.out.println(u3.userName);
        System.out.println();
        System.out.println(u1.email);
        System.out.println(u2.email);
        System.out.println(u3.email);
        System.out.println();
        System.out.println(u1.age);
        System.out.println(u2.age);
        System.out.println(u3.age);
    }
}
