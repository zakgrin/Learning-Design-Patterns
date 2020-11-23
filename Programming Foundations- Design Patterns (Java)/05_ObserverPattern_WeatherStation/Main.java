public class Main {
    public static void main(String[] args) {

        Subject myWeatherStation = new WeatherStation();
        Observer logger = new Logger(myWeatherStation);
        myWeatherStation.setPressure(1);
        Observer userInterface = new UserInterface(myWeatherStation);
        Observer alertSystem = new AlertSystem(myWeatherStation);
        myWeatherStation.setTemperature(3);
        myWeatherStation.addObserver(logger);
        myWeatherStation.removeObserver(logger);
        myWeatherStation.addObserver(logger);
        myWeatherStation.setWindSpeed(2);
    }    
}
