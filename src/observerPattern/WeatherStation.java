package observerPattern;

import observerPattern.weather.*;

public class WeatherStation {

    public static void main(String[] args) {
//        weather.observer.WeatherData weatherData = new weather.observer.WeatherData();
        WeatherData weatherData = new WeatherData();

//        weather.observer.CurrentConditionsDisplay currentDisplay = new weather.observer.CurrentConditionsDisplay(weatherData);
        CurrentConditionsDisplay currentDisplay = new CurrentConditionsDisplay(weatherData);
        StatisticsDisplay statisticsDisplay = new StatisticsDisplay(weatherData);
//        weather.observer.ForecastDisplay forecastDisplay = new weather.observer.ForecastDisplay(weatherData);
        ForecastDisplay forecastDisplay = new ForecastDisplay(weatherData);
        HeatIndexDisplay heatIndexDisplay = new HeatIndexDisplay(weatherData);

        weatherData.setMeasurments(80, 65, 30.4f);
        weatherData.setMeasurments(82, 70, 29.2f);
        weatherData.setMeasurments(78, 90, 29.2f);
    }
}
