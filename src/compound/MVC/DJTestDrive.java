package compound.MVC;

public class DJTestDrive {
    public static void main(String[] args) {
        IBeatModel model = new BeatModel();
        IController controller = new BeatController(model);
    }
}
