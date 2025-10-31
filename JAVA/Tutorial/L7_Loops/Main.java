package L7_Loops;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        for (int i = 1; i <= 5; i++) {
            System.out.println("Count: " + i);
        }

        int i = 1;
        while (i <= 5) {
            System.out.println("Number: " + i);
            i++;
        }
        i = 0;
        do {
            System.out.println("Value: " + i);
            i++;
        } while (i <= 5);
        int[] numbers = { 10, 20, 30, 40 };

        for (int num : numbers) {
            Thread.sleep(1000);
            System.out.println(num);
        }

    }
}
