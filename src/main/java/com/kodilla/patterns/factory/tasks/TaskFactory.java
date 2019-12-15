package com.kodilla.patterns.factory.tasks;
public class TaskFactory {
    public static final String DRIVING = "DRIVING";
    public static final String PAINTING = "PAINTING";
    public static final String SHOPPING = "SHOPPING";
    public final Task makeTask(final String taskClass) {
        switch (taskClass) {
            case DRIVING:
                return new DrivingTask("Drive","Somewhere","Car");
            case PAINTING:
                return new PaintingTask("Picture","Blue","Shape");
            case SHOPPING:
                return new ShoppingTask("Shopping","Stock",100);
            default:
                return null;
        }
    }
}
