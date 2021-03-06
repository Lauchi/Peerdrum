package Domain;

import java.util.ArrayList;
import java.util.List;

public class DrumSet {
    public List<DrumTrack> tracks;

    public DrumSet() {
        tracks = new ArrayList<>();
        tracks.add(new DrumTrack());
        tracks.add(new DrumTrack());
        tracks.add(new DrumTrack());
        tracks.add(new DrumTrack());
    }

    public void setStep(int noteNo, int stepNo, boolean isSet) {
        DrumTrack drumTrack = tracks.get(noteNo);
        drumTrack.setStep(stepNo, isSet);
    }
}
