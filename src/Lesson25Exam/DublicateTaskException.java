package Lesson25Exam;

import java.util.List;

public class DublicateTaskException extends Exception{
    private List<Task> tasks;
    public void addTask( Task task) throws Throwable {
        for (Task t : tasks) {
            if (t == (Task) tasks) {
                throw new Exception("Task already exists");
            }
        }
    }
}
