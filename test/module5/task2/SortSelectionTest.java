package module5.task2;

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;

public class SortSelectionTest {

    @Test
    public void testGetSort() {
        int[] testArray = new int[]{5, -1, 3, 6};
        int[] expected = testArray.clone();
        Arrays.sort(expected);
        final int[] result = SortSelection.getSort(testArray);

        Assert.assertArrayEquals(expected, result);
    }
}
