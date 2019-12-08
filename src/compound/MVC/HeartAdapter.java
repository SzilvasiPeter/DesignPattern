package compound.MVC;

public class HeartAdapter implements IBeatModel {
    IHeartModel heartModel;

    public HeartAdapter(IHeartModel heartModel) {
        this.heartModel = heartModel;
    }

    @Override
    public void initialize() {

    }

    @Override
    public void on() {

    }

    @Override
    public void off() {

    }

    @Override
    public void setBPM(int bpm) {

    }

    @Override
    public int getBPM() {
        return heartModel.getHeartRate();
    }

    @Override
    public void registerObserver(BeatObserver beatObserver) {
        heartModel.registerObserver(beatObserver);
    }

    @Override
    public void removeObserver(BeatObserver beatObserver) {
        heartModel.registerObserver(beatObserver);
    }

    @Override
    public void registerObserver(BPMObserver BPMObserver) {
        heartModel.registerObserver(BPMObserver);
    }

    @Override
    public void removeObserver(BPMObserver BPMObserver) {
        heartModel.removeObserver(BPMObserver);
    }
}
