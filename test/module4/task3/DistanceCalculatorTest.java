package module4.task3;

import org.junit.Assert;
import org.junit.Test;

public class DistanceCalculatorTest {

    @Test(timeout = 1000)
    public void testCalculateDistance() {
        int x1 = 0;
        int y1 = 0;
        int x2 = 0;
        int y2 = 1;

        final double result = DistanceCalculator.calculateDistance(x1, x2, y1, y2); //идея тебе подсказывает правильно,
        //что ты перепутала последовательность параметров - у тебя принимает этот метод так  - x1, y1, x2, y2.
        Assert.assertEquals((x2 - x1) * (x2 - x1) + (y2 - y1) * (y2 - y1), result, 0.001);

    }
}
