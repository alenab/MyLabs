package module4.task1.figures;

public class Rectangle extends Figure {

    private int sideA;
    private int sideB;

    public Rectangle(int a, int b) {
        sideA = a;
        sideB = b;
    }

    @Override
    double getSquare() {
        return sideA * sideB;
    }
}
