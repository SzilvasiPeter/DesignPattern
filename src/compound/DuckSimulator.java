package compound;

public class DuckSimulator {
    public static void main(String[] args) {
        DuckSimulator duckSimulator = new DuckSimulator();
        AbstractDuckFactory duckFactory = new CountingDuckFactory();
        GooseFactory gooseFactory = new GooseFactory();

        duckSimulator.simulate(duckFactory, gooseFactory);
    }

    private void simulate(AbstractDuckFactory duckFactory, GooseFactory gooseFactory) {
        Quackable mallardDuck = duckFactory.CreateMallardDuck();
        Quackable readHeadDuck = duckFactory.CreateReadHeadDuck();
        Quackable duckCall = duckFactory.CreateDuckCall();
        Quackable rubberDuck = duckFactory.CreateRubberDuck();
        Quackable goose = gooseFactory.createGoose();

        System.out.println("\nDuck simulator");
        
        simulate(mallardDuck);
        simulate(readHeadDuck);
        simulate(duckCall);
        simulate(rubberDuck);
        simulate(goose);

        System.out.println("The ducks quacked " + QuackCounter.GetQuacks() + " times");
    }

    private void simulate(Quackable duck) {
        duck.Quack();
    }
}
