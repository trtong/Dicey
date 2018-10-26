import org.junit.Test;

public class BinsTest {

    Dice testDice;
    Bins testBins;


    /**
     * test to make?
     * get bin # { how many in that bin? }
     *
     */
    public BinsTest() {

        testDice = new Dice(2);
        testBins = new Bins(2, 12);

    }


    @Test
    public void testHashMap() {

        for (int key: testBins.results.keySet()) {

        }


    }
}
