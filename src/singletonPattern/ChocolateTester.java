package singletonPattern;

public class ChocolateTester {
    public static void main(String[] args) {
        ChocolateBoiler chocolateBoiler = ChocolateBoiler.getInstance();

        chocolateBoiler.fill();
        chocolateBoiler.boil();
        chocolateBoiler.drain();
    }
}
