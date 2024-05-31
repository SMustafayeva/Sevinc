package Lesson22.Lection.ComparatorInterface;

import java.util.*;

public class StudentComparator {
    public static void main(String[] args) {
        List<Student> studentList = new ArrayList<>();
        studentList.add(new Student("Aydan",17,1));
        studentList.add(new Student("Aysel",21,3));
        studentList.add(new Student("Azer",22,4));
        studentList.add(new Student("Aziz",19,2));
        studentList.add(new Student("Ayten",20,3));
        studentList.add(new Student("Aylin",18,2));
        Collections.sort(studentList, new Comparator<Student>() {
            @Override
            public int compare(Student s1, Student s2) {
                return s1.grade-s2.grade;
            }
        });
        for(Student student : studentList){
            System.out.println(student);
        }
    }
}
