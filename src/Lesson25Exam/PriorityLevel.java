package Lesson25Exam;

public enum PriorityLevel {
    LOW (4),
    MEDIUM(8),
    HIGH(100);
    int hours;

    PriorityLevel(int hours) {
        this.hours = hours;
    }

    public int getHours() {

        return hours;
    }
}
