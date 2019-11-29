package compound;

public class QuackCounter implements Quackable {
    Quackable duck;
    private static int numberOfQuack;

    public QuackCounter(Quackable duck) {
        this.duck = duck;
    }

    @Override
    public void Quack() {
        duck.Quack();
        numberOfQuack++;
    }

    public static int GetQuacks(){
        return numberOfQuack;
    }
}
