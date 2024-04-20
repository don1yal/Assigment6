package Part3;

public class OpenWeatherMapAPI {
    public OpenWeatherMapData getWeatherDetails(String location) {
        return new OpenWeatherMapData("Cloudy", 295.15, 1013, 75);
    }
}
