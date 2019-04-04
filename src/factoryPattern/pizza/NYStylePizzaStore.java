package factoryPattern.pizza;

import factoryPattern.pizza.defaultStyle.Pizza;
import factoryPattern.pizza.defaultStyle.Toppings;
import factoryPattern.pizza.nyStyle.NYStyleCheesePizza;
import factoryPattern.pizza.nyStyle.NYStyleClamPizza;
import factoryPattern.pizza.nyStyle.NYStylePepperoniPizza;
import factoryPattern.pizza.nyStyle.NYStyleVeggiePizza;

public class NYStylePizzaStore extends PizzaStore {

    @Override
    public Pizza createPizza(Toppings type) {
        if (type == Toppings.CHEESE) {
            return new NYStyleCheesePizza();
        } else if (type == Toppings.PEPPERONI) {
            return new NYStylePepperoniPizza();
        } else if (type == Toppings.CLAM) {
            return new NYStyleClamPizza();
        } else if (type == Toppings.VEGGIE) {
            return new NYStyleVeggiePizza();
        }else{
            return null;
        }
    }
}
