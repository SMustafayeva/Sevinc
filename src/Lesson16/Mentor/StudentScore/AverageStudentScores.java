package Lesson16.Mentor.StudentScore;

public class AverageStudentScores extends  Exception {
    int numberOfStudents;
    public AverageStudentScores(String message) {
        try {
            if (numberOfStudents < 0) {
                throw new NumberFormatException("Students number must be positive");
            }
        } catch (NumberFormatException e){
            System.out.println("Students number must be positive");
        }
    }
}
