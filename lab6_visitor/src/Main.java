import entity.Company;
import entity.Contractor;
import entity.Department;
import visitor.SalaryReportVisitor;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        System.out.println("Hello world!");
        Company company = buildCompany();
        Department d1 = company.getDepartments().get(0);

        SalaryReportVisitor salaryReportVisitor = new SalaryReportVisitor();
        company.accept(salaryReportVisitor);
        d1.accept(salaryReportVisitor);

        System.out.println("Company salary: " + salaryReportVisitor.getReportCompany());
        System.out.println("Department d1 salary: " + salaryReportVisitor.getReportDepartment());

        Department d2 = company.getDepartments().get(1);
        d2.accept(salaryReportVisitor);
        System.out.println("Department d2 salary: " + salaryReportVisitor.getReportDepartment());
    }

    private static Company buildCompany() {
        Contractor c1d1 = new Contractor("director", 3000);
        Contractor c2d1 = new Contractor("manager", 2000);
        Contractor c3d1 = new Contractor("dev", 1500);
        Contractor c4d1 = new Contractor("qa", 1300);
        Contractor c5d1 = new Contractor("aqa", 1400);
        Department d1 = new Department("d1", Arrays.asList(c1d1, c2d1, c3d1, c4d1, c5d1));
        Contractor c1d2 = new Contractor("director", 3300);
        Contractor c2d2 = new Contractor("manager", 2300);
        Contractor c3d2 = new Contractor("dev", 1800);
        Contractor c4d2 = new Contractor("qa", 1500);
        Contractor c5d2 = new Contractor("aqa", 1600);
        Department d2 = new Department("d2", Arrays.asList(c1d2, c2d2, c3d2, c4d2, c5d2));
        return new Company(Arrays.asList(d1, d2));
    }

}