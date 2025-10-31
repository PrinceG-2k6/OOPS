package LabWork.Exp9;

public class StudentDirectory {

    public static class Student {
        private String name;
        private int age;
        private String studentId;

        public Student(String name, int age, String studentId) {
            this.name = name;
            this.age = age;
            this.studentId = studentId;
        }

        public String getName() {
            return name;
        }

        @Override
        public String toString() {
            return "Student{name='" + name + "', age=" + age + ", studentId='" + studentId + "'}";
        }
    }

    private Student[] students = new Student[5];
    private int count = 0;

    public void addStudent(Student student) {
        if (count < students.length) {
            students[count++] = student;
        } else {
            System.out.println("Directory full! Cannot add more students.");
        }
    }

    public void searchStudent(String name) {
        boolean found = false;
        for (int i = 0; i < count; i++) {
            if (students[i].getName().equalsIgnoreCase(name)) {
                System.out.println("Found: " + students[i]);
                found = true;
                break;
            }
        }
        if (!found) System.out.println("Student with name '" + name + "' not found.");
    }

    public void displayAllStudents() {
        if (count == 0) {
            System.out.println("Directory is Empty.");
        } else {
            System.out.println("All Students:");
            for (int i = 0; i < count; i++) {
                System.out.println(students[i]);
            }
        }
    }

    public static void main(String[] args) {
        StudentDirectory directory = new StudentDirectory();

        
        directory.addStudent(new Student("Prince", 20, "BT24CSA066"));
        directory.addStudent(new Student("Aditiya", 21, "BT24ECE071"));
        directory.addStudent(new Student("Ashutosh", 19, "BT24CSA054"));
        // directory.addStudent(new Student("Nikhil", 21, "BT24CSA043"));
        // directory.addStudent(new Student("Om", 19, "BT24CSAECE116"));
        // directory.addStudent(new Student("Gaurav", 29, "BT24CSE201"));
        // directory.displayAllStudents();
        

        directory.searchStudent("Prince");       
        directory.searchStudent("Ajit");     
        // directory.displayAllStudents();
    }
}
