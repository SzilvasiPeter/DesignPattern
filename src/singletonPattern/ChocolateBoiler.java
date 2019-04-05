package singletonPattern;

public class ChocolateBoiler {

    private boolean empty;
    private boolean boiled;
    private volatile static ChocolateBoiler instance;

    private ChocolateBoiler() {
        this.empty = true;
        this.boiled = false;
    }

    public static synchronized ChocolateBoiler getInstance(){
        if(instance == null){
            synchronized (ChocolateBoiler.class) {
                if (instance == null) {
                    instance = new ChocolateBoiler();
                }
            }
        }

        return instance;
    }

    public void fill(){
        if(!isEmpty()){
            empty = false;
            boiled = false;
            System.out.println("Fill the boiler with a milk/chocolate mixture");
        }
    }

    public void drain(){
        if(!isEmpty() && isBoiled()){
            System.out.println("Drain the boiled milk and chocolate");
            empty = true;
        }
    }

    public void boil(){
        if(!isEmpty() && !isBoiled()){
            System.out.println("Bring the contents to a boil");
            boiled = true;
        }
    }

    private boolean isEmpty() {
        return empty;
    }

    private boolean isBoiled() {
        return boiled;
    }
}
