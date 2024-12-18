class ProducerConsumer {
    private int data;
    private boolean valueSet = false;

    // Producer produces a value
    public synchronized void produce(int value) {
        // Wait if the value is already produced but not consumed
        while (valueSet) {
            try {
                wait();
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt(); // Restore the interrupted status
                e.printStackTrace();
            }
        }
        data = value;
        System.out.println(Thread.currentThread().getName() + " Produced: " + data);
        valueSet = true;
        notify(); // Notify consumer that the value is ready
    }

    // Consumer consumes a value
    public synchronized void consume() {
        // Wait if no value is produced yet
        while (!valueSet) {
            try {
                wait();
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt(); // Restore the interrupted status
                e.printStackTrace();
            }
        }
        System.out.println(Thread.currentThread().getName() + " Consumed: " + data);
        valueSet = false;
        notify(); // Notify producer that the value is consumed
    }
}

// Producer thread
class Producer extends Thread {
    ProducerConsumer pc;

    Producer(ProducerConsumer pc) {
        this.pc = pc;
    }

    public void run() {
        for (int i = 1; i <= 5; i++) {
            pc.produce(i);
        }
    }
}

// Consumer thread
class Consumer extends Thread {
    ProducerConsumer pc;

    Consumer(ProducerConsumer pc) {
        this.pc = pc;
    }

    public void run() {
        for (int i = 1; i <= 5; i++) {
            pc.consume();
        }
    }
}

public class ProducerConsumerProblem {
    public static void main(String[] args) {
        ProducerConsumer pc = new ProducerConsumer();
        Producer producer = new Producer(pc);
        Consumer consumer = new Consumer(pc);

        // Setting names for easier debugging
        producer.setName("Producer");
        consumer.setName("Consumer");

        // Start the threads
        producer.start();
        consumer.start();

        // Ensure both threads complete before terminating the program
        try {
            producer.join();
            consumer.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
