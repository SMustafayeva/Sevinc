package Lesson9.Lecture;

public class Author {
    String name;
    int birthYear;

    @Override
    public String toString() {
        return "Author:" + name +
                " (BirthYear: " + birthYear +
                ')';
    }
}
