package Part3;

public class WeatherData {
    String weatherDescription;
    double temperatureCelsius;
    int airPressure;
    int humidityPercentage;

    public WeatherData(String weatherDescription, double temperatureCelsius, int airPressure, int humidityPercentage) {
        this.weatherDescription = weatherDescription;
        this.temperatureCelsius = temperatureCelsius;
        this.airPressure = airPressure;
        this.humidityPercentage = humidityPercentage;
    }

    public String getWeatherDescription() {
        return weatherDescription;
    }

    public void setWeatherDescription(String weatherDescription) {
        this.weatherDescription = weatherDescription;
    }

    public double getTemperatureCelsius() {
        return temperatureCelsius;
    }

    public void setTemperatureCelsius(double temperatureCelsius) {
        this.temperatureCelsius = temperatureCelsius;
    }

    public int getAirPressure() {
        return airPressure;
    }

    public void setAirPressure(int airPressure) {
        this.airPressure = airPressure;
    }

    public int getHumidityPercentage() {
        return humidityPercentage;
    }

    public void setHumidityPercentage(int humidityPercentage) {
        this.humidityPercentage = humidityPercentage;
    }
}
