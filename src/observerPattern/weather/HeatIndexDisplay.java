package observerPattern.weather;

public class HeatIndexDisplay implements Observer, DiplayElement {

    private float heatIndex = 0.0f;
    private WeatherData weatherData;

    public HeatIndexDisplay(WeatherData weatherData) {
        this.weatherData = weatherData;
        weatherData.registerObserver(this);
    }

    @Override
    public void display() {
        System.out.println("Heat index is " + heatIndex);
    }

    @Override
    public void update(float temp, float humidity, float pressure) {
        heatIndex = computeHeatIndex(temp, humidity);
        display();
    }

    private float computeHeatIndex(float temp, float humidity) {
        float index = (float) (0.5 * (temp + 61.0 + ((temp-68.0)*1.2) + (humidity*0.094)));

        return index;
    }
}
