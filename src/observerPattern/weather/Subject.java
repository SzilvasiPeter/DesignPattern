package observerPattern.weather;

public interface Subject {
    public void registerObserver(Observer o);
    public void removeObeserver(Observer o);
    public void notifyObservers();
}
