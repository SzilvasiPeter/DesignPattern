package compound;

public class ReadheadDuck implements Quackable {
    QuackObservable observable;

    public ReadheadDuck(){
        observable = new Observable(this);
    }

    @Override
    public void Quack() {
        notifyObservers();
        System.out.println("Quack");
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
        return "ReadheadDuck";
    }
}
