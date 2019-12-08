package compound.MVC;

public interface IHeartModel {
    int getHeartRate();
    void registerObserver(BeatObserver beatObserver);
    void removeObserver(BeatObserver beatObserver);
    void registerObserver(BPMObserver BPMObserver);
    void removeObserver(BPMObserver BPMObserver);
}
