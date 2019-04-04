package factoryPattern.pizza.chicagoStyle;

import factoryPattern.pizza.defaultStyle.PepperoniPizza;
import factoryPattern.pizza.defaultStyle.Pizza;

public class ChicagoStylePepperoniPizza extends PepperoniPizza implements ChicagoStylePizza {

    public ChicagoStylePepperoniPizza() {
        name = chicagoName + name;
        dough = chicagoDough;
        sauce = chicagoSauce;
    }

    @Override
    public void cut(){
        System.out.println("Cutting Pizza into square slices");
    }
}
