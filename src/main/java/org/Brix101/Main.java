package org.Brix101;

public class Main {

    public static void main(String[] args) {
        Task task = new Task("Task 1", "This is the first task", false);
        System.out.println("Name: " + task.getName() + "\nDescription: " + task.getDescription() + "\nIs complete: " + task.isComplete());

        TaskManager manager = new TaskManager();

    }
}