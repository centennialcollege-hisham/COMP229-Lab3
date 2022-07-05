package exercise3;

public class BusinessMortgage extends Mortgage {

    public BusinessMortgage(int mortgageNumber, String customerName, double amount, double interestRate, int term) {
        super(mortgageNumber, customerName, amount, interestRate, term);
        setInterestRate(getInterestRate() * 0.01);
    }

    public String getMortgageInfo() {
        return "BusinessMortgage " + super.getMortgageInfo();
    }

}
