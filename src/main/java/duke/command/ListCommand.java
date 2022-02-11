package duke.command;

import duke.stack.CallStack;
import duke.task.TaskList;

public class ListCommand extends Command {
    @Override
    public String executeCommand(TaskList taskList, CallStack callStack) {
        return taskList.getTasks();
    }
}
