public class ToDo extends Task{

    public ToDo(String description) throws DukeException{
        super(description.substring(4),"todo");
        this.setType("todo");
    }

    @Override
    public String toString() {
        return "[T]" + super.toString();
    }

}