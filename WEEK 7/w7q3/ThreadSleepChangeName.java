public class ThreadSleepChangeName extends Thread {
    public void run() {
        try {
            Thread.sleep(5000);
            setName("ChangedThreadName");
            System.out.println("Thread name changed to: " + getName());
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        ThreadSleepChangeName t = new ThreadSleepChangeName();
        t.start();
    }
}