package exercise1;

import javax.swing.*;

class Health extends Insurance {

    public Health() {
        super("Health");
    }

    @Override
    void setInsuranceCost() {
        monthlyCost = 700;
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
