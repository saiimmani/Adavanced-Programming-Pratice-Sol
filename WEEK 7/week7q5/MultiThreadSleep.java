public class MultiThreadSleep extends Thread {
    public void run() {
        try {
            for (int i = 1; i <= 5; i++) {
                System.out.println(Thread.currentThread().getName() + " sleeping for 1 sec");
                Thread.sleep(1000);
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        MultiThreadSleep t1 = new MultiThreadSleep();
        t1.setName("Thread1");
        MultiThreadSleep t2 = new MultiThreadSleep();
        t2.setName("Thread2");
        
        t1.start();
        t2.start();
    }
}