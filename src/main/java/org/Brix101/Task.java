package org.Brix101;

public class Task {
    private String name;
    private String description;
    private boolean isComplete;

    public Task(String name, String description, boolean isComplete) {
        this.name = name;
        this.description = description;
        this.isComplete = isComplete;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public boolean isComplete() {
        return isComplete;
    }

    public void setComplete(boolean complete) {
        isComplete = complete;
    }

    public String toStringTask(){
        return "{ \"name\": \"" + name + "\", \"description\": \"" + description + "\", \"isComplete\": " + isComplete + " }";
    }
}
