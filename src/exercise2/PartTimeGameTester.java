package exercise2;

public class PartTimeGameTester extends GameTester {

    private int hours;

    public PartTimeGameTester(String n, boolean status, int hours) {
        super(n, status);
        this.hours = hours;
    }

    @Override
    public double getSalary() {
        return this.hours * 20;
    }
}
