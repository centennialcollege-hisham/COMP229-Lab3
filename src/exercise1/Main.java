package exercise1;

import javax.swing.*;
import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<Insurance> insuranceList = new ArrayList<>();
        insuranceList.add(new Life());
        insuranceList.add(new Health());

        runApp(insuranceList);

    }

    private static void runApp(List<Insurance> insuranceList) {
        boolean appStart = true;

        do {
            String chosenAnswer = showQuestion(insuranceList);

            Insurance cacheInsurance = null;
            for (Insurance insurance : insuranceList) {
                if (insurance.getType().equals(chosenAnswer)) {
                    cacheInsurance = insurance;
                    break;
                }
            }

            if (cacheInsurance != null) {
                cacheInsurance.setInsuranceCost();
                cacheInsurance.displayInfo();
            } else {

                JOptionPane.showMessageDialog(null,
                        "Ploymorphic screen manager for displaying result.\n \n" +
                                displayAllResult(insuranceList));


                JOptionPane.showMessageDialog(null,
                        "Thank you for your interest in our insurance program.\n" +
                                "We are sorry to hear that you are not interested in our insurance program.\n" +
                                "Please visit us again!");

                appStart = false;
            }
        } while (appStart);
    }


    public static String displayAllResult(List<Insurance> insuranceList) {
        StringBuilder result = new StringBuilder();
        for (Insurance insurance : insuranceList) {
            insurance.setInsuranceCost();
            result.append(insurance.toString()).append("\n \n");
        }
        return result.toString();
    }

    public static String showQuestion(List<Insurance> insuranceList) {
        return (String) JOptionPane.showInputDialog(
                null,
                question(),
                "Insurance App",
                JOptionPane.QUESTION_MESSAGE,
                new ImageIcon("book.jpg"),
                new String[]{insuranceList.get(0).type, insuranceList.get(1).type},
                null);
    }

    private static String question() {
        return "Select the type of insurance";

    }
}
