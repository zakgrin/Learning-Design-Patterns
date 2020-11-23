import java.util.ArrayList;

public class WeatherStation implements Subject {
    private ArrayList<Observer> observers;
    private int temperature;
    private int windSpeed;
    private int pressure;

    public WeatherStation() {
        this.observers = new ArrayList<Observer>();
    }
    public void addObserver(Observer observer) {
        if (observers.contains(observer)) {
            System.out.println("already added!");
        }
        else {
            observers.add(observer);
            System.out.println("added!");
        }
    }
    public void removeObserver(Observer observer) {
        if (observers.contains(observer)) {
            int index = observers.indexOf(observer);
            observers.remove(index);
            System.out.println("removed!");
        }
        else {
            System.out.println("not added!");
        }
    }
    public void setTemperature(int temperature) {
        this.temperature = temperature;
        notifyObservers();
    }
    public void setWindSpeed(int windSpeed) {
        this.windSpeed = windSpeed;
        notifyObservers();
    }
    public void setPressure(int pressure) {
        this.pressure = pressure;
        notifyObservers();
    }
    public void notifyObservers() {
        for (Observer observer: observers) {
            observer.update(temperature, windSpeed, pressure);
        }
    }

}
