package Observer;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Anton on 08.06.2018.
 */
public class Weather {
    WeatherType currentWeather;
    List<WeatherObserver> observers ;

    public Weather() {
        currentWeather = WeatherType.COLD;
        System.out.println("Current weather is "+currentWeather);
        observers  = new ArrayList<>();
    }
    public void addObserver(WeatherObserver obs){
        observers.add(obs);
    }
    public void removeObserver(WeatherObserver obs){
        observers.remove(obs);
    }
    public WeatherType changeWeather(){
        WeatherType [] list = WeatherType.values();
        currentWeather = list[(currentWeather.ordinal()+1)%list.length];
        System.out.println("Weather is changed to " + currentWeather);
        return currentWeather;
    }
    public void notifyObservers(){
        for (WeatherObserver obs : observers) {
            obs.update(currentWeather);
        }
    }
}
