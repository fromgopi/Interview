package patterns.behavioral.observer;

public class CricketData {

    int runs, wickets;
    float overs;

    DisplayCurrentScore currentScore;
    DisplayAverageScore averageScore;

    public CricketData(DisplayCurrentScore currentScore, DisplayAverageScore averageScore) {
        this.currentScore = currentScore;
        this.averageScore = averageScore;
    }

    // Get latest runs from stadium
    private int getLatestRuns()
    {
        // return 90 for simplicity
        return 100;
    }

    // Get latest wickets from stadium
    private int getLatestWickets()
    {
        // return 2 for simplicity
        return 2;
    }

    // Get latest overs from stadium
    private float getLatestOvers()
    {
        // return 10.2 for simplicity
        return (float)10.2;
    }

    public void dataChanged(){
        runs = getLatestRuns();
        wickets = getLatestWickets();
        overs = getLatestOvers();

        currentScore.update(runs, wickets, overs);
        averageScore.update(runs, wickets, overs);

    }
}
