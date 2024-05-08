package Lesson17.Mentor;

public class Odd {
    private static volatile int number = 1;
    private static Object lock = new Object();

    public static void main(String[] args) {
        Thread odd = new Thread(() -> {
            synchronized (lock) {
                for(int number = 1; number<= 10; number++){
                    if (number % 2 != 0) {
                        System.out.println("Odd number: " + number);
                    }
                }
                try {
                    lock.wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });
        odd.start();
    }
}
