package threads;

class Task1 extends Thread {
    public void run() {
        System.out.println("Task1 start");

        for (int i=101; i<=199; i++) {
            System.out.println(i);
        }

        System.out.print("\nTask1 Done");
    }
}

class Task2 implements Runnable {
    public void run() {
        System.out.println("Task2 start");

        for (int i=201; i<=299; i++) {
            System.out.println(i);
        }

        System.out.print("\nTask2 Done");
    }

}

public class ThreadBasicRunner {
    public static void main(String[] args) throws InterruptedException {

        //Task1
        Task1 task1 = new Task1();
        task1.setPriority(10);
        task1.start(); //run은 Thread 실행이 되지 않음

        Task2 task2 = new Task2();
        Thread task2Thread = new Thread(task2);
        task2Thread.start();

        task1.join();
        task2Thread.join();

        for (int i=301; i<=399; i++) {
            System.out.println(i);
        }

        System.out.print("\nTask3 Done");
    }
}
