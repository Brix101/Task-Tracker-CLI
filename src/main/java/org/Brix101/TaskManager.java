package org.Brix101;

import java.util.ArrayList;
import java.util.List;

public class TaskManager {
    private List<Task> tasks;

    public TaskManager (){
        tasks = new ArrayList<>();
    }

    public List<Task> listTasks(){
        return tasks;
    }

    public void addTask(Task task){
        tasks.add(task);
    }

    public void updateTask(int index, Task task){
        if (index >= 0 && index < tasks.size()){
            tasks.set(index, task);
        }
    }

    public void removeTask(int index){
        if (index >= 0 && index < tasks.size()){
            tasks.remove(index);
        }
    }
}
