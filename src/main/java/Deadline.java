import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Deadline extends Task {

    protected LocalDate by;

    public Deadline(String description) throws DukeException {
        super(description.substring(8),"deadline");
        this.by = LocalDate.parse(description.substring(description.indexOf("/")+4));
        this.setType("deadline");

    }

    @Override
    public String toString() {
        return "[D]" + super.toString() + " (by: " + by.format(DateTimeFormatter.ofPattern("MMM d yyyy")) + ")";
    }
}