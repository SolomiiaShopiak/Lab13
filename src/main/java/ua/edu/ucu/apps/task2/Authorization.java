package ua.edu.ucu.apps.task2;

public class Authorization {
    public boolean authorize(Database db) {
        db.getUserData();
        return true;
    }
}
