package factoryPattern.pizza.defaultStyle;

public class VeggiePizza extends Pizza {

    public VeggiePizza() {
        name = "Veggie Pizza";
        toppings.add(Toppings.VEGGIE);
    }

    @Override
    public void bake() {
        System.out.println("Bake for 20min at 350");
    }
}
