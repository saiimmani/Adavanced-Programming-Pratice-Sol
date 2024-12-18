import java.util.Random;

class RandomNumberGenerator extends Thread {
    public void run() {
        Random rand = new Random();
        while (true) {
            int number = rand.nextInt(100);
            System.out.println("Generated Number: " + number);
            if (number % 2 == 0) {
                new SquareThread(number).start();
            } else {
                new CubeThread(number).start();
            }
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                System.out.println(e);
            }
        }
    }
}

class SquareThread extends Thread {
    int number;

    SquareThread(int number) {
        this.number = number;
    }

    public void run() {
        System.out.println("Square of " + number + ": " + (number * number));
    }
}

class CubeThread extends Thread {
    int number;

    CubeThread(int number) {
        this.number = number;
    }

    public void run() {
        System.out.println("Cube of " + number + ": " + (number * number * number));
    }
}

public class MultiThreadEvenOdd {
    public static void main(String[] args) {
        new RandomNumberGenerator().start();
    }
}