public class ThreadSleepReverse extends Thread {
    public void run() {
        for (int i = 5; i >= 1; i--) {
            try {
                Thread.sleep(6000);
                setName("Thread-" + i);
                System.out.println("Thread name changed to: " + getName());
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public static void main(String[] args) {
        ThreadSleepReverse t = new ThreadSleepReverse();
        t.start();
    }
}