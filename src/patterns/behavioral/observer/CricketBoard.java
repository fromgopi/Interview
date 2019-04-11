package patterns.behavioral.observer;

public class CricketBoard {

    public static void main(String[] args) {

        DisplayAverageScore averageScore = new DisplayAverageScore();
        DisplayCurrentScore currentScore = new DisplayCurrentScore();

        CricketData data = new CricketData(currentScore, averageScore);

        data.dataChanged();

    }
}
