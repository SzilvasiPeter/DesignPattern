package compound.MVC;

import javax.sound.midi.*;
import java.util.ArrayList;

public class BeatModel implements IBeatModel, MetaEventListener {
    Sequencer sequencer;
    ArrayList<BeatObserver> beatObservers = new ArrayList<BeatObserver>();
    ArrayList<BPMObserver> BPMObservers = new ArrayList<BPMObserver>();
    int bmp = 90;
    Sequence sequence;
    private Track track;

    public void initialize(){
        setUpMidi();
        buildTrackAndStart();
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
        notifyBPMObservers();
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

    public void notifyBeatObservers() {
        for(int i = 0; i < beatObservers.size(); i++) {
            BeatObserver observer = (BeatObserver)beatObservers.get(i);
            observer.updateBeat();
        }
    }

    @Override
    public void removeObserver(BeatObserver beatObserver) {
        int i = beatObservers.indexOf(beatObserver);
        if (i >= 0) {
            beatObservers.remove(i);
        }
    }

    @Override
    public void registerObserver(BPMObserver BPMObserver) {
        if(BPMObserver != null){
            this.BPMObservers.add(BPMObserver);
        }
    }

    public void notifyBPMObservers() {
        for(int i = 0; i < BPMObservers.size(); i++) {
            BPMObserver observer = (BPMObserver)BPMObservers.get(i);
            observer.updateBPM();
        }
    }

    @Override
    public void removeObserver(BPMObserver BPMObserver) {
        int i = beatObservers.indexOf(BPMObserver);
        if (i >= 0) {
            beatObservers.remove(i);
        }
    }

    public void meta(MetaMessage message) {
        if (message.getType() == 47) {
            beatEvent();
            sequencer.start();
            setBPM(getBPM());
        }
    }

    public void setUpMidi() {
        try {
            sequencer = MidiSystem.getSequencer();
            sequencer.open();
            sequencer.addMetaEventListener(this);
            sequence = new Sequence(Sequence.PPQ,4);
            track = sequence.createTrack();
            sequencer.setTempoInBPM(getBPM());
            sequencer.setLoopCount(Sequencer.LOOP_CONTINUOUSLY);
        } catch(Exception e) {
            e.printStackTrace();
        }
    }

    public void buildTrackAndStart() {
        int[] trackList = {35, 0, 46, 0};

        sequence.deleteTrack(null);
        track = sequence.createTrack();

        makeTracks(trackList);
        track.add(makeEvent(192,9,1,0,4));
        try {
            sequencer.setSequence(sequence);
        } catch(Exception e) {
            e.printStackTrace();
        }
    }

    public void makeTracks(int[] list) {

        for (int i = 0; i < list.length; i++) {
            int key = list[i];

            if (key != 0) {
                track.add(makeEvent(144,9,key, 100, i));
                track.add(makeEvent(128,9,key, 100, i+1));
            }
        }
    }

    public MidiEvent makeEvent(int comd, int chan, int one, int two, int tick) {
        MidiEvent event = null;
        try {
            ShortMessage a = new ShortMessage();
            a.setMessage(comd, chan, one, two);
            event = new MidiEvent(a, tick);

        } catch(Exception e) {
            e.printStackTrace();
        }
        return event;
    }
}
