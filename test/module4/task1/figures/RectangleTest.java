package module4.task1.figures;

import org.junit.Assert;
import org.junit.Test;

public class RectangleTest {

    @Test(timeout = 1000)
    public void testRectangleGetSquare() {
        int a = 2;
        int b = 3;
        Rectangle rectangle = new Rectangle(a, b);
        final double result = rectangle.getSquare();

        Assert.assertEquals(a * b, result, 0.0);
    }
}
