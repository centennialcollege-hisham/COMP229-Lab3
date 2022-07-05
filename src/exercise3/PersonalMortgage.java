package exercise3;

public class PersonalMortgage extends Mortgage {

    public PersonalMortgage(int mortgageNumber, String customerName, double amount, double interestRate, int term) {
        super(mortgageNumber, customerName, amount, interestRate, term);
        setInterestRate(getInterestRate() * 0.02);
    }

    public String getMortgageInfo() {
        return "PersonalMortgage " + super.getMortgageInfo();
    }

}