package factoryPattern.pizza;

import factoryPattern.pizza.defaultStyle.Pizza;
import factoryPattern.pizza.defaultStyle.Toppings;

public abstract class PizzaStore {

    public Pizza orderPizza(Toppings type){
        Pizza pizza;

        pizza = createPizza(type);

        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();

        return pizza;
    }

    public abstract Pizza createPizza(Toppings type);
}
