package organization;
import java.util.Date;

public class Task {
    private String text;
    private Date assignDate;
    private Date dueDate;

    public Task(String text, Date assignDate, Date dueDate) {
        this.text = text;
        this.assignDate = assignDate;
        this.dueDate = dueDate;
    }


}
