package patterns.behavioral.observer;

public class DisplayAverageScore {

    private float runRate;
    private int predictedScore;

    public void update(int runs, int wickets, float overs)
    {
        this.runRate = (float)runs/overs;
        this.predictedScore = (int) (this.runRate * 50);
        display();
    }

    private void display()
    {
        System.out.println("\nAverage Score Display:\n" +
                "Run Rate: " + runRate +
                "\nPredictedScore: " + predictedScore);
    }
}
