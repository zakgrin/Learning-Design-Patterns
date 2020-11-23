public class AlertSystem implements Observer {
    private int temperature; 
    private int windSpeed;
    private int pressure;
    private Subject weatherStation; 

    public AlertSystem(Subject weatherStation) {
        this.weatherStation = weatherStation;
        weatherStation.addObserver(this);
    }

    public void update(int temperature, int windSpeed, int pressure) {
        this.temperature = temperature;
        this.windSpeed = windSpeed;
        this.pressure = pressure;
        alert();
    }

    public void alert() {
        System.out.println("Alert: " + 
                           " - temperature=" + temperature + "\t" + 
                           " - wind speed=" + windSpeed +  "\t" + 
                           " - pressure=" + pressure);
    }    
}
