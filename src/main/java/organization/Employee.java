package organization;

import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicInteger;

public class Employee {
    protected static final AtomicInteger count = new AtomicInteger(0);
    protected final int id;
    protected String firstName;
    protected String lastName;
    protected String position;
    protected int managerID;
    protected ArrayList<Task> tasks;

    public Employee(String firstName, String lastName, String position) {
        id = count.incrementAndGet();
        this.firstName = firstName;
        this.lastName = lastName;
        this.position = position;
        tasks = new ArrayList<Task>();
        managerID=0;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getPosition() {
        return position;
    }

    public void task(Task tas){
        tasks.add(tas);
    }

    public ArrayList<Task> getTasks() { return tasks; }
}
