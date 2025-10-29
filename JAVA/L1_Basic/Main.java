package L1_Basic;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // // store roll no
        // int[] numbers = new int[5];
        // numbers[0] = 0;
        // numbers[1] = 1;
        // numbers[2] = 2;
        // numbers[3] = 3;
        // numbers[4] = 4;

        // // store 5 names
        // String[] names = new String[5];
        // names[0] = "hello";
        // names[1] = "hello";
        // names[2] = "hello";
        // names[3] = "hello";
        // names[4] = "hello";
        // for (int i = 0; i < 5; i++) {
        // System.out.println(numbers[i]);
        // }

        // int age = 19;
        // double cgpa = 9.5;
        // char c = 'P';
        // boolean isStudent = true;
        // System.out.println("Age "+age);
        // System.out.println("CGPA "+cgpa);
        // System.out.println("Character "+c);
        // System.out.println("Student "+isStudent);

        Scanner sc = new Scanner(System.in);
        // System.out.print("Enter Your Name : ");
        // // String name = sc.nextLine();
        // String name = sc.next();

        // System.out.print("Enter Your Age : ");
        // int age = sc.nextInt();
        // System.out.print("Enter Your CGPA : ");
        // double cgpa = sc.nextDouble();
        // System.out.println("Hello " + name);
        // System.out.println("You are " + age + " Years Old Having CGPA " + cgpa);

        //COMMON ISSUES
        
        System.out.print("Enter Your Age : ");
        int age = sc.nextInt();
        sc.nextLine();/*this need to written after taking input of int fortaking input of string ,otherwise, string input will be \n  */
        System.out.print("Enter Your Favourite Color : ");
        String color = sc.nextLine();
        System.out.println("You are " + age + " Years Old Having favourite color " + color);

        sc.close();
    }

}
