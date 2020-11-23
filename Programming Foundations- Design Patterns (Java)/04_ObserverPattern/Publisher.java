import java.util.ArrayList;

public class Publisher implements Subject { // Concrete Subject
    
    private ArrayList<Observer> observers;
    private int value = 0;

    public Publisher() {
        observers = new ArrayList<Observer>();
    }

    public void registerObserver(Observer observer) { // Concrete Subscriber
        if (observers.contains(observer)) {
            System.out.println("already registered!");
        }
        else {
            observers.add(observer);
            System.out.println("registered!");
        }
    }

    public void removeObserver(Observer observer) {
        if (observers.contains(observer)) {
            int index = observers.indexOf(observer);
            observers.remove(index);
            System.out.println("removed!");
        }
        else {
            System.out.println("not registered!");
        }
    }

    public void notifyObservers() {
        for (Observer observer: observers) {
            observer.update(value);
        }
    }

    public void setValue(int value) {
        this.value = value;
        notifyObservers();
    }
}
