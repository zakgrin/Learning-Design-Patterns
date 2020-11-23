public interface Subject {
    public void addObserver(Observer observer);
    public void removeObserver(Observer observer);
    public void setTemperature(int temperature);
    public void setWindSpeed(int windSpeed);
    public void setPressure(int pressure);
    public void notifyObservers();
}
