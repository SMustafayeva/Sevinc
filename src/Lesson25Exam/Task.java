package Lesson25Exam;

public class Task implements Comparable {
    String text;
    PriorityLevel priority;

    public Task(String text, int hours) {
        this.text = text;
        if (hours <= 4){
            System.out.println("Priority is low");
        } else if (hours > 8){
            System.out.println("Priority is high");
        } else {
            System.out.println("Priority is medium");
        }
        this.priority = priority;
    }
    public PriorityLevel getPriority() {
        return priority;
    }
    public String getText() {
        return text;
    }
    @Override
    public String toString() {
        return "Task{" +
                "text='" + text + '\'' +
                ", priority=" + priority +
                '}';
    }
    @Override
    public int compareTo(Object o) {
      return priority.hours;
 //      return Integer.compare(this.priority, priority.getHours());;
    }
}
