package compound;

public class QuackCounter implements Quackable {
    Quackable duck;
    private static int numberOfQuack;
    QuackObservable observable;

    public QuackCounter(Quackable duck) {
        observable = new Observable(this);
        this.duck = duck;
    }

    @Override
    public void Quack() {
        notifyObservers();
        duck.Quack();
        numberOfQuack++;
    }

    public static int GetQuacks(){
        return numberOfQuack;
    }

    @Override
    public void registerObserver(Observer observer) {
        duck.registerObserver(observer);
    }

    @Override
    public void notifyObservers() {
        duck.notifyObservers();
    }
}
