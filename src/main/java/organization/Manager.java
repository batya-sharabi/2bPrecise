package organization;

import java.util.ArrayList;

public class Manager extends Employee{
    private ArrayList<Employee> employees;
    private ArrayList<Report> reports;

    public Manager(String firstName, String lastName, String position) {
        super(firstName, lastName, position);
        employees = new ArrayList<Employee>();
        reports = new ArrayList<Report>();
    }

    public ArrayList<Employee> getEmployees() {
        return employees;
    }

    public ArrayList<Report> getReports() {
        return reports;
    }

    public void addEmployee(Employee emp){
        employees.add(emp);
    }

    public void addReport(Report rep){
        reports.add(rep);
    }
}
