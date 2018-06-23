package Observer;

/**
 * Created by Anton on 08.06.2018.
 */
public class App {
    public static void main(String[] args) {
        Weather weather = new Weather();
        WeatherObserver observer = new Orcs();
        weather.addObserver(observer);
        weather.notifyObservers();
        weather.changeWeather();
        weather.notifyObservers();
    }
}
