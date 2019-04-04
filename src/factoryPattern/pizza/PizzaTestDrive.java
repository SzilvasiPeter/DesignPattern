package factoryPattern.pizza;

import factoryPattern.pizza.defaultStyle.Pizza;
import factoryPattern.pizza.defaultStyle.Toppings;

public class PizzaTestDrive {
    public static void main(String[] args) {
        PizzaStore nyStore = new NYStylePizzaStore();
        PizzaStore chicagoStore = new ChicagoStylePizzaStore();

        Pizza pizza = nyStore.orderPizza(Toppings.CHEESE);
        System.out.println("Ethan ordered a " + pizza.getName() + "\n");

        pizza = chicagoStore.orderPizza(Toppings.CLAM);
        System.out.println("Joel ordered a " + pizza.getName() + "\n");

    }
}
