package module5.task1;

import org.junit.Assert;
import org.junit.Test;

public class MinMaxValueTest {
    final int[] intArray = new int[]{4, 2, -1, 0};

    @Test(timeout = 1000)
    public void testGetMax() {
        final int result = MinMaxValue.getMax(intArray);
        Assert.assertEquals(4, result);
    }

    @Test(timeout = 1000)
    public void testGetMin() {
        final int result = MinMaxValue.getMin(intArray);
        Assert.assertEquals(-1, result);
    }

    @Test(timeout = 1000, expected = NullPointerException.class)
    public void testNullArray() { // это хорошо, что ты такой тест написала, но в коде надо обрабатывать ситуации, которые
        //могут привести к такому эксепшену. Например при приеме в параметрах массива, первым делом, проверить его длину на ноль.
        final int result = MinMaxValue.getMin(null);
        Assert.assertEquals(-1, result);
    }

}
