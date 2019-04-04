package factoryPattern.pizza.defaultStyle;

public class CheesePizza extends Pizza {

    public CheesePizza() {
        name = "Cheese Pizza";
        toppings.add(Toppings.CHEESE);
    }

    @Override
    public void bake() {
        System.out.println("Bake for 25 minutes at 350");
    }
}
