package compound;

import java.util.ArrayList;
import java.util.Iterator;

public class Flock implements Quackable {
    ArrayList<Quackable> myDucks = new ArrayList<Quackable>();

    public void Add(Quackable duck){
        myDucks.add(duck);
    }

    @Override
    public void Quack() {
        for (Quackable duck : myDucks) {
            duck.Quack();
        }
    }
}
