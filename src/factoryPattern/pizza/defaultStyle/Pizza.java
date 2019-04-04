package factoryPattern.pizza.defaultStyle;

import java.util.ArrayList;

public abstract class Pizza {

    public String name;
    public String dough;
    public String sauce;
    public ArrayList<Toppings> toppings = new ArrayList<Toppings>();

    // Prepare differ one to another
    public void prepare(){
        System.out.println("Preparing " + name);
        System.out.println("Tossing dough " + dough);
        System.out.println("Adding sauce " + sauce);
        for(Toppings topping : toppings){
            System.out.println(" " + topping.toString());
        }
    }

    // Bake time alse differ one pizza to another
    public abstract void bake();

    // Cut is the same (differ cut by pizza's radius)
    public void cut(){
        System.out.println("Cutting the pizza into 8 slices");
    }

    // Box is the same (differ the pizza's radius)
    public void box(){
        System.out.print("Get Box, ");
        System.out.print("Put in the pizza, ");
        System.out.println("Close the Box");
    }

    public String getName() {
        return name;
    }
}
