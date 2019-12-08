package compound.MVC;

public class HeartController implements IController {
    IHeartModel heartAdapter;
    DJView view;

    public HeartController(IHeartModel heartAdapter) {
        this.heartAdapter = heartAdapter;
        view = new DJView(this, new HeartAdapter(heartAdapter));
        view.createView();
        view.createControls();
        view.disableStopMenuItem();
        view.disableStartMenuItem();
    }

    @Override
    public void start() {

    }

    @Override
    public void stop() {

    }

    @Override
    public void increaseBPM() {

    }

    @Override
    public void decreaseBPM() {

    }

    @Override
    public void setBPM(int bpm) {

    }
    }
