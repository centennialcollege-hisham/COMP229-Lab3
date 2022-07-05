package exercise2;

public abstract class GameTester {
    private String name;
    private Boolean status;

    public GameTester(String name, boolean status) {
        this.name = name;
        this.status = status;
    }

    abstract double getSalary();

}
