package iks.pttrns.observer;

import java.util.Observable;
import java.util.Observer;

public class CurrentConditionDisplay implements Observer, DisplayElement {

    private float temperature;
    private float humidity;
    private float pressure;
    private Observable observable;

    public CurrentConditionDisplay(Observable observable) {
        this.observable = observable;
    }


    @Override
    public void display() {
        System.out.printf("Current condition: temperature: %f, humidity: %f pressure: %f \n",
                temperature, humidity, pressure);
    }

    @Override
    public void update(Observable o, Object arg) {

        if (o instanceof WeatherDataNew) {
            WeatherDataNew weatherData = (WeatherDataNew) o;
            this.temperature = weatherData.getTemperature();
            this.humidity = weatherData.getHumidity();
            this.pressure = weatherData.getPressure();
            display();
        }
    }
}
