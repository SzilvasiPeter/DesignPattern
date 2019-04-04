package factoryPattern.pizza;

import factoryPattern.pizza.defaultStyle.*;

public class SimplePizzaFactory extends  PizzaStore{

    public Pizza createPizza(Toppings type){
        Pizza pizza = null;

        if(type == Toppings.CHEESE){
            pizza = new CheesePizza();
        }else if(type == Toppings.PEPPERONI){
            pizza = new PepperoniPizza();
        }else if(type == Toppings.CLAM){
            pizza = new ClamPizza();
        }else if(type == Toppings.VEGGIE){
            pizza = new VeggiePizza();
        }

        return pizza;
    }
}
