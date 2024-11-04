package org.Brix101;


public class Main {

    public static void main(String[] args) {
        TaskManager taskManager = new TaskManager();

        taskManager.addTask(
                new Task("Task 1", "This is the first task", false)
        );
        taskManager.addTask(
                new Task("Task 2", "This is the first task", false)
        );
        taskManager.addTask(
                new Task("Task 3", "This is the first task", false)
        );
        taskManager.addTask(
                new Task("Task 4", "This is the first task", false)
        );


        for(Task task: taskManager.listTasks()){
            System.out.println(task.toStringTask());
        }

    }
}