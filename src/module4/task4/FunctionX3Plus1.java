package module4.task4;

public class FunctionX3Plus1 extends CalculationIntegral {

    public FunctionX3Plus1(int min, int max) {
        super(min, max);
    }

    @Override
    public double function(int x) {
        return x * 3 + 1;
    }
}
