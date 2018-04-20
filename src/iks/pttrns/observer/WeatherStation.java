package iks.pttrns.observer;

public class WeatherStation {
    public static void main(String[] args) {
        WeatherDataNew weatherData = new WeatherDataNew();

        CurrentConditionDisplay conditionDisplay = new CurrentConditionDisplay(weatherData);

        weatherData.addObserver(conditionDisplay);
        weatherData.setMeasurements(15, 96, 123);
        weatherData.setMeasurements(17, 95, 120);
    }
}
