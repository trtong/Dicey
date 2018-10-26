import java.util.HashMap;

public class Bins {
    private HashMap<Integer, Integer> results;
    int min = 0;
    int max = 0;
    // creates an array of required length
    // increments the array @ index roll properly

    public Bins(int min, int max) {
        this.min = min;
        this.max = max;

        this.results = new HashMap<Integer, Integer>();

        for (int i = min; i <= max; i++) {
            this.results.put(i, 0);
        }
    }

    public HashMap getHashMap() {
        return this.results;
    }
}
