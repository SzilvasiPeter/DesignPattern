package compound.MVC;

public class HeartTestDrive {
    public static void main(String[] args) {
        HeartModel heartModel = new HeartModel();
        IController model = new HeartController(heartModel);
    }
}
