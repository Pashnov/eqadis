package entity;

import visitor.Visitable;
import visitor.Visitor;

import java.util.List;

public class Department implements Visitable {

    private String name;
    private List<Contractor> contractors;

    public Department(String name, List<Contractor> contractors) {
        this.name = name;
        this.contractors = contractors;
    }

    public String getName() {
        return name;
    }

    public List<Contractor> getContractors() {
        return contractors;
    }

    public void accept(Visitor visitor) {
        visitor.reportDepartment(this);
    }

}
