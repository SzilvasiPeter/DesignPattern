package decoratorPattern.starbuzz;

public class HouseBlend extends Beverage {

    public HouseBlend(Size size) {
        super.size = size;
        description = "House Blend Coffe";
    }

    public HouseBlend() {
        description = "House Blend Coffe";
    }

    @Override
    public double cost() {
        return .89 + addCostBySize();
    }
}
