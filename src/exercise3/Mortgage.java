package exercise3;

import static exercise3.MortgageConstants.*;

public class Mortgage {

    private int mortgageNumber;
    private String customerName;
    private double amount;
    private double interestRate;
    private int term;

    public Mortgage(int mortgageNumber, String customerName, double amount, double interestRate, int term) {
        super();
        this.mortgageNumber = mortgageNumber;
        this.customerName = customerName;
        setAmount(amount);
        this.interestRate = interestRate;
        setTerm(term);

    }

    public int getMortgageNumber() {
        return mortgageNumber;
    }

    public void setMortgageNumber(int mortgageNumber) {
        this.mortgageNumber = mortgageNumber;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        if (amount <= MAX_AMOUNT)
            this.amount = amount;
        else
            this.amount = MAX_AMOUNT;
    }

    public double getInterestRate() {
        return interestRate;
    }

    public void setInterestRate(double interestRate) {
        this.interestRate = interestRate;
    }

    public int getTerm() {
        return term;
    }

    public void setTerm(int term) {
        if (term == 3) {
            this.term = MID_TERM;
        } else if (term == 5) {
            this.term = LONG_TERM;
        } else {
            this.term = SHORT_TERM;
        }
    }

    public String getMortgageInfo() {
        return "mortgageNumber= " + mortgageNumber + ", customerName= " + customerName + ", amount= " + amount
                + ", interestRate= " + interestRate + ", term= " + term + " Year";
    }


}
