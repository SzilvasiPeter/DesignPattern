package commandPattern.simpleRemote;

public class GarageDoorOpenCommand implements Command {

    private Light light;
    private Door door;

    public GarageDoorOpenCommand(Light light, Door door) {
        this.light = light;
        this.door = door;
    }

    @Override
    public void execute() {
        light.on();
        door.on();
    }
}
