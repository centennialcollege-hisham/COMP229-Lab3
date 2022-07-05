package exercise2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the game tester type [1 for full-time, 2 for part-time]: ");

        char chosenAnswer = sc.next().charAt(0);

        GameTester gameTester;
        if (chosenAnswer == '1') {
            gameTester = new FullTimeGameTester("Hisham Sanimeh", true);
            System.out.println("\nThe salary of a Full time game tester is: $" + gameTester.getSalary());

        } else {
            System.out.print("Enter the number of hours part-time game tester worked: ");
            int hours = sc.nextInt();

            gameTester = new PartTimeGameTester("Hisham Sanimeh", false, hours);
            System.out.println("\nThe salary of a Part time game tester is: $" + gameTester.getSalary());
        }

    }

}
