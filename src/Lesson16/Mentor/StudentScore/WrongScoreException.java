package Lesson16.Mentor.StudentScore;

public class WrongScoreException extends Exception{
 int score;
    public WrongScoreException(String message) {
        if (score < 0 || score> 100){
            System.out.println("Wrong score input!!!");
        }
    }
}
