package decoratorPattern.starbuzz;

public class Decaf extends Beverage {

    public Decaf(Size size) {
        super.size = size;
        description = "Decaf Coffe";
    }

    public Decaf() {
        description = "Decaf Coffe";
    }

    @Override
    public double cost() {
        return 1.05 + addCostBySize();
    }
}
