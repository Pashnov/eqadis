package entity;

public class Contractor {

    private String title;
    private int salary;

    public Contractor(String title, int salary) {
        this.title = title;
        this.salary = salary;
    }

    public String getTitle() {
        return title;
    }

    public int getSalary() {
        return salary;
    }

}
