package factoryPattern.pizza.nyStyle;

import factoryPattern.pizza.defaultStyle.ClamPizza;
import factoryPattern.pizza.defaultStyle.Pizza;

public class NYStyleClamPizza extends ClamPizza implements NyStylePizza {

    public NYStyleClamPizza() {
        name = nyName + name;
        dough = nyDough;
        sauce = nySauce;
    }
}
