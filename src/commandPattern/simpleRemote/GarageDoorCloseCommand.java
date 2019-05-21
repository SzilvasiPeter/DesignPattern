package commandPattern.simpleRemote;

public class GarageDoorCloseCommand implements Command{

    private Light light;
    private Door door;

    public GarageDoorCloseCommand(Light light, Door door) {
        this.light = light;
        this.door = door;
    }

    @Override
    public void execute() {
        light.off();
        door.off();
    }
}
