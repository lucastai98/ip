public class Event extends Task{

    private String dateTime;

    public Event(String description,String dateTime)  {
        super(description);
        this.dateTime = dateTime;
        this.setType("event");

    }

    @Override
    public String toString() {
        return "[E]" + super.toString()+" (at: " + dateTime + ")";
    }


}