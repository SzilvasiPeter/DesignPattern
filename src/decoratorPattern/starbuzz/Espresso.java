package decoratorPattern.starbuzz;

public class Espresso extends Beverage {

    public Espresso(Size size) {
        super.size = size;
        description = "Espresso";
    }

    public Espresso() {
        description = "Espresso";
    }

    @Override
    public double cost() {
        return 1.99 + addCostBySize();
    }
}
