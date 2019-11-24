package proxy;

public class GumballMachine {
    private String location;
    private int count;

    public int getCount() {
        return count;
    }


    public GumballMachine(String location, int count) {
        this.location = location;
        this.count = count;
    }

    public String getLocation() {
        return this.location;
    }
}