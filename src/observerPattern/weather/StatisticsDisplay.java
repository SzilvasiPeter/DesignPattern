package observerPattern.weather;

import java.util.ArrayList;

public class StatisticsDisplay implements Observer, DiplayElement{

    private ArrayList<Float> tempList;
    private Subject weatherData;

    public StatisticsDisplay(WeatherData weatherData) {
        this.tempList = new ArrayList<Float>();
        this.weatherData = weatherData;
        weatherData.registerObserver(this);
    }

    @Override
    public void display() {
        System.out.println("Avg/Max/Min temperature: " + avg() + "/" + max() + "/" + "/" + min());
    }

    private float min() {
        int minIndex = 0;
        for(int i = 1; i < tempList.size(); i++){
            if(tempList.get(minIndex) > tempList.get(i)){
                minIndex = i;
            }
        }

        return tempList.get(minIndex);
    }

    private float max() {
        int maxIndex = 0;
        for(int i = 1; i < tempList.size(); i++){
            if(tempList.get(maxIndex) < tempList.get(i)){
                maxIndex = i;
            }
        }

        return tempList.get(maxIndex);
    }

    private float avg() {
        float count = 0;
        for(int i = 0; i < tempList.size(); i++) {
            count += tempList.get(i);
        }

        return count / tempList.size();
    }

    @Override
    public void update(float temp, float humidity, float pressure) {
        this.tempList.add(temp);
        display();
    }
}
