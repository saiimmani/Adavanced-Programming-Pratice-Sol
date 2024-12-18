// src/Main.java
import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        // Create a list of tasks
        List<Task> tasks = new ArrayList<>();
        tasks.add(new Task(2));
        tasks.add(new Task(3));
        tasks.add(new Task(4));
        tasks.add(new Task(5));

        // Create a TaskProcessor and process all tasks
        TaskProcessor taskProcessor = new TaskProcessor(tasks);
        taskProcessor.processAllTasks();
    }
}
