import org.junit.Assert;
import org.junit.Test;

import java.util.Set;

public class BinsTest {

    Dice testDice;
    Bins testBins;

    public BinsTest() {

        testDice = new Dice(2);
        testBins = new Bins(2, 12);

    }

    @Test
    public void testHashMap() {

        // Given
        int[] expected = {2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12};
        boolean keyMatches = false;
        boolean expectedKey = true;
        int i = 0;

        // When
        Set<Integer> actual = testBins.results.keySet();

        for (int key: actual) {
            if (key == expected[i]) {
                keyMatches = true;
                break;
            }
            i++;
        }

        // Then
        Assert.assertTrue(keyMatches);
    }
}
