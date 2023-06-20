// Design a program to demonstrate multi-threading using Thread Class.

class Thread1 extends Thread {
    public void run() {
        try {
            Thread.sleep(2000);
            System.out.println("Thread 1");
        } catch (InterruptedException e) {
            System.out.println(e);
        }
    }
}

class Thread2 extends Thread {
    public void run() {
        try {
            Thread.sleep(2000);
            System.out.println("Thread 2");
        } catch (InterruptedException e) {
            System.out.println(e);
        }
    }
}

public class MultiThread {
    public static void main(String[] args) {
        long startTime = System.currentTimeMillis();
        Thread1 t1 = new Thread1();
        Thread2 t2 = new Thread2();
        t1.start();
        t2.start();
        try {
            t1.join();
            t2.join();
        } catch (InterruptedException e) {
            System.out.println(e);
        }
        long endTime = System.currentTimeMillis();
        long totalTime = endTime - startTime;
        System.out.println("Total time taken: " + totalTime);
    }
}