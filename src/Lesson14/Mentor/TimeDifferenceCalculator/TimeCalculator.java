package Lesson14.Mentor.TimeDifferenceCalculator;

public class TimeCalculator {
    public void calculateDifference(int hour1, int minute1, int hour2, int minute2) {

        if (hour1 < 0 || hour1 > 23 || minute1 < 0 || minute1 > 59 ||
                hour2 < 0 || hour2 > 23 || minute2 < 0 || minute2 > 59) {
            System.out.println("Invalid time format");
        } else {
            int totalMinute1 = hour1 * 60 + minute1;
            int totalMinute2 = hour2 * 60 + minute2;
            int difference = totalMinute2 - totalMinute1;

            int hourD = Math.abs(difference) / 60;
            int minuteD = Math.abs(difference) % 60;
            if (hourD < 0 || minuteD < 0) {
                int hour = Math.abs(hourD);
                int minute = Math.abs(minuteD);
                System.out.println("There is " + hour + " hour " + minute + " minutes difference.");
            } System.out.println("There is " + hourD + " hour " + minuteD + " minutes difference.");
        }
    }

    public void calculateDifference(String time1, String time2) {
        String[] part1 = time1.split(":");
        String[] part2 = time2.split(":");

        int hour1 = Integer.parseInt(part1[0]);
        int minute1 = Integer.parseInt(part1[1]);
        int hour2 = Integer.parseInt(part2[0]);
        int minute2 = Integer.parseInt(part2[1]);
        calculateDifference(hour1, minute1, hour2, minute2);

    }
}



