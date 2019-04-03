package decoratorPattern.starbuzz;

public abstract class CondimentDecorator extends Beverage {

    public Beverage beverage;

    protected CondimentDecorator(Beverage beverage) {
        this.beverage = beverage;
    }

    public abstract String getDescription();

    public Size getSize(){
        return beverage.getSize();
    }

    public double addCostBySize(){
        if(beverage.getSize() == Size.TALL){
            return .025;
        } else if(beverage.getSize() == Size.GRANDE){
            return .05;
        } else if(beverage.getSize() == Size.VENTI){
            return .10;
        }
        return 0;
    }
}
