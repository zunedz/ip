package duke.task.tasks;


public class ToDo extends Task {
    public ToDo(String taskName) {
        super(taskName);
    }

    public ToDo(String taskName, boolean isDone) {
        super(taskName, isDone);
    }

    @Override
    public String toString() {
        return "[T]" + super.toString();
    }

    @Override
    public String encode() {
        return "T <> " + super.encode() + "\n";
    }

    @Override
    public ToDo cloneSelf() {
        return new ToDo(getTaskName(), isDone());
    }
}
