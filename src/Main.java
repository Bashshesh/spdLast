public class Main {
    public static void main(String[] args) {

        WeatherStation weatherStation = new WeatherStation();
        WeatherDisplay display1 = new WeatherDisplay("Display 1");
        WeatherDisplay display2 = new WeatherDisplay("Display 2");

        weatherStation.addObserver(display1);
        weatherStation.addObserver(display2);

        WeatherFactory sunnyFactory = new SunnyWeatherFactory();
        WeatherFactory rainyFactory = new RainyWeatherFactory();

        Weather sunnyWeather = sunnyFactory.createWeather();
        Weather rainyWeather = rainyFactory.createWeather();

        weatherStation.setWeather(sunnyWeather.getCondition());
        weatherStation.setWeather(rainyWeather.getCondition());

    }

}