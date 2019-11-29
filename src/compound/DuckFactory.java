package compound;

public class DuckFactory extends AbstractDuckFactory {
    @Override
    public Quackable CreateMallardDuck() {
        return new MallardDuck();
    }

    @Override
    public Quackable CreateReadHeadDuck() {
        return new ReadheadDuck();
    }

    @Override
    public Quackable CreateDuckCall() {
        return new DuckCall();
    }

    @Override
    public Quackable CreateRubberDuck() {
        return new RubberDuck();
    }
}
