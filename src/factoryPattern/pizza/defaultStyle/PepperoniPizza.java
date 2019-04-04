package factoryPattern.pizza.defaultStyle;

public class PepperoniPizza extends Pizza {

    public PepperoniPizza() {
        name = "Pepperoni Pizza";
        toppings.add(Toppings.PEPPERONI);
    }

    @Override
    public void bake() {
        System.out.println("Bake for 20 minutes at 350");
    }
}
