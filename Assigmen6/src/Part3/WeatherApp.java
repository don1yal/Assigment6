package Part3;

public class WeatherApp {
    private WeatherService weatherAdapter;

    public WeatherApp(WeatherService adapter) {
        this.weatherAdapter = adapter;
    }

    public void displayWeather(String city) {
        WeatherData weather = weatherAdapter.getWeather(city);
        System.out.println("Weather in " + city + ":");
        System.out.println("Temperature: " + weather.temperatureCelsius + "°C");
        System.out.println("Humidity: " + weather.humidityPercentage + "%");
        System.out.println("Pressure: " + weather.airPressure + " hPa");
    }
}
