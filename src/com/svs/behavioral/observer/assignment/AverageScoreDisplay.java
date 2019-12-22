package com.svs.behavioral.observer.assignment;

class AverageScoreDisplay implements Observer {
    private float runRate;
    private int predictedScore;

    @Override
    public void update(int runs, int wickets, float overs) {
        this.runRate = (float) runs/overs;
        this.predictedScore = (int) (this.runRate * 50);
        display();
    }

    private void display() {
        System.out.println("\nAverage score display: \n" + "Run rate: " + runRate + "\nPredicted score: " + predictedScore);
    }
}
