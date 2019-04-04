package factoryPattern.pizza;

import factoryPattern.pizza.chicagoStyle.ChicagoStyleCheesePizza;
import factoryPattern.pizza.chicagoStyle.ChicagoStyleClamPizza;
import factoryPattern.pizza.chicagoStyle.ChicagoStylePepperoniPizza;
import factoryPattern.pizza.chicagoStyle.ChicagoStyleVeggiePizza;
import factoryPattern.pizza.defaultStyle.Pizza;
import factoryPattern.pizza.defaultStyle.Toppings;

public class ChicagoStylePizzaStore extends PizzaStore {

    @Override
    public Pizza createPizza(Toppings type) {
        if(type == Toppings.CHEESE){
            return new ChicagoStyleCheesePizza();
        }else if(type == Toppings.PEPPERONI){
            return new ChicagoStylePepperoniPizza();
        }else if(type == Toppings.CLAM){
            return new ChicagoStyleClamPizza();
        }else if(type == Toppings.VEGGIE){
            return new ChicagoStyleVeggiePizza();
        }else {
            return null;
        }
    }
}
