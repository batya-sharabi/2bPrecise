package organization;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;


@RestController
public class OrganizationController {

    private List<Employee> list = new ArrayList<>();

    private void getInitialListOfEmployee() {
        Employee employee1 = new Manager("BB", "Natanyahu", "Consolidation");
        Employee employee2 = new Manager("Ganz", "lapid", "blue-white");
        Employee employee3 = new Employee("Moshe", "feiglin", "Identity");
        Employee employee4 = new Employee("Ivet", "Liberman", "Israel-home");
        Employee employee5 = new Employee("Moshe", "Kachlon", "All-of-us");
        Employee employee6 = new Employee("Avi", "Gabay", "Labor");
        Employee employee7 = new Employee("Tamar", "Zandberg", "Vigour");
        Employee employee8 =  new Manager("Zibur", "Rahav", "Supreme");
        list.add(employee1);
        list.add(employee6);
        list.add(employee2);
        list.add(employee3);
        list.add(employee4);
        list.add(employee5);
        list.add(employee7);
        list.add(employee8);
        addSubordinate(employee8,employee1);
        addSubordinate(employee8,employee2);
        addSubordinate(employee1,employee4);
        addSubordinate(employee1,employee5);
        addSubordinate(employee1,employee3);
        addSubordinate(employee2,employee6);
        addSubordinate(employee2,employee7);

        Task taskBB = new Task("reduce cost of living", parseDate("2019-02-18"), parseDate("2019-06-18"));

        Task taskBB2 = new Task("Iran Iran!!", parseDate("2018-01-19"), parseDate("2018-03-19"));

        Task taskGanz = new Task("reduce cost of living", parseDate("2019-06-12"), parseDate("2019-09-03"));

        Task taskGanz2 = new Task("reduce rockets", parseDate("2018-10-12"), parseDate("2018-12-20"));

        Task taskfeig = new Task("go green!", parseDate("2019-03-12"), parseDate("2019-05-24"));

        employee1.task(taskBB);
        employee1.task(taskBB2);
        employee2.task(taskGanz);
        employee2.task(taskGanz2);
        employee3.task(taskfeig);


    }

    public static Date parseDate(String date) {
        try {
            return new SimpleDateFormat("yyyy-MM-dd").parse(date);
        } catch (ParseException e) {
            return null;
        }
    }

    public static void addSubordinate(Employee manager, Employee Subordinate){
        if (manager.getClass().equals(Manager.class)){
            Manager man = (Manager) manager;
            man.addEmployee(Subordinate);
        }
    }

    @CrossOrigin(origins = "http://localhost:4200")
    @RequestMapping("/getEmployees")
    public List<Employee> getEmployees() {
        if (list.isEmpty()) {
            getInitialListOfEmployee();
        }
        return list;
    }
}
	

