package module4.task1.figures;

import org.junit.Assert;
import org.junit.Test;

public class CircleTest {

    @Test(timeout = 1000)
    public void testCircleGetSquare() {
        int radius = 2;
        Circle circle = new Circle(radius);
        final double result = circle.getSquare();// чет не понимаю, зачем резалт делать файнал? объясни, плиз.

        Assert.assertEquals(radius * radius * Math.PI, result, 0.000001); //что дает третий параметр? расскажи.
    }
}
