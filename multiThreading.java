
class MyThread extends Thread {

    public void run() {
        for (int i = 1; i <= 5; ++i) {
            System.out.println(Thread.currentThread().getName() + " - " + i);

            try {
                Thread.sleep(200);
            } catch (InterruptedException error) {
                System.out.println("Thread interrupted: " + error.getMessage());
            }
        }
    }
}

public class multiThreading {

    public static void main(String[] args) {
        MyThread object1 = new MyThread();
        MyThread object2 = new MyThread();

        // thread start Thread class contains start method
        object1.start();
        object2.start();
    }
}
