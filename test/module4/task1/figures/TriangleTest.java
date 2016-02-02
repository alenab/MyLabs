package module4.task1.figures;

import org.junit.Assert;
import org.junit.Test;

public class TriangleTest {

    @Test(timeout = 1000)
    public void testTriangleGetSquare() {
        final int a = 2;
        final int b = 3;
        final int c = 4;
        Triangle triangle = new Triangle(a, b, c);
        final double result = triangle.getSquare();
        int perimeter = a + b + c;
        Assert.assertEquals(Math.sqrt(perimeter * (perimeter - a) * (perimeter - b) * (perimeter -c)), result, 0.000001);
    }
}
