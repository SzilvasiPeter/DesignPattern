package decoratorPattern.starbuzz;

public class DarkRoast extends Beverage {

    public DarkRoast(Size size) {
        super.size = size;
        description = "Dark Roast Coffe";
    }

    public DarkRoast() {
        description = "Dark Roast Coffe";
    }

    @Override
    public double cost() {
        return .99 + addCostBySize();
    }
}
