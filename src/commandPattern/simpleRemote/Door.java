package commandPattern.simpleRemote;

public class Door {
    private String location;

    public Door(String location) {
        this.location = location;
    }

    public void on(){
        System.out.println(location + " door open");
    }

    public void off(){
        System.out.println(location + " door close");
    }

    public void stop(){
        System.out.println(location + " door stop");
    }
}
