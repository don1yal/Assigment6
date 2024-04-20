package Part3;

public class WeatherClient {
    public static void main(String[] args) {
        WeatherService openWeatherAdapter = new OpenWeatherAdapter();

        WeatherApp appUsingOpenWeather = new WeatherApp(openWeatherAdapter);

        System.out.println("OpenWeatherMap API:");
        appUsingOpenWeather.displayWeather("New York");

    }
}
