package module4.task2;

import org.junit.Assert;
import org.junit.Test;

public class TemperatureConverterTest {

    @Test(timeout = 1000)
    public void testFromCelsiusToFahrenheit() {
        final double celsius = 10;
        Assert.assertEquals(celsius * 1.8 + 32, TemperatureConverter.fromCelsiusToFahrenheit(10), 0.0);
    }

    @Test(timeout = 1000)
    public void testFromFahrenheitToCelsius() {
        final double fahrenheit = 50;
        Assert.assertEquals((fahrenheit - 32) * 5 / 9, TemperatureConverter.fromFahrenheitToCelsius(50), 0.0);
    }
}


