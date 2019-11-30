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

        Flock flockOfDucks = new Flock();
        flockOfDucks.Add(readHeadDuck);
        flockOfDucks.Add(duckCall);
        flockOfDucks.Add(rubberDuck);
        flockOfDucks.Add(goose);

        Flock flockOfMallardDucks = new Flock();

        Quackable mallard1 = new MallardDuck();
        Quackable mallard2 = new MallardDuck();
        Quackable mallard3 = new MallardDuck();
        Quackable mallard4 = new MallardDuck();

        flockOfMallardDucks.Add(mallard1);
        flockOfMallardDucks.Add(mallard2);
        flockOfMallardDucks.Add(mallard3);
        flockOfMallardDucks.Add(mallard4);

        flockOfDucks.Add(flockOfMallardDucks);

        System.out.println("\nDuck simulator");
        System.out.println("\nWhole Flock simulation");
        simulate(flockOfDucks);

        System.out.println("\nMallard Flock simulation");
        simulate(flockOfMallardDucks);

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
