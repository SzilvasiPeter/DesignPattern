package compound;

public class RubberDuck implements Quackable {
    QuackObservable observable;

    public RubberDuck(){
        observable = new Observable(this);
    }

    @Override
    public void Quack() {
        notifyObservers();
        System.out.println("Squeak");
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
        return "RubberDuck";
    }
}
