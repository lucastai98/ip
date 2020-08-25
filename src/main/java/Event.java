import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Event extends Task{

    private LocalDate date;
    private String time;

    public Event(String description) throws DukeException {
        super(description.substring(5),"event");
        this.date = LocalDate.parse(description.substring(description.indexOf("/")+4,description.indexOf("/")+14));
        this.time = description.substring(description.indexOf("/")+14);
        this.setType("event");

    }

    @Override
    public String toString() {
        return "[E]" + super.toString()+" (at: " + date.format(DateTimeFormatter.ofPattern("MMM d yyyy"))+
                " "+this.time+ ")";
    }


}
