package visitor;

import entity.Company;
import entity.Contractor;
import entity.Department;

public class SalaryReportVisitor implements Visitor {

    private Integer reportDepartment;
    private Integer reportCompany;

    @Override
    public void reportDepartment(Department department) {
        reportDepartment = department.getContractors().stream().map(Contractor::getSalary).reduce(0, Integer::sum);
    }

    @Override
    public void reportCompany(Company company) {
        reportCompany = company.getDepartments().stream().flatMap(d -> d.getContractors().stream()).map(Contractor::getSalary).reduce(0, Integer::sum);
    }

    @Override
    public Integer getReportDepartment() {
        return reportDepartment;
    }

    @Override
    public Integer getReportCompany() {
        return reportCompany;
    }
}
