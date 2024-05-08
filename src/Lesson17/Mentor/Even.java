package Lesson17.Mentor;

public class Even {
    private static volatile int number = 1;
    private static final Object lock = new Object();

    public static void main(String[] args) {
        Thread even = new Thread(() -> {
            synchronized (lock) {

                for (int number = 1; number <= 10; number += 2) {
                    lock.notifyAll();
                    System.out.println("Even number: " + number);
                    try {
                        lock.wait(200);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        });
        Thread odd = new Thread(() -> {
            synchronized (lock) {

                for (int number = 2; number <= 10; number += 2) {
                    lock.notifyAll();
                    System.out.println("Odd number: " + number);
                    try {
                        lock.wait(200);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        });
        even.start();
        odd.start();
    }
}
