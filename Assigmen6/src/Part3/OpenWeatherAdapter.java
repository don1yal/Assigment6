package Part3;

public class OpenWeatherAdapter implements WeatherService {
    private OpenWeatherMapAPI api;

    public OpenWeatherAdapter() {
        api = new OpenWeatherMapAPI();
    }

    @Override
    public WeatherData getWeather(String location) {
        OpenWeatherMapData data = api.getWeatherDetails(location);
        return new WeatherData(
                data.description,
                kelvinToCelsius(data.temperature),
                data.pressure,
                data.humidity
        );
    }

    private double kelvinToCelsius(double kelvin) {
        return kelvin - 273.15;
    }
}
