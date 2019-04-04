package factoryPattern.pizza.nyStyle;

import factoryPattern.pizza.defaultStyle.PepperoniPizza;
import factoryPattern.pizza.defaultStyle.Pizza;

public class NYStylePepperoniPizza extends PepperoniPizza implements NyStylePizza {

    public NYStylePepperoniPizza() {
        name = nyName + name;
        dough = nyDough;
        sauce = nySauce;
    }
}
