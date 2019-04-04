package factoryPattern.pizza.nyStyle;

import factoryPattern.pizza.defaultStyle.Pizza;
import factoryPattern.pizza.defaultStyle.VeggiePizza;

public class NYStyleVeggiePizza extends VeggiePizza implements NyStylePizza {

    public NYStyleVeggiePizza() {
        name = nyName + name;
        dough = nyDough;
        sauce = nySauce;
    }
}
