package com.kodilla.patterns.factory.tasks;
public class PaintingTask implements Task {
    String taskName;
    String color;
    String whatToPaint;
    Boolean executeTask=false;
    public PaintingTask(String taskName, String color, String whatToPaint) {
        this.taskName = taskName;
        this.color = color;
        this.whatToPaint = whatToPaint;
    }
    @Override
    public void executeTask() {
        executeTask=true;
    }
    @Override
    public String getTaskName() {
        return taskName;
    }
    @Override
    public Boolean isTaskExecuted() {
        return executeTask;
    }
}
