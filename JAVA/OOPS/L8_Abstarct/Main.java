package OOPS.L8_Abstarct;

public class Main {
    public static void main(String[] args) {
        // Shape shape = new Shape(); ERROR
        Triangle triangle = new Triangle();
        Circle circle = new Circle();

        circle.display();
        triangle.display();
    }
}
