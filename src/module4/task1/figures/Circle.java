package module4.task1.figures;

public class Circle implements Figure {

    private int radius;

    public Circle(int radius) {
        this.radius = radius;
    }

    @Override
    public double getSquare() {
        return Math.PI * radius * radius;
    }
}
