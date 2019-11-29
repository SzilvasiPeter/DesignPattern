package compound;

public class CountingDuckFactory extends AbstractDuckFactory {
    @Override
    public Quackable CreateMallardDuck() {
        return new QuackCounter(new MallardDuck());
    }

    @Override
    public Quackable CreateReadHeadDuck() {
        return new QuackCounter(new ReadheadDuck());
    }

    @Override
    public Quackable CreateDuckCall() {
        return new QuackCounter(new DuckCall());
    }

    @Override
    public Quackable CreateRubberDuck() {
        return new QuackCounter(new RubberDuck());
    }
}