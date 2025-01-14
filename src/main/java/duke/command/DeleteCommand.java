package duke.command;

import duke.stack.CallStack;
import duke.task.TaskList;
import duke.exception.InvalidTaskNumberException;

/**
 * Represents a command that
 * will execute deletion to the tasklist
 */
public class DeleteCommand extends Command {
    private final int index;

    public DeleteCommand(int index) {
        this.index = index;
    }

    @Override
    public String executeCommand(TaskList taskList, CallStack callStack) throws InvalidTaskNumberException {
        callStack.pushState(taskList);
        return taskList.remove(index);
    }
}
