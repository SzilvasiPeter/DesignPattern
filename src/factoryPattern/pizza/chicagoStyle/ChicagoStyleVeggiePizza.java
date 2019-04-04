package factoryPattern.pizza.chicagoStyle;

import factoryPattern.pizza.defaultStyle.Pizza;
import factoryPattern.pizza.defaultStyle.VeggiePizza;

public class ChicagoStyleVeggiePizza extends VeggiePizza implements ChicagoStylePizza {

    public ChicagoStyleVeggiePizza() {
        name = chicagoName + name;
        dough = chicagoDough;
        sauce = chicagoSauce;
    }
}
