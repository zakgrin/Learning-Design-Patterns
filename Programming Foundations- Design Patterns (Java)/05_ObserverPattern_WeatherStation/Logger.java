public class Logger implements Observer {
    private int temperature; 
    private int windSpeed;
    private int pressure;
    private Subject weatherStation; 

    public Logger(Subject weatherStation) {
        this.weatherStation = weatherStation;
        weatherStation.addObserver(this);
    }

    public void update(int temperature, int windSpeed, int pressure) {
        this.temperature = temperature;
        this.windSpeed = windSpeed;
        this.pressure = pressure;
        log();
    }

    public void log() {
        System.out.println("Log: " + 
                           " - temperature=" + temperature + "\t" + 
                           " - wind speed=" + windSpeed +  "\t" + 
                           " - pressure=" + pressure);
    }    
}
