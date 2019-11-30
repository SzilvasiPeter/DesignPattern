package compound;

public class GooseAdapter implements Quackable {
    QuackObservable observable;
    private Goose goose;

    public GooseAdapter(Goose goose) {
        observable = new Observable(this);
        this.goose = goose;
    }

    @Override
    public void Quack() {
        notifyObservers();
        goose.Honk();
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
        return "GooseAdapter";
    }
}
