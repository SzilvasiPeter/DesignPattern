package compound;

import java.util.ArrayList;


public class Flock implements Quackable {
    ArrayList<Quackable> myDucks = new ArrayList<Quackable>();
    QuackObservable observable;

    public void Add(Quackable duck){
        observable = new Observable(this);
        myDucks.add(duck);
    }

    @Override
    public void Quack() {
        for (Quackable duck : myDucks) {
            duck.Quack();
        }
    }

    @Override
    public void registerObserver(Observer observer) {
        for(QuackObservable duck : myDucks){
            duck.registerObserver(observer);
        }
    }

    @Override
    public void notifyObservers() { }
}
