package edu.jose.list.basicOperations;

import java.util.ArrayList;
import java.util.List;

public class TaskList {
    private List<Task> taskList;

    public TaskList() {
        this.taskList = new ArrayList<>();
    }

    public void addTask(String description) {
        Task task = new Task(description);
        taskList.add(task);
    }

    public void removeTask(String description) {
        taskList.removeIf(task -> task.getDescription().equalsIgnoreCase(description));
    }

    public int getTotalNumberOfTasks() {
        return taskList.size();
    }

    public void getTaskDescriptions() {
            System.out.println(taskList);
    }

    public static void main(String[] args) {
        TaskList taskList = new TaskList();
        taskList.addTask("Task One");
        taskList.addTask("Task Two");

        System.out.println("Total tasks: " + taskList.getTotalNumberOfTasks());
        taskList.getTaskDescriptions();

        taskList.removeTask("Task One");
        System.out.println("After removing 'Task One':");
        taskList.getTaskDescriptions();
    }
}
