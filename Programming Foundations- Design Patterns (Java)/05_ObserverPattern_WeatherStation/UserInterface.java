public class UserInterface implements Observer {
    private int temperature; 
    private int windSpeed;
    private int pressure;
    private Subject weatherStation; 

    public UserInterface(Subject weatherStation) {
        this.weatherStation = weatherStation;
        weatherStation.addObserver(this);
    }

    public void update(int temperature, int windSpeed, int pressure) {
        this.temperature = temperature;
        this.windSpeed = windSpeed;
        this.pressure = pressure;
        display();
    }

    public void display() {
        System.out.println("User Interface: " + 
                           " - temperature=" + temperature + "\t" + 
                           " - wind speed=" + windSpeed +  "\t" + 
                           " - pressure=" + pressure);
    }  
}
