package Lesson10;

public class HeapMemoryExample {
        public static void main(String[] args) {
            Student student1 = new Student("Alice"); // Object created in heap memory
            Student student2 = new Student("Bob"); // Another object in heap memory
            System.out.println("Student 1: " + student1.name);
            System.out.println("Student 2: " + student2.name);
        }
    }
