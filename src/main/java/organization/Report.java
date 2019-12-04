package organization;
import java.util.Date;

public class Report {
    private String text;
    private Date date;

    public Report(String text, Date date) {
        this.text = text;
        this.date = date;
    }

    public String getText() {
        return text;
    }

    public Date getDate() {
        return date;
    }
}
