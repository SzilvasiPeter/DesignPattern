package compound.MVC;

public interface IBeatModel {
    void initialize();
    void on();
    void off();
    void setBPM(int bpm);
    int getBPM();
    void registerObserver(BeatObserver beatObserver);
    void removeObserver(BeatObserver beatObserver);
    void registerObserver(BMPObserver bmpObserver);
    void removeObserver(BMPObserver bmpObserver);
}
