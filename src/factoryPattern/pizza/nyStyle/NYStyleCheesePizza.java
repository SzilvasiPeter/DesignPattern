package factoryPattern.pizza.nyStyle;

import factoryPattern.pizza.defaultStyle.CheesePizza;
import factoryPattern.pizza.defaultStyle.Pizza;
import factoryPattern.pizza.defaultStyle.Toppings;

public class NYStyleCheesePizza extends CheesePizza implements NyStylePizza {

    public NYStyleCheesePizza() {
        name = nyName + name;
        dough = nyDough;
        sauce = nySauce;
    }
}
