package Lesson14.Mentor.TimeDifferenceCalculator;

public class TimeCalculator {
    public  void calculateDifference(int hour1, int minute1, int hour2, int minute2){
        int hour = hour2 - hour1;
        int minute = minute2 -  minute1;
        System.out.println("There is " + hour + "hour" + minute + "minutes difference." );
    }
    public  void calculateDifference(String time1, String time2){

    }
}
