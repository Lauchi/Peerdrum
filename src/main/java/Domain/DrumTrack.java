package Domain;

import java.util.ArrayList;
import java.util.List;

public class DrumTrack {
    private List<TimeStep> steps;

    public DrumTrack() {
        this.steps = new ArrayList<>();
        for (int i = 0; i <16; i++) {
            steps.add(new TimeStep());
        }
    }

    public List<TimeStep> getSteps() {
        return steps;
    }

    public void setStep(int stepNo, boolean isSet) {
        this.steps.get(stepNo).isSet = isSet;
    }
}
