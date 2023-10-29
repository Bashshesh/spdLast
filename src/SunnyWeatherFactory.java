public class SunnyWeatherFactory implements WeatherFactory {
    @Override
    public Weather createWeather() {
        return new Weather("Sunny");
    }
}
