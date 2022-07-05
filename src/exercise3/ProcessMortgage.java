package exercise3;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ProcessMortgage {


    public static void main(String[] args) {

        List<Mortgage> mortgages = new ArrayList<>();

        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < 3; i++) {
            System.out.println("Choose Mortgage:");
            System.out.print("1.Personal");
            System.out.print(" ~~ 2.Business ");
            int choice = scanner.nextInt();
            mortgages.add(getMortgageInserted(choice));
        }

        for (Mortgage mortgage : mortgages) {
            System.out.println("\n" + mortgage.getMortgageInfo());
        }

    }


    private static Mortgage getMortgageInserted(int mortgageSelected) {
        Scanner scanner = new Scanner(System.in);

        Mortgage mortgage;

        System.out.print("Enter number: ");
        int number = scanner.nextInt();
        System.out.print("Enter name: ");
        String name = scanner.next();
        System.out.print("Enter amount: ");
        double amount = scanner.nextDouble();
        System.out.print("Enter interestRate: ");
        double rate = scanner.nextDouble();
        System.out.print("Enter term in years from the following: {1, 3, 5}: ");
        int term = scanner.nextInt();

        if (mortgageSelected == 1) {
            mortgage = new PersonalMortgage(number, name, amount, rate, term);
        } else {
            mortgage = new BusinessMortgage(number, name, amount, rate, term);
        }

        return mortgage;

    }

}

