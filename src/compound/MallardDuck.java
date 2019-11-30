package compound;

public class MallardDuck implements Quackable {
    QuackObservable observable;

    public MallardDuck(){
        observable = new Observable(this);
    }

    @Override
    public void Quack() {
        System.out.println("Quack");
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
        return "MallardDuck";
    }
}
