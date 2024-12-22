package A14_Cricbuzz.ScoreUpdater;

import A14_Cricbuzz.Inning.BallDetails;

public interface ScoreUpdaterObserver {

    public void update(BallDetails ballDetails);
}
