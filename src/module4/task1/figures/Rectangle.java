package module4.task1.figures;

public class Rectangle implements Figure {

    private int sideA;
    private int sideB;

    public Rectangle(int a, int b) {
        sideA = a;
        sideB = b;
    }

    @Override
    public double getSquare() {
        return sideA * sideB;
    }
}
