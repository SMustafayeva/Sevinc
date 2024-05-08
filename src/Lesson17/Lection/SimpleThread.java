package Lesson17.Lection;

public class SimpleThread {
    private static volatile int number = 1;
    private static Object lock = new Object();


    public static void main(String[] args) {
        Thread even = new Thread(() -> {
            synchronized (lock) {
                for(int number = 1; number<= 20; number++){
                    if (number % 2 == 0) {
                        System.out.println("Even number: " + number);
                    }
                } }

        });

        Thread odd = new Thread(() -> {
            synchronized (lock) {

                for(int number = 1; number<= 20; number++){
                    if (number % 2 != 0) {
                        System.out.println("Odd number: " + number);
                    }
                }
                lock.notifyAll();
//                try {
//                  //  lock.wait(200);
//
//                } catch (InterruptedException e) {
//                    e.printStackTrace();
//                }

            }
        });


        even.start();
        odd.start();
    }
}

