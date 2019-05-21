package commandPattern.simpleRemote;

public class RemoteControlTest {
    public static void main(String[] args) {
        SimpleRemoteControl remote = new SimpleRemoteControl();
        Light light = new Light("Garage");
        Door garageDoor = new Door("Garage");
        LightOnCommand lightOn = new LightOnCommand(light);
        GarageDoorOpenCommand garageOpen = new GarageDoorOpenCommand(light, garageDoor);
        remote.setCommand(lightOn);
        remote.setCommand(garageOpen);
        remote.buttonWasPressed();
    }
}
