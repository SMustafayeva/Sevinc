package Lesson25Exam;

import java.util.ArrayList;
import java.util.List;

public class TaskManager {
    List<Task> tasks;

    public TaskManager(List<Task> tasks) {
        this.tasks = tasks;
    }
    public void removeTask(String text) {
        tasks.removeIf(task -> task.getText().equals(text));
    }
}


