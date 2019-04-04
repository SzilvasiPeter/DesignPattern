package factoryPattern.pizza.defaultStyle;

public class ClamPizza extends Pizza {

    public ClamPizza() {
        name = "Clam Pizza";
        toppings.add(Toppings.CLAM);
    }

    @Override
    public void bake() {
        System.out.println("Bake for 30min at 350");
    }
}
