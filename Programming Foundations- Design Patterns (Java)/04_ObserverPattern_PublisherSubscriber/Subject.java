public interface Subject { // Publisher
    public void registerObserver(Observer observer); // Subscriber
    public void removeObserver(Observer observer);
    public void notifyObservers();
    public void setValue(int value);
}
