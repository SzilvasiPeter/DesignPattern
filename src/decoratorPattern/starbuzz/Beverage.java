package decoratorPattern.starbuzz;

public abstract class Beverage {
    protected Beverage() {
    }

    public enum Size { TALL, GRANDE, VENTI };

    Size size = Size.TALL;
    String description = "Unkonw beverage";

    public Beverage(Size size) {
        this.size = size;
    }

    public String getDescription(){
        return  description;
    }

    public Size getSize() {
        return size;
    }

    public void setSize(Size size) {
        this.size = size;
    }

    public abstract double cost();

    public double addCostBySize(){
        if(getSize() == Size.TALL){
            return .10;
        } else if(getSize() == Size.GRANDE){
            return .15;
        } else if(getSize() == Size.VENTI){
            return .20;
        }
        return 0;
    }
}
