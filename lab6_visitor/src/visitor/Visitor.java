package visitor;

import entity.Company;
import entity.Department;

public interface Visitor {

    void reportDepartment(Department department);
    void reportCompany(Company company);

    Integer getReportDepartment();
    Integer getReportCompany();
}
