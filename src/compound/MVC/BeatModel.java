package compound.MVC;

import javax.sound.midi.MetaEventListener;
import javax.sound.midi.MetaMessage;
import javax.sound.midi.Sequencer;
import java.util.ArrayList;

public class BeatModel implements IBeatModel, MetaEventListener {
    Sequencer sequencer;
    ArrayList<BeatObserver> beatObservers = new ArrayList<BeatObserver>();
    ArrayList<BMPObserver> bmpObservers = new ArrayList<BMPObserver>();
    int bmp = 90;

    public void initialize(){
        setUpMidi();
        buildTrackStart();
    }

    @Override
    public void on() {
        sequencer.start();
        setBPM(90);
    }

    @Override
    public void off() {
        sequencer.stop();
        setBPM(0);
    }

    @Override
    public void setBPM(int bpm) {
        this.bmp = bmp;
        sequencer.setTempoInBPM(getBPM());
        notifyBMPObservers();
    }

    @Override
    public int getBPM() {
        return bmp;
    }

    public void beatEvent(){
        notifyBeatObservers();
    }

    @Override
    public void registerObserver(BeatObserver beatObserver) {
        if(beatObserver != null)
            this.beatObservers.add(beatObserver);
    }

    @Override
    public void removeObserver(BeatObserver beatObserver) {
        if(beatObserver != null){
            int beatObserverId = beatObserver.getId();
            this.beatObservers.remove(beatObserverId);
        }
    }

    @Override
    public void registerObserver(BMPObserver bmpObserver) {
        if(bmpObserver != null){
            this.bmpObservers.add(bmpObserver);
        }
    }

    @Override
    public void removeObserver(BMPObserver bmpObserver) {
        if(bmpObserver != null){
            int bmpObserverId = bmpObserver.getId();
            this.beatObservers.remove(bmpObserverId);
        }
    }

    @Override
    public void meta(MetaMessage meta) {

    }
}
