package factoryPattern.pizza.chicagoStyle;

import factoryPattern.pizza.defaultStyle.ClamPizza;
import factoryPattern.pizza.defaultStyle.Pizza;

public class ChicagoStyleClamPizza extends ClamPizza implements ChicagoStylePizza {

    public ChicagoStyleClamPizza() {
        name = chicagoName + name;
        dough = chicagoDough;
        sauce = chicagoSauce;
    }
}
