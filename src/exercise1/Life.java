package exercise1;

import javax.swing.*;

class Life extends Insurance {

    public Life() {
        super("Life");
    }

    @Override
    void setInsuranceCost() {
        monthlyCost = 1050;
    }

    @Override
    void displayInfo() {
        JOptionPane.showMessageDialog(null, toString());
    }


    @Override
    public String toString() {
        return "Type of Insurance :" + getType() + "\n" +
                "Monthly Cost :$" + getMonthlyCost();
    }
}
