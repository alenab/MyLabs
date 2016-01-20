package module4.task4;

import java.util.Random;

public abstract class CalculationIntegral {

    private Random random = new Random();
    private int a;
    private int b;

    public CalculationIntegral(int min, int max) {
        a = min;
        b = max;
    }

    public abstract double function(int x);

    public double calculate(int n) {
        int[] xValues = getRandomNumbersInBound(n);

        int sum = 0;
        for (int xValue : xValues) {
            sum += function(xValue);
        }

        return ((double) (b - a) / n) * sum;
    }

    private int[] getRandomNumbersInBound(int quantity) {
        int[] result = new int[quantity];
        for (int i = 0; i < result.length; i++) {
            result[i] = random.nextInt(b - a + 1) + a;
        }
        return result;
    }

}
