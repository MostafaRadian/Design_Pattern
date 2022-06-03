package observe.company;

import java.util.ArrayList;
import java.util.List;

public class Subject {
    private final List<Observer> observers = new ArrayList<Observer>();
    private String notification;

    public String getNotification() {
        return notification;
    }

    public void setNotification(String notification) {
        this.notification = notification;
        notify_All_Observers();
    }

    public void addObserver(Observer newObserver) {
        this.observers.add(newObserver);
    }

    public void notify_All_Observers() {
        for (Observer observer : this.observers)
            observer.update();

    }
}
