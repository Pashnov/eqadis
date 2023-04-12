package entity;

import visitor.Visitable;
import visitor.Visitor;

import java.util.List;

public class Company implements Visitable {

    private List<Department> departments;

    public Company(List<Department> departments) {
        this.departments = departments;
    }

    public List<Department> getDepartments() {
        return departments;
    }

    public void accept(Visitor visitor) {
        visitor.reportCompany(this);
    }

}
