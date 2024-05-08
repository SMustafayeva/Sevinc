package Lesson19.Lection;

public enum MonthEnum {
    JANUARY, FEBRUARY, MARCH, APRIL, MAY, JUNE, JULY, AUGUST, SEPTEMBER, OCTOBER, NOVEMBER, DECEMBER;

    public static String getSeason(MonthEnum month){
        switch (month){
            case DECEMBER,JANUARY,FEBRUARY:
                return "Winter";
            case MARCH,APRIL,MAY:
                return "Spring";
            case JUNE,JULY,AUGUST:
                return "Summer";
            case SEPTEMBER,OCTOBER,NOVEMBER:
                return "Autumn";

        } return "Invalid month";
    }
}