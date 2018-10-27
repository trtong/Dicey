public class Simulation {

    int dice = 0;
    int tosses = 0;
    Dice simulationDie;
    Bins simulationBins;

    public Simulation(int numberofDie, int numberOfTosses) {
        this.dice = numberofDie;
        this.tosses = numberOfTosses;

        simulationDie = new Dice(numberofDie);

        simulationBins = new Bins(this.dice, this.dice * 6);

        for (int i = 0; i < numberOfTosses; i++) {
            int key = simulationDie.tossAndSum();
            if (simulationBins.hasKey(key)) {
                simulationBins.incrementValue(key);
            }
        }
    }
}