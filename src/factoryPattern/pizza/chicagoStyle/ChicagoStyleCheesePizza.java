package factoryPattern.pizza.chicagoStyle;

import factoryPattern.pizza.defaultStyle.CheesePizza;
import factoryPattern.pizza.defaultStyle.Pizza;

public class ChicagoStyleCheesePizza extends CheesePizza implements ChicagoStylePizza {


    public ChicagoStyleCheesePizza() {
        name = chicagoName + name;
        dough = chicagoDough;
        sauce = chicagoSauce;
    }

}
