// src/Task.java
public class Task {
    private int number;

    public Task(int number) {
        this.number = number;
    }

    // Method to perform the calculation (square the number)
    public int calculate() {
        return number * number;
    }

    // Method to generate a report based on the result of the calculation
    public String generateReport(int result) {
        return "Task: Square of " + number + " is " + result;
    }

    // Process the task: perform the calculation and generate the report
    public void processTask() {
        int result = calculate();
        String report = generateReport(result);
        System.out.println(report);
    }
}
