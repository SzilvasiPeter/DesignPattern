package compound;

public class DuckCall implements Quackable {
    QuackObservable observable;

    public DuckCall() {
        observable = new Observable(this);
    }

    @Override
    public void Quack() {
        System.out.println("Kwak");
        notifyObservers();
    }

    @Override
    public void registerObserver(Observer observer) {
        observable.registerObserver(observer);
    }

    @Override
    public void notifyObservers() {
        observable.notifyObservers();
    }

    @Override
    public String toString() {
        return "DuckCall";
    }
}
