// src/TaskProcessor.java
import java.util.List;

public class TaskProcessor {

    private List<Task> tasks;

    public TaskProcessor(List<Task> tasks) {
        this.tasks = tasks;
    }

    // Method to process all tasks sequentially
    public void processAllTasks() {
        for (Task task : tasks) {
            task.processTask();
            // Simulate some processing time
            try {
                Thread.sleep(500); // 500 milliseconds delay between tasks
            } catch (InterruptedException e) {
                System.err.println("Task processing interrupted: " + e.getMessage());
            }
        }
    }
}
