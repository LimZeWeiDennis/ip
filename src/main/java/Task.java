//Adapted from CS2103T website's Task class
public class Task {
    protected String description;
    protected boolean isDone;

    public Task (String description){
        this.description = description;
        this.isDone = false;
    }

    public String getStatusIcon() {
        return (isDone ? "\u2713" : "\u2718");
    }

    public void markAsDone(){
        this.isDone = true;
    }

    public String getTask() {
        return this.description;
    }

    public boolean getStatus(){
        return isDone;
    }

    public String toString(){
        return "[" + getStatusIcon() + "] " + getTask();
    }
}