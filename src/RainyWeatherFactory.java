public class RainyWeatherFactory implements WeatherFactory {
    @Override
    public Weather createWeather() {
        return new Weather("Rainy");
    }
}
