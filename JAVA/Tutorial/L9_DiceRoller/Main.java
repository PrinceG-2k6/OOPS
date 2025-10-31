package L9_DiceRoller;

import java.util.Scanner;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Random r = new Random();
        Scanner sc = new Scanner(System.in);
        System.out.println("----------------------------------");
        System.out.println("Welcome To Dice Roller Application");
        System.out.println("----------------------------------");

        int roll;
        int chance;
        int total = 0;
        System.out.println("Enter The Number of Die You want to roll");
        chance = sc.nextInt();

        if (chance > 0) {
            for (int i = 0; i < chance; i++) {
                roll = r.nextInt(1, 7);
                System.out.println(roll);
                printDie(roll);
                total += roll;

            }
            System.out.println("Total : " + total);
        } else {
            System.out.println("Number of Die Should Greater than 0");
        }

        sc.close();

    }

    static void printDie(int roll) {
        String dice1 = """
                 -------
                |       |
                |   *   |
                |       |
                 -------
                """;

        String dice2 = """
                 -------
                | *     |
                |       |
                |     * |
                 -------
                """;
        String dice3 = """
                 -------
                | *     |
                |   *   |
                |     * |
                 -------
                """;
        String dice4 = """
                 -------
                | *   * |
                |       |
                | *   * |
                 -------
                """;
        String dice5 = """
                 -------
                | *   * |
                |   *   |
                | *   * |
                 -------
                """;
        String dice6 = """
                 -------
                | *   * |
                | *   * |
                | *   * |
                 -------
                """;

                switch (roll) {
                    case 1->System.out.println(dice1);
                    case 2->System.out.println(dice2);
                    case 3->System.out.println(dice3);
                    case 4->System.out.println(dice4);
                    case 5->System.out.println(dice5);
                    case 6->System.out.println(dice6);
                }
    }
}
