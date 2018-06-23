package Observer;

/**
 * Created by Anton on 08.06.2018.
 */
public class Orcs implements WeatherObserver{


    @Override
    public void update(WeatherType currentWeather) {
        switch (currentWeather){
            case COLD:
                System.out.println("Orc is dripping");
                break;
            case SUNNY:
                System.out.println("Orc is blinding");
                break;
            case WINDY:
                System.out.println("Orc catch cold");
                break;
        }
    }
}
