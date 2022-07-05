package exercise2;

public class FullTimeGameTester extends GameTester {

    public FullTimeGameTester(String n, boolean status) {
        super(n, status);
    }

    @Override
    public double getSalary() {
        return 3000;
    }

}
