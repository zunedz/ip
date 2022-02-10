package duke.command;

import duke.task.TaskList;
import duke.exception.InvalidTaskNumberException;

public class DeleteCommand extends Command {
    private final int index;

    public DeleteCommand(int index) {
        this.index = index;
    }

    @Override
    public String executeCommand(TaskList taskList) throws InvalidTaskNumberException {
        return taskList.remove(index);
    }
}